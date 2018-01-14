package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import ScoreBoard.ScoreboardUpdater;

;

public class DeathCommand
  implements Listener, CommandExecutor
{
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("morrer"))
    {
      p.setHealth(0.0D);
	  ScoreboardUpdater.Score(p);
      p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce Se Suicidou...");
    }
    return false;
  }
}