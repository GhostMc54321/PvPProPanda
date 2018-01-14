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
import Manager.ListKits;

public class SorteioKitCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender.hasPermission("pluspvp.actions.sortearkit")) {
		
				final ArrayList<String> Kit = new ArrayList<>();
				for (ListKits s : ListKits.values()) {				
					if (!Kit.contains(s.name())) {
						Kit.add(s.name().toLowerCase());
						
					}
					
				}
				Bukkit.broadcastMessage("                §5§lEPIC§F§lKITS§c         ");
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("          §aEstamos iniciando um §fSorteio§a!  ");
				Bukkit.broadcastMessage("           §aPrêmio Ao Vencedor: §fUm Kit Aleatório!       ");
				Bukkit.broadcastMessage("              §aHorário de Inicio: §f" + HorarioAPI.getHorario());
				Bukkit.broadcastMessage("");
				Bukkit.broadcastMessage("                §e§LSORTEIOS             ");
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
						 	Bukkit.broadcastMessage("            §5§lEPIC§F§lKITS§c  ");
							Bukkit.broadcastMessage("");
							Bukkit.broadcastMessage("       §aO Sorteio de §fUm kit§a Foi Finalizado!");
							Bukkit.broadcastMessage("       §aO Ganhador Foi: §f" + random.getName());
							Bukkit.broadcastMessage("     §aHorário de Término: §f" + HorarioAPI.getHorario());
							Random r = new Random();
							int x = r.nextInt(Kit.size());
							Bukkit.broadcastMessage("         §aO Kit Ganho Foi: §f" + Kit.get(x));
							Bukkit.broadcastMessage("");
							Bukkit.broadcastMessage("            §e§LSORTEIOS     ");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + random.getName() + " add kit." + Kit.get(x));
					
					
					}
					
				}.runTaskLater(Main.instance, 20* 10);
			
		}
		return false;
	}
		
}