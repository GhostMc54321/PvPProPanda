package Comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand
  implements CommandExecutor
{

public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
			return true;
		}
    Player player = (Player)sender;
    if ((cmd.getName().equalsIgnoreCase("gm")) || (cmd.getName().equalsIgnoreCase("gamemode"))) {
      if (player.hasPermission("pluspvp.cmd.gamemode"))
      {
        if (args.length != 1)
        {
          player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/gm <1 ou 0>");
          return true;
        }
        if (args.length == 1)
        {
          if (args[0].equalsIgnoreCase("0"))
          {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê Setou Seu §fGAMEMODE§a Para §fSURVIVAL§a!");
          }
          if (args[0].equalsIgnoreCase("1"))
          {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê Setou Seu §fGAMEMODE§a Para §fCREATIVE§a!");

            {
              }
            }
          }
        }
    
      else
      {
        player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
      }
    }
    return false;
  }
}
