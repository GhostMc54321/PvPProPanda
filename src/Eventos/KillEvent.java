package Eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import ScoreBoard.ScoreboardUpdater;
import Utilidades.KillsDeathsMoney;
import Utilidades.KitAPI;
import Utilidades.WarpsAPI;

public class KillEvent implements Listener {
	
	@EventHandler
	public void Matança(PlayerDeathEvent e ) {
		Player p = e.getEntity();
		WarpsAPI.ir(p, "spawn");
		if (e.getEntity().getKiller() instanceof Player) {
			Player t = (Player)p.getKiller();
			KillsDeathsMoney.addDeaths(p, 1);
			KillsDeathsMoney.addKill(t, 1);
			KillsDeathsMoney.addMoney(t, 100);
			KillsDeathsMoney.removermoney(p, 60);
			KitAPI.RemoveKit(p);
			e.setDeathMessage(null);
			ScoreboardUpdater.Score(p);
			ScoreboardUpdater.Score(t);
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §CVoce morreu para §f" + t.getDisplayName());
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §c-60 Coins");
			t.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce matou §f" + p.getDisplayName());
			t.sendMessage("§5§lEPIC§F§lKITS§c ➜ §a+60 Coins");
		} else {
			ScoreboardUpdater.Score(p);
			KitAPI.RemoveKit(p);
			e.setDeathMessage(null);
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §CVoce Morreu.");
		}
	}

}
