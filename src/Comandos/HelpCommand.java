package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class HelpCommand
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("ajuda")) {};
    p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cIsso ainda não está disponível!");

    return false;
  }
}
