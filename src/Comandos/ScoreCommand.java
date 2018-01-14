package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.ScoreboardManager;

import Main.Main;
import ScoreBoard.ScoreboardUser;

public class ScoreCommand implements CommandExecutor {

	public static void resetScoreboard(Player p) {
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		p.setScoreboard(manager.getNewScoreboard());
	}

	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		if (cmd.getName().equalsIgnoreCase("score")) {
			Player player = (Player) sender;

			if(Main.scoreboard.containsKey(player.getName())){
			player.sendMessage(" ➜  §cScoreBoard Desativada!");
			ScoreboardUser.clearScoreboard(player);
			Main.scoreboard.remove(player.getName());
			
			

		} else 
			if(!Main.scoreboard.containsKey(player.getName())){
			player.sendMessage(" ➜ §aScoreBoard Ativada!");
			
		}
			return true;
			
		}

		return false;
	}
}