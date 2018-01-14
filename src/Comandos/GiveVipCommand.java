package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class GiveVipCommand implements CommandExecutor {
	

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("givevip")) {
			if (!(sender.hasPermission("pluspvp.cmd.givevip"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/givevip <jogador> <vip>");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String vipgroup = args[1];
				Player jogador = Bukkit.getPlayer(args[0]);
				if(vipgroup.equalsIgnoreCase("Ultimate")) {
					p.sendMessage("§eO Vip ULTIMATE Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set ultimate");
					return true;
				}
				if(vipgroup.equalsIgnoreCase("Premium")) {
					p.sendMessage("§eO Vip PREMIUM Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set premium");
					return true;
				}
				if(vipgroup.equalsIgnoreCase("platinum")) {
					p.sendMessage("§eO Vip PLATINUM Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set platinum");
					return true;
				}
	}
		}
		return false;
	}
}
