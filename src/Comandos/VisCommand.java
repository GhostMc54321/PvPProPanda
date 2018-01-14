package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import API.ArraysAPI;

public class VisCommand implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("vis")) {
			if (!(sender.hasPermission("pluspvp.cmd.visible"))) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				if(ArraysAPI.Admin.contains(p)) {
					for(Player todos : Bukkit.getOnlinePlayers()) {
						todos.showPlayer(p);
						p.showPlayer(todos);
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê ficou Visivel Para Todos!");
						return true;
					}
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê só pode usar isso no modo Admin!");
					return true;
				}
			}
		}
		return false;
	}
}