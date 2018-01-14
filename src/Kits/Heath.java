package Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import Utilidades.KitAPI;

public class Heath implements Listener {

	@EventHandler
	public void onDeathEvent(PlayerDeathEvent e) {
		e.setDeathMessage(null);
		if (!(e.getEntity() instanceof Player)) {
			return;
		}
		final Player vitima = e.getEntity();
		if ((e.getEntity().getKiller() instanceof Player)) {
			final Player matador = e.getEntity().getKiller();
			if (matador != vitima) {
				if ((KitAPI.getKit(matador).equalsIgnoreCase("heath")))
					matador.setHealth(2.0D);
				matador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Kit §fHEALTH§a Lhe deu mais §f1 CORAÇÃO§a!");

			}

		}

	}

}
