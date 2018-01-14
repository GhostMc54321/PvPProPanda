package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Loja
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("loja")) {}
    p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aQuer comprar vip ou kit ? chame um dono!");
    return false;
  }
}
