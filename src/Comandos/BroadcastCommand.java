package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand
  implements CommandExecutor
  {
  public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
  {
    if ((commandLabel.equalsIgnoreCase("bc")) && (sender.hasPermission("pluspvp.cmd.bc")))
    {
      if (args.length >= 1)
      {
        String bcast = "";
        for (int x = 0; x < args.length; x++) {
          bcast = bcast + args[x] + " ";
        }

        bcast = ChatColor.translateAlternateColorCodes('&', bcast);
        Bukkit.broadcastMessage("§5§lEPIC§F§lKITS §c➜ §7" + ChatColor.GREEN + ChatColor.ITALIC + bcast);
      }
      else
      {
        sender.sendMessage("§5§lEPIC§F§lKITS §c➜ §cOps! Use isso De Maneira Correta: §f/bc <mensagem>");
        sender.sendMessage("§5§lEPIC§F§lKITS §c➜ §cAtenção: A Mensagem que você Enviar será Mostrada para todos O Jogadores Online!"
        		+ "§c Pense Bem antes de usar o Comando!");
      }
    }
    else {
      sender.sendMessage("§5§lEPIC§F§lKITS §c➜ §cDesculpe, mas você não tem permissão para fazer isso.");
    }
    return false;
  }
}
