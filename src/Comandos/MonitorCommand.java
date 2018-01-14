package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import API.ArraysAPI;

public class MonitorCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("monitorar")) {
			if (!(sender.hasPermission("pluspvp.cmd.monitorar"))) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/monitorar <on/off>");
				return true;
			}
			if(args[0].equalsIgnoreCase("on")) {
				ArraysAPI.Monitor.add(p);
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce agora está em Modo Monitor!");
				return true;
			}
			if(args[0].equalsIgnoreCase("off")) {
				ArraysAPI.Monitor.remove(p);
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce saiu do Modo Monitor!");
				return true;
			}
		}
		return false;
	}

}
