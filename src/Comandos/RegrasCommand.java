package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class RegrasCommand
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("regras")) {}
    p.sendMessage("§c----------------------------------------------");
    p.sendMessage("    §4§lREGRAS:    ");
    p.sendMessage("§c➜ Nao usar hack!");
    p.sendMessage("§c➜ Nao abusar de bugs");
    p.sendMessage("§c➜ Nao testar staff!");
    p.sendMessage("§c➜ Nao chingar staff");
    p.sendMessage("§c➜ Nao chingar o servidor");
    p.sendMessage("§c➜ Nao dilvugar outro servidor");
    p.sendMessage("§c➜ Nao chingar o servidor!");
    p.sendMessage("§c➜ Nao falar que o outro é hack somente reporte");
    p.sendMessage("§c➜ Nao chamar de iz so porque morreu");
    p.sendMessage("§c➜ Nao pessa staff");
    p.sendMessage("§c➜ Nao pessa para avisarmos quando tiver vagas !");
    p.sendMessage("§c➜ Nao pessa para lermos formularios");
    p.sendMessage("§c----------------------------------------------");
    return false;
  }
}
