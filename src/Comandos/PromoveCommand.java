package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PromoveCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("promover")) {
			if (!(sender.hasPermission("pluspvp.cmd.promover"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/promover <jogador> <cargo>");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String kit = args[1];
				Player k = Bukkit.getPlayer(args[0]);
				if(kit.equalsIgnoreCase("helper")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §d[HELPER]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §d[HELPER]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Helper");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §d[HELPER]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("trial")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §d[TRIAL]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §d[TRIAL]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Trial");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §d[TRIAL]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("mod")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §5[MOD]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §5[MOD]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Mod");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("        §aPromovido ao cargo: §5[MOD]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("modplus")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §5[MOD+]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §5[MOD+]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Mod+");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §5[MOD+]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("modfull")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §5[MOD++]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §d[TRIAL]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Mod++");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §5[MOD++]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("admin")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §C[ADMIN]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §C[ADMIN]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Admin");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §c[ADMIN]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("gerente")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §c[GERENTE]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §c[GERENTE]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Gerente");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §c[GERENTE]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				if(kit.equalsIgnoreCase("dono")) {
					p.sendMessage("§e§lMASTER §7§L➜ §aVoce Promoveu o jogador §f" + k.getName() + " §aPara §4[DONO]");
					k.sendMessage("§e§lMASTER §7§L➜ §aVoce foi Promovido para §4[DONO]§a!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + k.getName() + " group set Dono");
					Bukkit.broadcastMessage("          §E�? §5§lEPIC§F§lKITS§c§e �?       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("§aO Jogador " + k.getName() + " §aFoi Promovido!");
					Bukkit.broadcastMessage("       §aPromovido ao cargo: §4[DONO]       ");
					Bukkit.broadcastMessage("§7");
					Bukkit.broadcastMessage("          §E�? §E§LPROMOÇÕES§e �?       ");
					return true;
				}
				} else {
					p.sendMessage("§e§lMASTER §7§L➜ §cEsse cargo não existe!");
					return true;
				}
			}
		return false;
	}
}
