package Kits;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import API.CooldownAPI;
import Utilidades.KitAPI;


public class Thresh implements Listener{
	public static HashMap<String, Snowball> tiros = new HashMap<>();
	@EventHandler
	  public void disparar(PlayerInteractEvent e)
	  {
	    Player p = e.getPlayer();
	    if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) && 
	      (p.getItemInHand().getType() == Material.LEASH) && (KitAPI.getKit(p).equalsIgnoreCase("§eThresh"))) {
	
	        e.setCancelled(true);
	        p.updateInventory();
	    	if  (CooldownAPI.Cooldown.containsKey(p.getName())) {
			  	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §FTRESH§c Ainda está em Cooldown!");
			    
				return;
			}
	    	 CooldownAPI.addCooldown(p, 30);
	        Snowball tiro = (Snowball)p.launchProjectile(Snowball.class);
	        Vector vec = p.getLocation().getDirection();
	        tiro.setVelocity(new Vector(
	          vec.getX() * 1.0D * 3.5D, 
	          vec.getY() * 1.0D * 4.0D, 
	          vec.getZ() * 1.0D * 3.5D));
	        tiros.put(p.getName(), tiro);
	      
	        p.playSound(p.getLocation(), Sound.GLASS, 1.0F, 1.0F);
	        p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aA Corda do §fTRESH§aFoi lançada!");
	        return;
	 
	    }
	  }
	  
	  @SuppressWarnings({ "deprecation", "unused" })
	@EventHandler
	  public void onEntityDamagerByEntity(EntityDamageByEntityEvent e)
	  {
	    Entity ent = e.getEntity();
	    Entity damager = e.getDamager();
	    if ((ent instanceof Player))
	    {
	      Player hit = (Player)ent;
	      if ((damager instanceof Snowball))
	      {
	        Snowball snowball = (Snowball)damager;
	        if ((snowball.getShooter() instanceof Player))
	        {
	          Player shooter = (Player)snowball.getShooter();
	          if (!KitAPI.getKit(shooter).equalsIgnoreCase("thresh")) {
	            return;
	          }
	          Location ploc = shooter.getLocation();
	          Location hitloc = hit.getLocation();
	          hit.teleport(ploc);
	          hit.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 1));
	          hit.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
	          hit.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cUm Jogador fisgou você com o Tresh!");
	        }
	      }
	    }
	  }

}
