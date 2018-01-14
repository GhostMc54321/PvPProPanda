package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;

import Main.Main;
import Utilidades.KitAPI;
import Utilidades.WarpsAPI;

public class ChallengeCommand extends WarpsAPI implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
			return true;
		}
		final Player p = (Player)sender;
		if (args.length == 0) {
		if (KitAPI.getKit(p) != "Nenhum") {
			p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cVocê Já esta usando Um §fKit§c, Remova-o e Tente Novamente");
			return true;
		}
		if (KitAPI.getKit(p) == "Nenhum") {
			segundos.add(p.getDisplayName());
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable() {
				@SuppressWarnings("deprecation")
				@Override
				public void run() {
					if (segundos.contains(p.getDisplayName())) {
					p.sendMessage("§E§LACTIVEPVP ➜ §aVocê Entrou na arena §fCHALLENGE");
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
					ir(p, "Challenge");
					p.setLevel(0);
					segundos.remove(p.getDisplayName());
					KitAPI.Challenge(p);
			        for (PotionEffect effect : p.getActivePotionEffects()) {
 		            p.removePotionEffect(effect.getType());
			        }
					p.setHealth(20);
					  }
				  }
			}, 2L);
			}
		} else {
			if (args[0].equalsIgnoreCase("set")) {
			    if (p.hasPermission("pluspvp.cmd.setarenas")) {
			    	Set(p, "Challenge");
			    	p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §aVocê setou a arena §fCHALLENGE");
			}
		  }
		}
		return false;
	}
 }