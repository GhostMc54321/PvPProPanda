package Kits;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import API.CooldownAPI;
import Main.Main;
import Utilidades.KitAPI;

public class Ajnin implements Listener{
	
	  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static HashMap<Player, Player> a = new HashMap();

  @EventHandler
  public void a(EntityDamageByEntityEvent e) {
    if (((e.getDamager() instanceof Player)) && ((e.getEntity() instanceof Player))){
      final Player hitou = (Player)e.getDamager();
      Player hitado = (Player)e.getEntity();
      if (KitAPI.getKit(hitou) == "Ajnin" && !a.containsKey(hitou)){
        a.put(hitou, hitado);
        
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(null), new Runnable() {
			public void run() {
				a.remove(hitou);
				a.remove(hitado);
			}
		}, 11*20);
      }
    }
  }

  @EventHandler
  public void a(PlayerToggleSneakEvent e) {
    Player hitou = e.getPlayer();
    if ((e.isSneaking()) && (KitAPI.getKit(hitou) == "Ajnin") && (CooldownAPI.Cooldown.containsKey(hitou.getName()))){
    	hitou.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §FAJNIN§c Ainda está em Cooldown!");
    	return;
    }
    
    if ((e.isSneaking()) && (KitAPI.getKit(hitou) == "Ajnin") && (a.containsKey(hitou))){
      Player hitado = (Player)a.get(hitou);
          if (hitou.getLocation().distance(hitado.getLocation()) < 40.0D){
        	  
            hitado.teleport(hitou.getLocation());
            CooldownAPI.addCooldown(hitou, 7);
          }else{
            hitou.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê está muito Longe do jogador!");
          }
        }
    }
  }