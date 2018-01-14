package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Utilidades.KillsDeathsMoney;


public class UpRankCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("upar")){
		
			if(args.length < 3){			
			Player t = Bukkit.getPlayer(args[1]);
					KillsDeathsMoney.removePts(t, 100);
					sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aNivel Upado com Sucesso!");
				}
			}
		
		return false;
	}
}

	
