package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Utilidades.KillsDeathsMoney;


public class GiveXpCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("xp")){
			if(!(sender.hasPermission("pluspvp.cmd.xp"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			
			
			if(args.length < 3){
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/xp dar <jogador> <100>");
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê Só pode Dar 100 de XP Por vez!");
				return true;
			}
			
			int tanto = Integer.valueOf(args[2]);
			Player t = Bukkit.getPlayer(args[1]);
			
			if(args[0].equalsIgnoreCase("dar")){
				
				try{
					KillsDeathsMoney.addMoney(t, tanto);
					sender.sendMessage("§eVocê Adicionou 100 De XP, Ao jogador " + t.getName());
					t.sendMessage("§eVocê Rececebeu 100 §eDe XP!");
				}catch(Exception e){
					sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê só pode usar Numeros aqui!");
				}
				
			}else{
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/xp dar <jogador> <100>");
			}
			
			
		}
		
		return false;
	}

}
