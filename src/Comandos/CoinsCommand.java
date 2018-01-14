package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CoinsCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (args.length < 2)
    {
      p.sendMessage("§5§lEPIC§F§lKITS§c ➜  §cEste Sistema ainda Não foi Finalizado!");
      return true;
    }
	return false;
  }
}
