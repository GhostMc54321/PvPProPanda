package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemoveKitCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("removekit")) {
			if (!(sender.hasPermission("pluspvp.cmd.removekit"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/removekit <jogador> <kit>");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String kit = args[1];
				Player jogador = Bukkit.getPlayer(args[0]);
				if(kit.equalsIgnoreCase("Boxer")) {
					p.sendMessage("§eO Kit BOXER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.boxer");
					return true;
				}
				if(kit.equalsIgnoreCase("Switcher")) {
					p.sendMessage("§eO Kit SWITCHER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.switcher");
					return true;
				}
				if(kit.equalsIgnoreCase("BurstMaster")) {
					p.sendMessage("§eO Kit BUSRSTMASTER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.burstmaster");
					return true;
				}
				if(kit.equalsIgnoreCase("Thresh")) {
					p.sendMessage("§eO Kit THRESH Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.thresh");
					return true;
				}
				if(kit.equalsIgnoreCase("Monk")) {
					p.sendMessage("§eO Kit MONK Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.monk");
					return true;
				}
				if(kit.equalsIgnoreCase("Camel")) {
					p.sendMessage("§eO Kit CAMEL Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.camel");
					return true;
				}
				if(kit.equalsIgnoreCase("Deshfire")) {
					p.sendMessage("§eO Kit DESHFIRE Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.deshfire");
					return true;
				}
				if(kit.equalsIgnoreCase("Ajnin")) {
					p.sendMessage("§eO Kit AJNIN Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.ajnin");
					return true;
				}
				if(kit.equalsIgnoreCase("Deshviper")) {
					p.sendMessage("§eO Kit DESHVIPER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.deshviper");
					return true;
				}
				if(kit.equalsIgnoreCase("Fisherman")) {
					p.sendMessage("§eO Kit FISHERMAN Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.fisherman");
					return true;
				}
				if(kit.equalsIgnoreCase("Forcefield")) {
					p.sendMessage("§eO Kit FORCEFIELD Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.forcefield");
					return true;
				}
				if(kit.equalsIgnoreCase("Gladiator")) {
					p.sendMessage("§eO Kit GLADIATOR Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.gladiator");
					return true;
				}
				if(kit.equalsIgnoreCase("Hulk")) {
					p.sendMessage("§eO Kit HULK Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.hulk");
					return true;
				}
				if(kit.equalsIgnoreCase("Kangaroo")) {
					p.sendMessage("§eO Kit KANGAROO Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.kangaroo");
					return true;
				}
				if(kit.equalsIgnoreCase("Madman")) {
					p.sendMessage("§eO Kit MADMAN Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.madman");
					return true;
				}
				if(kit.equalsIgnoreCase("Ninja")) {
					p.sendMessage("§eO Kit NINJA Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.ninja");
					return true;
				}
				if(kit.equalsIgnoreCase("Phantom")) {
					p.sendMessage("§eO Kit PHANTOM Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.phantom");
					return true;
				}
				if(kit.equalsIgnoreCase("Poseidon")) {
					p.sendMessage("§eO Kit POSEIDON Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.poseidon");
					return true;
				}
				if(kit.equalsIgnoreCase("Reaper")) {
					p.sendMessage("§eO Kit REAPER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.reaper");
					return true;
				}
				if(kit.equalsIgnoreCase("Ryu")) {
					p.sendMessage("§eO Kit RYU Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.ryu");
					return true;
				}
				if(kit.equalsIgnoreCase("Seya")) {
					p.sendMessage("§eO Kit SEYA Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.seya");
					return true;
				}
				if(kit.equalsIgnoreCase("Snail")) {
					p.sendMessage("§eO Kit SNAIL Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.Snail");
					return true;
				}
				if(kit.equalsIgnoreCase("Sonic")) {
					p.sendMessage("§eO Kit SONIC Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.sonic");
					return true;
				}
				if(kit.equalsIgnoreCase("Specialist")) {
					p.sendMessage("§eO Kit SPECIALIST Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.specialist");
					return true;
				}
				if(kit.equalsIgnoreCase("Stomper")) {
					p.sendMessage("§eO Kit STOMPER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.stomper");
					return true;
				}
				if(kit.equalsIgnoreCase("Thor")) {
					p.sendMessage("§eO Kit THOR Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.thor");
					return true;
				}
				if(kit.equalsIgnoreCase("TimeLord")) {
					p.sendMessage("§eO Kit TIMELORD Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.timelord");
					return true;
				}
				if(kit.equalsIgnoreCase("Titan")) {
					p.sendMessage("§eO Kit TITAN Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.titan");
					return true;
				}
				if(kit.equalsIgnoreCase("Turtle")) {
					p.sendMessage("§eO Kit TURTLE Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.turtle");
					return true;
				}
				if(kit.equalsIgnoreCase("Urgal")) {
					p.sendMessage("§eO Kit URGAL Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.urgal");
					return true;
				}
				if(kit.equalsIgnoreCase("Viking")) {
					p.sendMessage("§eO Kit VIIKNG Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.viking");
					return true;
				}
				if(kit.equalsIgnoreCase("Viper")) {
					p.sendMessage("§eO Kit VIPER Foi removido do jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " remove kit.Viper");
					return true;
				}
						
				} else {
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/givekit <nick> <kit>");
					return true;
				}
			}
		return false;
	}
}
