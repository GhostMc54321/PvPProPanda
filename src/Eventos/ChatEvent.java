package Eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener 
{
    @EventHandler
    public void modificarchat(AsyncPlayerChatEvent evento)
    {
    	Player jogador = evento.getPlayer();
    	
    	if (jogador.hasPermission("pluspvp.actions.falarcolorido"))
    	{
        	evento.setFormat(jogador.getDisplayName() +  " §7» " + evento.getMessage().replace("&", "§").replace("%", " Porcento(s)"));
    	} else {
    		evento.setFormat(jogador.getDisplayName() +  " §7» " + evento.getMessage());
    	}
    	if (jogador.hasPermission("pluspvp.cmd.admin"))
    	{
        	evento.setFormat(jogador.getDisplayName() +  " §7» §f" + evento.getMessage());
    	} else {
    		evento.setFormat(jogador.getDisplayName() +  " §7» " + evento.getMessage());
    	}
     
 }
    
}
