package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvseeCommand
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (!(sender instanceof Player))
    {
      sender.sendMessage("§cVocê Não Pode usar isso No Console!");
      return true;
    }
    Player p = (Player)sender;
    if (!p.hasPermission("pluspvp.cmd.inv"))
    {
      p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
      return true;
    }
    if (args.length == 0)
    {
      p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/inv <nick>");
    }
    else
    {
      Player t = Bukkit.getPlayer(args[0]);
      if (t == null)
      {
        p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
        return true;
      }
      p.openInventory(t.getInventory());
      p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aInventario do Jogador §f" + t.getDisplayName() + " §aAberto!");
      p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVOCÊ ABRIU UM INVENTARIO!" + " §e(" +t.getName() + "§e) " + "§cQUALQUER TIPO DE MODIFICAÇÃO FEITA RESULTARA EM PERDA PERMANENTE"
      		+ "§C DO SEU CARGO! ");
    }
    return false;
  }
}
