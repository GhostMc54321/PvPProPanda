package Kits;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import Main.Main;
import Utilidades.KitAPI;

public class Ninja  implements Listener {
	
	public static HashMap<String, Player> NinjaPlayer = new HashMap<>();
	public static HashMap<String, Integer> NinjaTime = new HashMap<>();
	
	@EventHandler
	public void Bater(EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			final Player p = (Player)e.getDamager();
			Player t = (Player)e.getEntity();
			if (KitAPI.getKit(p) == "Ninja") {
				NinjaPlayer.put(p.getName(), t);
				NinjaTime.put(p.getName(), 10);
				Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable() {
					public void run() {
						if (NinjaTime.get(p.getName()) <= 0) {
							if (KitAPI.getKit(p) == "Ninja" && KitAPI.KitDelay.containsKey(p.getName())) {
								p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Perdeu o Jogador §f" + NinjaPlayer.get(p.getName()) + " §cNo Ninja!");
					
				}
							NinjaPlayer.remove(p.getName());
						}
					}
				}, 10 * 20);
				}
			}
		}
    @EventHandler
    public void Agachar(PlayerToggleSneakEvent e) {
    	Player p = e.getPlayer();
    	if (p.isSneaking()) {
    	if (KitAPI.getKit(p) == "Ninja") {
    		if (!KitAPI.KitDelay.containsKey(p.getName())) {
    			if (NinjaPlayer.containsKey(p.getName())) {
    				Player t = NinjaPlayer.get(p.getName());
    				if (p.getLocation().distance(t.getLocation()) <= 35) {
    					p.teleport(t);
    					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aHabilidade do kit §fNINJA USADA§a!");
    					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê Teleportou-se até §f" + NinjaPlayer.get(p.getName() + "§a Usando o §fNINJA§a!"));
    					KitAPI.KitDelay.put(p.getName(), 10);
    					Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable() {
    						@Override
							public void run() {
								if (KitAPI.KitDelay.containsKey(p.getName()) && KitAPI.KitDelay.get(p.getName()) <= 0 && KitAPI.getKit(p) == "Ninja") {
									p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSeu Kit §fNINJA§a Saiu de Cooldown!");
									KitAPI.KitDelay.remove(p.getName());
								}
							}
						}, 10 * 20);
    				} else {
    					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Jogador Mais Recente em seu §fNINJA§a, Distânciou-se Muito!");
    					return;
    				}
    			} else {
    				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cErro ao usar Habilidade!");
    				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Kit §fNINJA§c Não Achou Nenhum Jogador!");
    				return;
    			}
    		} else {
    			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §fNINJA§c Ainda está em Cooldown!");
    			return;
    		}
    	}
    }
    }
   }