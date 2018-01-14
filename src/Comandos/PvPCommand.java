package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class PvPCommand
  implements CommandExecutor, Listener
{
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if ((cmd.getName().equalsIgnoreCase("togglepvp")) && (
      (sender.hasPermission("pluspvp.cmd.togglepvp")) || (sender.isOp())))
    {
      if (p.getWorld().getPVP())
      {
        p.getWorld().setPVP(false);
        Bukkit.getServer().broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §cO Dano entre Jogadores Foi §fDESATIVADO§a!");
        return true;
      }
      p.getWorld().setPVP(true);
      Bukkit.getServer().broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Dano entre Jogadores foi §fATIVADO§a!");
      return true;
    }
    return false;
  }
}
