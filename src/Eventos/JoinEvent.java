package Eventos;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Comandos.AdminCommand;
import Main.Main;
import ScoreBoard.ScoreboardUpdater;
import Utilidades.KitAPI;
import Utilidades.WarpsAPI;

public class JoinEvent implements Listener {
	
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	public static ItemStack click;
	public static ItemMeta clickmeta;
	public static ItemStack parkour;
	public static ItemMeta parkourmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	public static ItemStack admins;
	public static ItemMeta adminsmeta;
	
	@SuppressWarnings("deprecation")
	@EventHandler
	  public void Entrar(PlayerJoinEvent e)
	  {
	    final Player p = e.getPlayer();
	    Player[] arrayOfPlayer;
	    if (AdminCommand.admin.contains(p.getName()))
	    {
	      int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
	      for (int i = 0; i < j; i++)
	      {
	        Player s = arrayOfPlayer[i];
	        if (s.hasPermission("pluspvp.cmd.admin")) {
	          s.showPlayer(p);
	        } else {
	          s.hidePlayer(p);
	        }
	      }
	    }
	    int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
	    for (int i = 0; i < j; i++)
	    {
	    }
		p.setGameMode(GameMode.SURVIVAL);
		WarpsAPI.ir(p, "spawn");
		if (!Main.getInstace().stats.contains(p.getUniqueId() + "")) {
			Main.getInstace().stats.set(p.getUniqueId() + ".Kills", Integer.valueOf(0));
			Main.getInstace().stats.set(p.getUniqueId() + ".Deaths", Integer.valueOf(0));
			Main.getInstace().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(0));
			Main.getInstace().stats.set(p.getUniqueId() + ".Cash", Integer.valueOf(0));
			Main.getInstace().save();
		}
        KitAPI.KitDelay.remove(p.getName());
		e.setJoinMessage(null);
		p.getInventory().clear();
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
		p.getActivePotionEffects().clear();
		p.setLevel(0);
		ScoreboardUpdater.Score(p);
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
	   	p.sendMessage("                    §5§lEPIC§F§lKITS§c                   ");
	   	p.sendMessage("§7");
	   	p.sendMessage("            §aOlá, §f" + p.getName() + "§a!   ");
	   	p.sendMessage("         §aEstamos muito felizes Em Recebe-lo aqui!     ");
	    p.sendMessage("     §aNossos Plugins são novos, por isso Bugs Devem Ocorrer!  ");
	   	p.sendMessage("               §aCaso Veja um Bugs, Reporte-o!                  ");
	   	p.sendMessage("              §aObrigado e tenha Um Otimo jogo!                   ");
	   	p.sendMessage("§e");
	   	p.sendMessage("§7- Atenciosamente, Equipe §5§lEPIC§F§lKITS§c");
	   	p.sendMessage("§7- Atenciosamente, Desenvolvedor/Dono zPandaKST!");
	   	p.sendMessage("§e");
	   	Bukkit.broadcastMessage("§a➜ §7" + p.getName());
	   	

	    kits = new ItemStack(Material.CHEST);
	    kitsmeta = kits.getItemMeta();
	    kitsmeta.setDisplayName("§a§l➜ §7Kits");
	    kits.setItemMeta(kitsmeta);
	    
	    admins = new ItemStack(Material.REDSTONE);
	    adminsmeta = admins.getItemMeta();
	    adminsmeta.setDisplayName("§c§l➜ §7Admins");
	    admins.setItemMeta(adminsmeta);
	    
	    warps = new ItemStack(Material.ENCHANTED_BOOK);
	    warpsmeta = warps.getItemMeta();
	    warpsmeta.setDisplayName("§9§l➜ §7Warps");
	    warps.setItemMeta(warpsmeta);
	    
	    click = new ItemStack(Material.BONE);
	    clickmeta = click.getItemMeta();
	    clickmeta.setDisplayName("§e§l➜ §7Testar Click");
	    click.setItemMeta(clickmeta);
	    
	    p.getInventory().setItem(3, click);
	    p.getInventory().setItem(4, kits);
	    p.getInventory().setItem(5, warps);
	    p.updateInventory();
	    
	    if (p.hasPermission("pluspvp.cmd.admin")) {
	    	p.getInventory().setItem(0, admins);
	    }
	}
}