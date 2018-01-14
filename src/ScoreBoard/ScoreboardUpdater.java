package ScoreBoard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import Main.Main;

public class ScoreboardUpdater {

	public static void Score(Player player) {
		Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
		player.setScoreboard(scoreboard);
		
		Main.scoreboard.put(player, new ScoreboardHelper(scoreboard, "§5§lEPIC§F§lKITS§c"));	
	}

}
