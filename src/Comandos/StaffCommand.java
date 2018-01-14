package Comandos;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class StaffCommand implements CommandExecutor {

	public static ArrayList<String> staffchat = new ArrayList<String>();

	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§7Comandos apenas no servidor!");
			return true;
		}
		Player p = (Player) sender;
		if ((cmd.getName().equalsIgnoreCase("staff"))) {
			if ((p.hasPermission("pluspvp.cmd.staff"))) {
				if (args.length == 0) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/staff <entrar/sair>");
					return true;
				}
			} else {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜§cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if (args[0].equalsIgnoreCase("entrar")) {
				staffchat.add(p.getName());
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce entrou no Chat da Staff!");
			} else if ((args[0].equalsIgnoreCase("sair")) && (staffchat.contains(p.getName()))) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce saiu do Chat da Staff!");
				staffchat.remove(p.getName());
			}
		}
		return false;
	}
}