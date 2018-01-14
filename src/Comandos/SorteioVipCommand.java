package Comandos;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import API.HorarioAPI;
import Main.Main;
import Manager.ListVips;

public class SorteioVipCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender.hasPermission("pluspvp.actions.sortearvip")) {
		
				final ArrayList<String> Vip = new ArrayList<>();
				for (ListVips s : ListVips.values()) {				
					if (!Vip.contains(s.name())) {
						Vip.add(s.name().toLowerCase());
						
					}
					
				}
				Bukkit.broadcastMessage("                §5§lEPIC§F§lKITS§c          ");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("          §aEstamos iniciando um §fSorteio§a!  ");
				Bukkit.broadcastMessage("      §aPrêmio Ao Vencedor: §fUm  Vip de 15 Dias!       ");
				Bukkit.broadcastMessage("   §aHorário de Inicio: §f" + HorarioAPI.getHorario());
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("                  §e§LSORTEIOS             ");
				new BukkitRunnable() {
					
								@SuppressWarnings("deprecation")
								public void run() {
						  ArrayList<Player> Players = new ArrayList<>(); 
					      
						     for(Player all : Bukkit.getOnlinePlayers()){
						      if(!Players.contains(all)){
						       Players.add(all);
						      }
						     }
						     
						     Player random = Players.get(new Random().nextInt(Players.size()));
						 	Bukkit.broadcastMessage("           §5§lEPIC§F§lKITS§c  ");
							Bukkit.broadcastMessage("");
							Bukkit.broadcastMessage("   §aO Sorteio de §fUm Vip§a Foi Finalizado!");
							Bukkit.broadcastMessage("     §aO Ganhador Foi: §f" + random.getName());
							Bukkit.broadcastMessage("  §aHorário de Término: §f" + HorarioAPI.getHorario());
							Random r = new Random();
							int x = r.nextInt(Vip.size());
							Bukkit.broadcastMessage("         §aO Vip Ganho Foi: §f" + Vip.get(x));
							Bukkit.broadcastMessage("");
							Bukkit.broadcastMessage("           §e§LSORTEIOS     ");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + random.getName() + " group set " + Vip.get(x));
					
					
					}
					
				}.runTaskLater(Main.instance, 20* 10);
			
		}
		return false;
	}
		
}
