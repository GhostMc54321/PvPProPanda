package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GroupSetCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("groupset")) {
			if (!(sender.hasPermission("pluspvp.cmd.groupset"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String grupo = args[1];
				Player player = Bukkit.getPlayer(args[0]);
				if(grupo.equalsIgnoreCase("normal")) {
					p.sendMessage("§e§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para NORMAL");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Normal");
					player.chat("/tag normal");
					return true;
				}
					if(grupo.equalsIgnoreCase("ultimate")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para ULTIMATE");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Ultimate");
						player.chat("/tag ultimate");
						return true;
				}
					if(grupo.equalsIgnoreCase("premium")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para PREMIUM");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Premium");
						player.chat("/tag premium");
						return true;
				}
					if(grupo.equalsIgnoreCase("platinum")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para PLATINUM");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Platinum");
						player.chat("/tag platinum");
						return true;
				}
					if(grupo.equalsIgnoreCase("Helper")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para HELPER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Helper");
						player.chat("/tag helper");
						return true;
				}
					if(grupo.equalsIgnoreCase("youtuber")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para YOUTUBER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Youtuber");
						player.chat("/tag youtuber");
						return true;
				}
					if(grupo.equalsIgnoreCase("mod")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para Mod");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod");
						player.chat("/tag mod");
						return true;
				}
					if(grupo.equalsIgnoreCase("mod+")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para MOD+");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod+");
						player.chat("/tag mod+");
						return true;
				}
					if(grupo.equalsIgnoreCase("Mod++")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para MOD++");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod++");
						player.chat("/tag mod++");
						return true;
				}
					if(grupo.equalsIgnoreCase("trial")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para TRIAL");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Trial");
						player.chat("/tag trial");
						return true;
				}
					if(grupo.equalsIgnoreCase("admin")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para ADMIN");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Admin");
						player.chat("/tag admin");
						return true;
				}
					if(grupo.equalsIgnoreCase("gerente")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para GERENTE");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Gerente");
						player.chat("/tag gerente");
						return true;
				}
					if(grupo.equalsIgnoreCase("dono")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para DONO");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Dono");
						player.chat("/tag dono");
						return true;
					}
					if(grupo.equalsIgnoreCase("youtuber+")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para YOUTUBER+");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Youtuber+");
						player.chat("/tag youtuber");
						return true;
					}
					if(grupo.equalsIgnoreCase("developer")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para DEVELOPER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Developer");
						player.chat("/tag developer");
						return true;
					}
					if(grupo.equalsIgnoreCase("builder")) {
						p.sendMessage("§eO Player " + player.getName() + "§e(" + player.getUniqueId() + "§e)" +  " §eAlterado para BUILDER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Builder");
						player.chat("/tag builder");
						return true;
					}
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/groupset <nick> <grupo>");
					return true;
				}
				}
		return false;
	}
}
