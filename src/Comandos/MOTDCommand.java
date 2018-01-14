package Comandos;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MOTDCommand implements CommandExecutor {
	
	public static ArrayList<String> changeMOTD = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("setmotd")) {
			if((sender instanceof Player)) {
				Player player = (Player) sender;
				if (!(sender.hasPermission("pluspvp.cmd.setmotd"))) {
					player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
					return true;
				}
				if(args.length == 0) {
					player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/setmotd <MOTD>");
					return true;
				}
				if(args.length == 1) {
					if(args[0].equalsIgnoreCase("reset")) {
						if(changeMOTD.isEmpty()) {
							player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Motd Não tinha sido alterado anteriormente!");
							return true;
						}
						changeMOTD.clear();
						player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aA Motd Foi Resetada com Sucesso!");
						return true;
					}
					if(args[0].equalsIgnoreCase("view")) {
						if(changeMOTD.isEmpty()) {
							player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aA Motd não está alterada.");
							return true;
						}
						player.sendMessage("§eAtual MOTD Setada: " + changeMOTD.toString().replace("[", "").replace("]", ""));
						return true;
					} else {
						if(!changeMOTD.isEmpty()) {
							player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cA Motd já está alterada, Resete-a e Tente novamente.");
							return true;
						}
						String prefix = "§5§lEPIC§F§lKITS§c §7(1.7 §7& 1.8x)                                             ";
						String motd = args[0];
						changeMOTD.add(prefix + motd);
						player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aA Motd Foi setada para " + motd);
						return true;
					}
				}
				if(args.length >= 2) {
					String motd = "";
					for(int i = 0; i < args.length; i++) {
						motd = motd + args[i] + " ";
					}
					if(!changeMOTD.isEmpty()) {
						player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cA Motd já está alterada, Resete-a e Tente novamente.");
						return true;
					}
					changeMOTD.add(motd);
					player.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aA Motd Foi setada para " + motd);
					return true;
				}
			}
		}
		return false;
	}

}
