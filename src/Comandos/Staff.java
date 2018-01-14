package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Staff
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (args.length < 2)
    {
      p.sendMessage("§eStaff §c>>>  Lista completa dos staffs:!");
      p.sendMessage("§5§lEPIC§F§lKITS§c >>>  §2DONOS *");
      p.sendMessage("§5§lEPIC§F§lKITS§c >>>  §2* §7LePote2TonPote");
      p.sendMessage("§5§lEPIC§F§lKITS§c >>>  §2* §7zAbraaoPvP_");
      p.sendMessage("§5§lEPIC§F§lKITS§c >>>  §3Coders *");
      p.sendMessage("§5§lEPIC§F§lKITS§c >>>  §3* yDiiogoSwagZ_");
      p.sendMessage("§5§lEPIC§F§lKITS§c >>>  §cEste Sistema ainda Não foi Finalizado!");
      
      return true;
    }
	return false;
  }
}
