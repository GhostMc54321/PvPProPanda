package Eventos;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import Utilidades.KitAPI;

public class ServerexitEvent implements Listener {
	
	@EventHandler
	public void Sair(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		e.setQuitMessage(null);
		KitAPI.RemoveKit(p);
	   	Bukkit.broadcastMessage("§c➜ §7" + p.getName());
   }
 }