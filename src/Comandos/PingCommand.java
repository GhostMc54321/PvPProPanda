package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command command, String c, String[] args)
  {
    if ((sender instanceof Player))
    {
      Player p = (Player)sender;
      int ping = ((CraftPlayer)p).getHandle().ping;
      if (c.equalsIgnoreCase("ping")) {
        if (args.length == 0)
        {
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSeu Ping Está em §f" + ping + " §aMs");
        }
        else if (p.getServer().getPlayer(args[0]) != null)
        {
          String player2 = args[0];
          Player target = Bukkit.getServer().getPlayer(args[0]);
          int ping2 = ((CraftPlayer)target).getHandle().ping;
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + player2 + " §aEstá em §f" + ping2 +  " §aMs!");
        }
        else
        {
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
        }
      }
    }
    return false;
  }
}
