package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemoveVipCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("removevip")) {
			if (!(sender.hasPermission("pluspvp.cmd.removevip"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/removevip <jogador> <vip>");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String vipgroup = args[1];
				Player jogador = Bukkit.getPlayer(args[0]);
				if(vipgroup.equalsIgnoreCase("Ultimate")) {
					p.sendMessage("§eVoce Removeu o vip ULTIMATE Do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					jogador.sendMessage("§eSeu Vip ULTIMATE Acaba de Expirar! Seu Rank Foi setado Para NORMAL Automaticamente.");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set normal");
					jogador.chat("/tag normal");
					return true;
				}
				if(vipgroup.equalsIgnoreCase("Premium")) {
					p.sendMessage("§eVoce Removeu o vip PREMIUM Do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					jogador.sendMessage("§eSeu Vip PREMIUM Acaba de Expirar! Seu Rank Foi setado Para NORMAL Automaticamente.");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set normal");
					jogador.chat("/tag normal");
					return true;
				}
				if(vipgroup.equalsIgnoreCase("Platinum")) {
					p.sendMessage("§eVoce Removeu o vip PLATINUM Do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					jogador.sendMessage("§eSeu Vip PLATIUM Acaba de Expirar! Seu Rank Foi setado Para NORMAL Automaticamente.");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " group set normal");
					jogador.chat("/tag normal");
					return true;
				}
						
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/removevip <nick> <vip>");
					return true;
				}
			}
		return false;
	}
}
