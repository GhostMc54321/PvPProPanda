package Kits;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
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

public class Hunter implements Listener {
	
	 public static HashMap<String, Long> cooldown = new HashMap<String, Long>();
	  public static HashMap<String, Arrow> tiros = new HashMap<String, Arrow>();
	  
	
	  @EventHandler
		public void interact(PlayerInteractEvent e) {
			final Player p = e.getPlayer();
				if ((KitAPI.getKit(p).equalsIgnoreCase("hunter"))) {
					if (p.getItemInHand().getType() == Material.STICK)
						if ((e.getAction() == Action.RIGHT_CLICK_AIR)
								|| (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
						 	if  (CooldownAPI.Cooldown.containsKey(p.getName())) {
							  	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §fHUNTER§c Ainda está em Cooldown!");
							    
								return;
							}
					
	        e.setCancelled(true);
	        p.updateInventory();
	      	CooldownAPI.addCooldown(p, 30);
	        Arrow tiro = (Arrow)p.launchProjectile(Arrow.class);
	        Vector vec = p.getLocation().getDirection();
	        tiro.setVelocity(new Vector(
	          vec.getX() * 1.0D * 3.5D, 
	          vec.getY() * 1.0D * 4.0D, 
	          vec.getZ() * 1.0D * 3.5D));
	        tiros.put(p.getName(), tiro);	
	        cooldown.put(p.getName(), Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(20L)));
	        p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê Desparou um Dardo!");
	        p.playSound(p.getLocation(), Sound.GLASS, 1.0F, 1.0F);
	        
	      }
	     }
				}
	  

@SuppressWarnings("deprecation")
@EventHandler
	  public void aplicar(EntityDamageByEntityEvent e)
	  {
	    if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Arrow)))
	    {
	      Player p = (Player)e.getEntity();
	      Arrow tiro = (Arrow)e.getDamager();
	      if ((tiro.getShooter() instanceof Player))
	      {
	        Player shooter = (Player)tiro.getShooter();
	        if ((tiros.containsKey(shooter.getName())) && 
	          (tiro == tiros.get(shooter.getName())))
	        {
	          p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 0));
	          p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 300, 0));
	          p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 0));
	          p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 0));
	          p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 300, 0));
	          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Foi atingido Pelo Dardo de §f" + p.getName() + "§c!");
	          p.playSound(p.getLocation(), Sound.BURP, 1.0F, 1.0F);
	          shooter.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSeu dardo atingiu §f" + ChatColor.GRAY + p.getName());
	          shooter.playSound(shooter.getLocation(), Sound.CAT_PURR, 1.0F, 1.0F);
	          tiros.remove(shooter.getName());
	          return;
	        }
	      }
	    }
	  }

}
