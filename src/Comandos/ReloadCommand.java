package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import Main.Main;

public class ReloadCommand implements CommandExecutor{


	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cApenas jogadores podem executar esse comando");
			return true;
		}
		Player p = (Player)sender;
		
		if (args.length == 0 && cmd.getName().equalsIgnoreCase("atualizar")) {
		if (p.hasPermission("pluspvp.cmd.atualizar")) {
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce iniciou A Reinicialização!");
			Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f30 Segundos§a!");
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f20 Segundos§a!");
					
				}
			}.runTaskLater(Main.instance, 200L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f10 Segundos§a!");
					
				}
			}.runTaskLater(Main.instance, 400L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f5 Segundos§a!");
					
				}
			}.runTaskLater(Main.instance, 500L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f4 Segundos§a!");
					
				}
			}.runTaskLater(Main.instance, 520L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f3 Segundos§a!");
					
				}
			}.runTaskLater(Main.instance, 540L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando Automaticamente em §f2 Segundos§a!");
					
				}
			}.runTaskLater(Main.instance, 560L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aServidor Reiniciando...");
					
				}
			}.runTaskLater(Main.instance, 580L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					for (Player s : Bukkit.getOnlinePlayers()) {
						s.kickPlayer("§5§lEPIC§F§lKITS§c\n§7Este servidor Foi Reiniciado!\n§7Estamos preparando Tudo...\n\n\n§ewww.activepvp.com.br ");
					}
				}
			}.runTaskLater(Main.instance, 600L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.shutdown();
				}
			}.runTaskLater(Main.instance, 640L);
		} else {
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
	    }
	    }
	    return false;
	  }
	}
