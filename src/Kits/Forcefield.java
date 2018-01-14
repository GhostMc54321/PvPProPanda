package Kits;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import Main.Main;
import Utilidades.KitAPI;

public class Forcefield implements Listener
{
  public List<Player> cooldownm = new ArrayList<>();
  public static ArrayList<Player> forcefield = new ArrayList<>();
  public static ArrayList<Player> forcefielddano = new ArrayList<>();
  
@EventHandler
  public void stomperApple(PlayerInteractEvent event)
  {
    final Player p = event.getPlayer();
    if ((event.getPlayer().getItemInHand().getType() == Material.IRON_FENCE) && 
      (KitAPI.getKit(p) == "Forcefield"))
    {
      if ((event.getAction() == Action.LEFT_CLICK_AIR) || 
        (event.getAction() == Action.LEFT_CLICK_BLOCK) || 
        (event.getAction() == Action.RIGHT_CLICK_BLOCK) || 
        (event.getAction() == Action.RIGHT_CLICK_AIR)) {
        event.setCancelled(true);
      }
      if (this.cooldownm.contains(p))
      {
        p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §FFORCEFIELD§c Ainda está em Cooldown!");
        return;
      }
      Location loc = p.getLocation();
      p.getWorld().playSound(loc, Sound.MAGMACUBE_WALK2, 5.0F, -5.0F);
      this.cooldownm.add(p);
      
      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable()
      {
        public void run()
        {
          Forcefield.forcefielddano.add(p);
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSeu kit §fFORCEFIELD§a Foi ativado!");
        }
      }, 0L);
      
      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable()
      {
        public void run()
        {
          Forcefield.forcefielddano.remove(p);
        }
      }, 300L);
      
      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable()
      {
        public void run()
        {
          Forcefield.this.cooldownm.remove(p);
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSeu Kit §fFORCEFIELD§a Saiu de Cooldown!");
          p.getWorld().playSound(p.getLocation(), Sound.BURP, 5.0F, 5.0F);
        }
      }, 1000L);
    }
  }
  
@EventHandler
  public void fraqueza(PlayerMoveEvent event)
  {
    Player p = event.getPlayer();
    if (forcefielddano.contains(p))
    {
      List<Entity> Local = p.getNearbyEntities(4.0D, 4.0D, 4.0D);
      for (Entity inimigos : Local)
      {
        Player local = (Player)inimigos;
        local.damage(3.0D);
        local.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê está perto de um §fFORCEFIELD§c, isso e um §fKIT§c, nao um §fHACK§c!");
        inimigos.setVelocity(new Vector(0.2D, 0.0D, 0.2D));
      }
    }
  }
}
