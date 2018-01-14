package Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

import Utilidades.KitAPI;

public class Fisherman implements Listener {
	
	@EventHandler
	public void Pescar(PlayerFishEvent e) {
		Player p = e.getPlayer();
		if (e.getCaught() instanceof Player && KitAPI.getKit(p) == "Fisherman") {
			Player t = (Player)e.getCaught();
			t.teleport(p);
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce pescou §f" + t.getDisplayName());
			t.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce foi pescado pelo §f" + p.getDisplayName());
		}
		
	}

}
