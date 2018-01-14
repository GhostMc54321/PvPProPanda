package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemovePermissionCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("removepermission")) {
			if (!(sender.hasPermission("pluspvp.cmd.removepermission"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/removepermission <jogador> <permissao> ");
				p.sendMessage("§c(Para ver a Lista de permissões, use /permissionslist)");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String permissions = args[1];
				Player jogador = Bukkit.getPlayer(args[0]);
				if(permissions.equalsIgnoreCase("Admin")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu A permissao §fModo Admin§c do jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissão Para o §fModo Admin§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.admin");
					return true;
				}
				if(permissions.equalsIgnoreCase("staffchat")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu A permissao §fStaffChat§c do jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissao do §fSstaffChat§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.staff");
					return true;
				}
				if(permissions.equalsIgnoreCase("fullkit")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu Todos os Kits Ao jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissão de §fTodos os Kits§c!");
					jogador.sendMessage("§cSeus kits voltaram ao padrão do seu Rank.");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.*");
					return true;
				}
				if(permissions.equalsIgnoreCase("teleportar")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu a Permissão de §fTeleportar§c do jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissão de §fTeleportar§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.tp");
					return true;
				}
				if(permissions.equalsIgnoreCase("setgroups")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu a Permissão de §fSetar Grupos§c do jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissão de §fSetar grupos§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.groupset");
					return true;
				}
				if(permissions.equalsIgnoreCase("givevips")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu a Permissão de §fDar Vips§c do Jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce perdeu a Permissão de §fDar Vips§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.givevip");
					return true;
				}
				if(permissions.equalsIgnoreCase("givekit")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu a Permissão de §fDar Kits§c do Jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissão de §fDar Kits§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.givekit");
					return true;
				}
				if(permissions.equalsIgnoreCase("sortearkit")) {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu a Permissão de §fSortear Kits§c do Jogador §f" + jogador.getName());
					jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce perdeu a Permissao de §fSortear kits§c!");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.sortarkit");
					return true;
				}
					if(permissions.equalsIgnoreCase("sortearvip")) {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce removeu a Permissão de §fSortear Vips§c do Jogador §f" + jogador.getName());
						jogador.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce perdeu a Permissao de §fSortear Vips§c!");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove masterkits.cmd.sortearvip");
						return true;
				}
						
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cEssa Permissão não existe!");
					return true;
				}
			}
		return false;
	}
}
