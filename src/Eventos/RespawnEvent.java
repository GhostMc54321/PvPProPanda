package Eventos;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Kits.Kangaroo;
import Kits.TimeLord;
import ScoreBoard.ScoreboardUpdater;
import Utilidades.KitAPI;

public class RespawnEvent implements Listener {
	
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
	
	
	@EventHandler
	public void Respawnar(PlayerRespawnEvent e) {
		Player p = e.getPlayer();
		if (Kangaroo.KangarroStats.containsKey(p.getName())) {
			Kangaroo.KangarroStats.remove(p.getName());
			ScoreboardUpdater.Score(p);
		        }
		KitAPI.RemoveKit(p);
		p.setLevel(0);
		p.getInventory().clear();
		KitAPI.KitDelay.remove(p.getName());
		TimeLord.freeze.remove(p.getName());

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
	    p.setGameMode(GameMode.SURVIVAL);
	    
	    if (p.hasPermission("pluspvp.cmd.admin")) {
	    	p.getInventory().setItem(0, admins);
	}

	}
}
