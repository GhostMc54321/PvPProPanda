package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GivePermissionCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("givepermission")) {
			if (!(sender.hasPermission("pluspvp.cmd.givepermission"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cOps! Use isso De Maneira Correta: §f/givepermission <jogador> <permissao> ");
				p.sendMessage("§c(Para ver a Lista de permissões, use /permissionslist");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String permissions = args[1];
				Player jogador = Bukkit.getPlayer(args[0]);
				if(permissions.equalsIgnoreCase("Admin")) {
					p.sendMessage("§eA Permissão MODO ADMINISTRADOR Foi dada do Jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.admin");
					return true;
				}
				if(permissions.equalsIgnoreCase("staffchat")) {
					p.sendMessage("§ea Permissão ACESSO AO STAFFCHAT Foi dada so Jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.staff");
					return true;
				}
				if(permissions.equalsIgnoreCase("fullkit")) {
					p.sendMessage("§eA Permissao de TODOS OS KITS Foi dada ao Jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.*");
					return true;
				}
				if(permissions.equalsIgnoreCase("teleportar")) {
					p.sendMessage("§ea Permissao TELETRANSPORTAR foi dada ao Jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.tp");
					return true;
				}
				if(permissions.equalsIgnoreCase("setgroups")) {
					p.sendMessage("§eA Permissão para SETAR GRUPOS Foi dada do jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.groupset");
					return true;
				}
				if(permissions.equalsIgnoreCase("givevips")) {
					p.sendMessage("§eA Permissão para DAR VIPS Foi dada do Jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.givevip");
					return true;
				}
				if(permissions.equalsIgnoreCase("givekit")) {
					p.sendMessage("§eA Permissão de DAR KITS Foi dada do Jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.givekit");
					return true;
				}
				if(permissions.equalsIgnoreCase("sortearkit")) {
					p.sendMessage("§eA Permissão de SORTEAR KITS foi dada ao jogador " + jogador.getName());
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.sortarkit");
					return true;
				}
					if(permissions.equalsIgnoreCase("sortearvip")) {
						p.sendMessage("§eA Permissão de SORTEAR VIPS Foi dada do jogador " + jogador.getName());
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add pluspvp.cmd.sortearvip");
						return true;
				}
						
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cOps! Use isso De Maneira Correta: §f/givepermission <nick> <permission>");
					return true;
				}
			}
		return false;
	}
}
