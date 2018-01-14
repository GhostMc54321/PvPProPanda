package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;



public class ManutentionCommand implements CommandExecutor, Listener {
	
	public static boolean manutencao = false;
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("manutencao")) {
			if (!(sender.hasPermission("pluspvp.cmd.manutencao"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/manutencao <on/off>");
				return true;
			}
			if(args.length == 1) {
				if(args[0].equalsIgnoreCase("on")) {
					if((manutencao)) {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Servidor já está em Manutenção!");
						return true;
					} else {
						Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §eServidor entrando em Manutenção! Todos serão Kickados em §f5 Segundos!");
						manutencao = true;
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aManutenção sendo Ativa...");
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aManutenção ativada com Sucesso!");
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §a Você Ativou a Manutenção!");
						for(Player todos : Bukkit.getOnlinePlayers()) {
							if (!(sender.hasPermission("masterkits.cmd.manutencao"))) {
								todos.kickPlayer("§5§lEPIC§F§lKITS§c" + "\n" + "   §7§oDesculpe, mas o Servidor em que voce estava conectado foi §cFechado§7§o Para Manutenções!" + "\n" + "§7§oEstaremos de Volta Assim que Possivel!" + "\n" + "\n" + "§e§nwww.activepvp.com.br" + "\n" + "§7Atenciosamente, Equipe PlusPvP!");
								return true;
							}
						}
						return true;
					}
				}
				if(args[0].equalsIgnoreCase("off")) {
					if(!(manutencao)) {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Servidor Não Está em Manutençao!");
						return true;
					} else {
						manutencao = false;
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aManutenção Desativada!");
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §eVoce desativou a Manutenção!");
						return true;
					}
				}
			}
		}
		
		return false;
	}
	@EventHandler
	public void aoEntrarManutencao(PlayerLoginEvent e) {
		Player p = e.getPlayer();
		if((manutencao) && (!(p.hasPermission("pluspvp.cmd.manutencao")))) {
			e.disallow(PlayerLoginEvent.Result.KICK_OTHER, "§5§lEPIC§F§lKITS§c" + "\n" + "   §7§oDesculpe, mas o Servidor em que voce estava conectado foi §cFechado§7§o Para Manutenções!" + "\n" + "§7§oEstaremos de Volta Assim que Possivel!" + "\n" + "\n" + "§e§nwww.activepvp.com.br" + "\n" + "§7Atenciosamente, Equipe PlusPvP!");
		}
	}
}
