package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearchatCommand implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		for (Player s : Bukkit.getOnlinePlayers()) {
			if (!(sender.hasPermission("pluspvp.cmd.chat"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
		for (int i= 0; i != 100; i++) {
				s.sendMessage("  ");
		}
		  s.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Chat foi Limpo!");
		}
		return false;
	}
	

}
