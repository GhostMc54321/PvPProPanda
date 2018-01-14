package Comandos;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AdminCommand implements CommandExecutor, Listener {
	
	public static ArrayList<String> admin = new ArrayList<>();
	public static HashMap<String, ItemStack[]> saveinv = new HashMap<String, ItemStack[]>();
	public static HashMap<String, ItemStack[]> savearmor = new HashMap<String, ItemStack[]>();
	
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		if (!(sender.hasPermission("pluspvp.cmd.admin"))) {
			sender.sendMessage("§5§lEPIC§F§lKITS §c➜ §cDesculpe, mas você não tem permissão para fazer isso.");
			return true;
		}
		Player p = (Player)sender;
		if (args.length == 0) {
           if (!admin.contains(p.getName())) {
           p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aVoce entrou no Modo Admin");
           for (Player s : Bukkit.getOnlinePlayers()) {
        	   if (!s.hasPermission("pluspvp.cmd.admin")) {
        	       s.hidePlayer(p);
                   }
                }
		        p.setGameMode(GameMode.CREATIVE);
	            admin.add(p.getName());
	            saveinv.put(p.getName(), p.getInventory().getContents());
	            savearmor.put(p.getName(), p.getInventory().getArmorContents());
		        p.setAllowFlight(true);
		        p.getInventory().clear();
			    p.updateInventory();
			    
			    ItemStack barra = new ItemStack(Material.BEDROCK);
			    ItemMeta barrameta = barra.getItemMeta();
			    barrameta.setDisplayName("§aPrender Jogador");
			    barra.setItemMeta(barrameta);
			    
			    ItemStack estrela = new ItemStack(Material.MUSHROOM_SOUP);
			    ItemMeta estrelameta = estrela.getItemMeta();
			    estrelameta.setDisplayName("§aAutoSoup");
			    estrela.setItemMeta(estrelameta);
			    
			   // HotBar
			    p.getInventory().setItem(3, barra);
			    p.getInventory().setItem(5, estrela);
			    p.updateInventory();
			    
		     } else {
		    	 p.sendMessage("§5§lEPIC§F§lKITS §c➜ §cVoce saiu do Modo Admin");
		    	 p.getInventory().clear();
		    	 admin.remove(p.getName());
		           for (Player s : Bukkit.getOnlinePlayers()) {
		        	   if (!s.hasPermission("pluspvp.cmd.admin")) {
		        	       s.showPlayer(p);
		         }
		       }
		           p.setGameMode(GameMode.SURVIVAL);
		           p.getInventory().setContents(saveinv.get(p.getName()));
		           p.getInventory().setArmorContents(savearmor.get(p.getName()));
		     }
		    }
		return false;
   }
	@EventHandler
	public void prender(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.BEDROCK && admin.contains(e.getPlayer().getName())) {
			Player p = e.getPlayer();
			Player t = (Player)e.getRightClicked();
			p.chat("/arena " + t.getName());
      }
  }
	@EventHandler
	public void AUTOSOUP(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.MUSHROOM_SOUP && admin.contains(e.getPlayer().getName())) {
			Player p = e.getPlayer();
			Player t = (Player)e.getRightClicked();
			p.chat("/autosoup " + t.getName());
      }
  }
	
	public static int getMaterial(Player p, Material m) {
		int value = 0;
		for (ItemStack item : p.getInventory().getContents()) {
			if (item != null && item.getType() == m && item.getAmount() > 0) {
				value += item.getAmount();
				
			}
		}
		return value;
  }
	@EventHandler
	public void Abririnv(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.AIR && admin.contains(e.getPlayer().getName())) {
			Player t = (Player)e.getRightClicked();
			e.getPlayer().openInventory(t.getInventory());
		}
	}
}