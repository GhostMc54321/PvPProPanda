package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class AplicarCommand
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("aplicar")) {}
    p.sendMessage("§c§m>-------------------------<");
    p.sendMessage("      §c➜ §c§lAPLICAR §c➜        ");
    p.sendMessage(" ");
    p.sendMessage("§7➜ Para aplicar-se na Staff, acesse o Link abaixo:");
    p.sendMessage("§7");
    p.sendMessage("§c➜  SEM VAGAS");
    p.sendMessage("§7");
    p.sendMessage("§7➜ Preencha o Formulario e aguarde até uma semana pra respostas!");
    p.sendMessage("§c[OBSERVAÇÃO] NAO PEÇA PARA LERMOS SEU FORMULARIO, CASO CONTRARIO SERA DESCLASSIFICADO!");
    p.sendMessage("§c§m>-------------------------<");
    return false;
  }
}
