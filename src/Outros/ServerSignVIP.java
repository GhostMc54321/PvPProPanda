package Outros;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;



public class ServerSignVIP implements Listener {
	
	@EventHandler
	public void Escrever(SignChangeEvent e) {
		if(e.getLine(0).equalsIgnoreCase("Platinum")) {
			e.setLine(0, "");
			e.setLine(1, "  §E§LPLATINUM");
			e.setLine(2, " §7(Clique)");
			e.setLine(3, " ");
		}
		
		if(e.getLine(0).equalsIgnoreCase("premium")) {
			e.setLine(0, " ");
			e.setLine(1, "  §6§LPREMIUM");
			e.setLine(2, " §7(Clique)");
			e.setLine(3, " ");
		}
		
		if(e.getLine(0).equalsIgnoreCase("ultimate")) {
			e.setLine(0, " ");
			e.setLine(1, "  §D§LULTIMATE");
			e.setLine(2, " §7(Clique)");
			e.setLine(3, " ");
		}
		
	}
	@EventHandler
	public void inv(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if((e.getAction() == Action.RIGHT_CLICK_BLOCK))
			if(e.getClickedBlock() != null)
			   if (e.getClickedBlock().getType() == Material.WALL_SIGN || (e.getClickedBlock().getType() == Material.SIGN_POST)) {
			Sign s = (Sign)e.getClickedBlock().getState();
			String[] lines = s.getLines();
			if ((lines.length > 0) && (lines[0].equals(" ")) && 
					(lines.length > 1) && (lines[1].equals("  §e§lPLATINUM "))&&
					(lines.length > 2) && (lines[2].equals(" §7(Clique)")) &&
					(lines.length > 3) && (lines[3].equals(" "))) {
				Bukkit.broadcastMessage(" ");
				Bukkit.broadcastMessage("§c[PLACAS VIP] O Jogador §f" + p.getName() + " §cEncontrou uma Placa valendo VIP PLATINUM!");
				Bukkit.broadcastMessage(" ");
				
				
				p.sendMessage("§eSeu grupo Foi alterado automaticamente Para PLATINUM!");
					
				s.getBlock().breakNaturally();
				
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Platinum");
			
			}
			if ((lines.length > 0) && (lines[0].equals(" ")) && 
					(lines.length > 1) && (lines[1].equals("  §6§lPREMIUM "))&&
					(lines.length > 2) && (lines[2].equals(" §7(Clique)")) &&
					(lines.length > 3) && (lines[3].equals(" "))) {
				
				Bukkit.broadcastMessage(" ");
				Bukkit.broadcastMessage("§c[PLACAS VIP] O Jogador §f" + p.getName() + " §cEncontrou uma Placa valendo VIP PREMIUM!");
				Bukkit.broadcastMessage(" ");
				
				
				p.sendMessage("§eSeu grupo Foi alterado automaticamente Para PREMIUM!");
					
				s.getBlock().breakNaturally();
				
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Premium");
			}
			if ((lines.length > 0) && (lines[0].equals(" ")) && 
					(lines.length > 1) && (lines[1].equals("  §e§lPLATINUM "))&&
					(lines.length > 2) && (lines[2].equals(" §7(Clique)")) &&
					(lines.length > 3) && (lines[3].equals(" "))) {
				
				Bukkit.broadcastMessage(" ");
				Bukkit.broadcastMessage("§c[PLACAS VIP] O Jogador §f" + p.getName() + " §cEncontrou uma Placa valendo VIP ULTIMATE	!");
				Bukkit.broadcastMessage(" ");

				p.sendMessage("§eSeu grupo Foi alterado automaticamente Para ULTIMATE!");
					
				s.getBlock().breakNaturally();
				
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " group set Ultimate");
			}
			   }
	}
}