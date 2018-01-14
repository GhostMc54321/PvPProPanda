package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class YoutuberCommand
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("youtuber")) {}
    p.sendMessage("§c§m>-------------------------<");
    p.sendMessage("       §b§lYOUTUBER         ");
    p.sendMessage(" ");
    p.sendMessage("§7➜ Para Obter a Tag §b[YOUTUBER]§7, Você Precisa de:");
    p.sendMessage("§7");
    p.sendMessage("§7➜ 1,5k(mil) de Inscritos");
    p.sendMessage("§7➜ FeedBack Razoável");
    p.sendMessage("§7➜ Frequência de Vídeos Boa");
    p.sendMessage("§7➜ 1 Vídeo no servidor");
    p.sendMessage("§7➜ 60 Likes No Vídeo do Servidor.");
    p.sendMessage(" ");
    p.sendMessage("§c[OBSERVAÇÃO] Não sedemos Outra Tag, apenas YOUTUBER!");
    p.sendMessage("§c[OBSERVAÇÃO] Se Não tiver os Requisitos, Por favor Não insista na Tag!");
    p.sendMessage("§c[OBSERVAÇÃO] Se tiver Todos os Requisitos, entre em contato!");
    p.sendMessage(" ");
    p.sendMessage("§c§m>-------------------------<");
    return false;
  }
}
