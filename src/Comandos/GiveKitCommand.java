package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveKitCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("givekit")) {
			if (!(sender.hasPermission("pluspvp.cmd.givekit"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/givekit <jogador> <kit>");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String kit = args[1];
				Player jogador = Bukkit.getPlayer(args[0]);
				if(kit.equalsIgnoreCase("Boxer")) {
					p.sendMessage("§eO Kit BOXER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.boxer");
					return true;
				}
				if(kit.equalsIgnoreCase("Ajnin")) {
					p.sendMessage("§eO Kit AJNIN Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.ajnin");
					return true;
				}
				if(kit.equalsIgnoreCase("Switcher")) {
					p.sendMessage("§eO Kit SWITCHER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.switcher");
					return true;
				}
				if(kit.equalsIgnoreCase("Thresh")) {
					p.sendMessage("§eO Kit THRESH Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.thresh");
					return true;
				}
				if(kit.equalsIgnoreCase("BurstMaster")) {
					p.sendMessage("§eO Kit BUSRSTMASTER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.burstmaster");
					return true;
				}
				if(kit.equalsIgnoreCase("Monk")) {
					p.sendMessage("§eO Kit MONK Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.monk");
					return true;
				}
				if(kit.equalsIgnoreCase("Camel")) {
					p.sendMessage("§eO Kit CAMEL Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.camel");
					return true;
				}
				if(kit.equalsIgnoreCase("Deshfire")) {
					p.sendMessage("§eO Kit DESHFIRE Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.deshfire");
					return true;
				}
				if(kit.equalsIgnoreCase("Deshviper")) {
					p.sendMessage("§eO Kit DESHVIPER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.deshviper");
					return true;
				}
				if(kit.equalsIgnoreCase("Fisherman")) {
					p.sendMessage("§eO Kit FISHERMAN Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.fisherman");
					return true;
				}
				if(kit.equalsIgnoreCase("Forcefield")) {
					p.sendMessage("§eO Kit FORCEFIELD Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.forcefield");
					return true;
				}
				if(kit.equalsIgnoreCase("Gladiator")) {
					p.sendMessage("§eO Kit GLADIATOR Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.gladiator");
					return true;
				}
				if(kit.equalsIgnoreCase("Hulk")) {
					p.sendMessage("§eO Kit HULK Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.hulk");
					return true;
				}
				if(kit.equalsIgnoreCase("Kangaroo")) {
					p.sendMessage("§eO Kit KANGAROO Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.kangaroo");
					return true;
				}
				if(kit.equalsIgnoreCase("Madman")) {
					p.sendMessage("§eO Kit MADMAN Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.madman");
					return true;
				}
				if(kit.equalsIgnoreCase("Ninja")) {
					p.sendMessage("§eO Kit NINJA Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.ninja");
					return true;
				}
				if(kit.equalsIgnoreCase("Phantom")) {
					p.sendMessage("§eO Kit PHANTOM Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.phantom");
					return true;
				}
				if(kit.equalsIgnoreCase("Poseidon")) {
					p.sendMessage("§eO Kit POSEIDON Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.poseidon");
					return true;
				}
				if(kit.equalsIgnoreCase("Reaper")) {
					p.sendMessage("§eO Kit REAPER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.reaper");
					return true;
				}
				if(kit.equalsIgnoreCase("Ryu")) {
					p.sendMessage("§eO Kit RYU Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.ryu");
					return true;
				}
				if(kit.equalsIgnoreCase("Seya")) {
					p.sendMessage("§eO Kit SEYA Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.seya");
					return true;
				}
				if(kit.equalsIgnoreCase("Snail")) {
					p.sendMessage("§eO Kit SNAIL Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.Snail");
					return true;
				}
				if(kit.equalsIgnoreCase("Sonic")) {
					p.sendMessage("§eO Kit SONIC Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.sonic");
					return true;
				}
				if(kit.equalsIgnoreCase("Specialist")) {
					p.sendMessage("§eO Kit SPECIALIST Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.specialist");
					return true;
				}
				if(kit.equalsIgnoreCase("Stomper")) {
					p.sendMessage("§eO Kit STOMPER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.stomper");
					return true;
				}
				if(kit.equalsIgnoreCase("Thor")) {
					p.sendMessage("§eO Kit THOR Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.thor");
					return true;
				}
				if(kit.equalsIgnoreCase("TimeLord")) {
					p.sendMessage("§eO Kit TIMELORD Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.timelord");
					return true;
				}
				if(kit.equalsIgnoreCase("Titan")) {
					p.sendMessage("§eO Kit TITAN Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.titan");
					return true;
				}
				if(kit.equalsIgnoreCase("Turtle")) {
					p.sendMessage("§eO Kit TURTLE Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.turtle");
					return true;
				}
				if(kit.equalsIgnoreCase("Urgal")) {
					p.sendMessage("§eO Kit URGAL Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.urgal");
					return true;
				}
				if(kit.equalsIgnoreCase("Viking")) {
					p.sendMessage("§eO Kit VIIKNG Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.viking");
					return true;
				}
				if(kit.equalsIgnoreCase("Viper")) {
					p.sendMessage("§eO Kit VIPER Foi dado ao jogador " + jogador.getName() + "§e(" + jogador.getUniqueId() + "§e)");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + jogador.getName() + " add kit.Viper");
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
