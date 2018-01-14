package Kits;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.util.Vector;

import Main.Main;
import Utilidades.KitAPI;

public class Hulk implements Listener {
	
	  ArrayList<Player> cooldown = new ArrayList<>();
	  public static ArrayList<Player> Hulk = new ArrayList<>();
	
	@EventHandler
	  public void onHulk(PlayerInteractEntityEvent event)
	  {
	    final Player p = event.getPlayer();
	    if ((event.getRightClicked() instanceof Player))
	    {
	      Player d = (Player)event.getRightClicked();
	      if (KitAPI.getKit(p) == "Hulk") {
	        if (KitAPI.getKit(p) == "Hulk")
	        {
	          if (p.getItemInHand().getType().equals(Material.STONE_SWORD)) {
	            if (this.cooldown.contains(p))
	            {
	                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §fHULK§c Ainda está em Cooldown!");
	            }
	            else if (p.getPassenger() == null)
	            {
	              p.setPassenger(d);
	              d.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê foi Pego por um §fHULK§c, Aperte §fSHIFT§c Para Sair!");
	              this.cooldown.add(p);
	              p.setVelocity(new Vector());
	              p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 4.0F, 4.0F);
	              Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable() 
	              {
	                public void run()
	                {
	                  Hulk.this.cooldown.remove(p);
	                }
	              }, 200L);
	            }
	            else
	            {
	              p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê já tem Alguem em sua cabeça!");
	            }
	          }
	        }
	        else {
	          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cEste Jogador Também está usando o Kit §fHULK§c!");
	        }
	      }
	    }
	  }
	}
