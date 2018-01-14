package Comandos;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class BuildCommand implements Listener, CommandExecutor {
	
	public static HashMap<String, BuildStats> Build = new HashMap<>();
	
	public enum BuildStats {
		ON, OFF
	}
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVocê Não Pode usar isso No Console!");
			return true;
		}
		if (!(sender.hasPermission("pluspvp.cmd.build"))) {
			sender.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
			return true;
		}
		Player p = (Player)sender;
		if (args.length == 0) {
			p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cOps! Use isso De Maneira Correta: §f/build <On/Off>");
		}
		if (args.length == 1) {
    	}
    
		if (args[0].equalsIgnoreCase("on")) {
			if (Build.get(p.getName()) == BuildStats.ON) {
				p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §aVocê Já está Habilitado a Construir!");
				return true;
			} else {
				p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §aVocê Ativou O Modo §fBUILD§a!");
				Build.put(p.getName(), BuildStats.ON);
				return true;
			}
		} else if (args[0].equalsIgnoreCase("off")) {
			if (Build.get(p.getName()) == BuildStats.OFF) {
				p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cVocê Já estava Desabilitado a Construir!");
				return true;
			} else {
				p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cVocê Desativou O Modo §fBUILD§c!");
				Build.put(p.getName(), BuildStats.OFF);
				return true;
			}
		} else p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cOps! Use isso De Maneira Correta: §f/build <On/Off>");
		return false;
  }
    
    @EventHandler
    public void Entrou(PlayerJoinEvent e) {
    	Build.put(e.getPlayer().getName(), BuildStats.OFF);
    }
    
    @EventHandler
    public void Quebrar(BlockBreakEvent e) {
    	Player p = e.getPlayer();
    	if (Build.get(p.getName()) == BuildStats.OFF) {
    	e.setCancelled(true);
      }
    }
        @EventHandler
        public void Quebrar(BlockPlaceEvent e) {
        	Player p = e.getPlayer();
        	if (Build.get(p.getName()) == BuildStats.OFF) {
        	e.setCancelled(true);
        }
      }
 }