package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import API.ArraysAPI;

public class InvisCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("invis")) {
			if (!(sender.hasPermission("pluspvp.cmd.visible"))) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				if(ArraysAPI.Admin.contains(p)) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Ficou Invisivel Para Todos!");
					return true;
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Só Pode Usar Isso no Modo Admin!");
					return true;
				}
			}
		}
		return false;
	}
}
