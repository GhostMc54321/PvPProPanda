package Inventarios;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import Manager.Groups;

public class PerfilGUI implements Listener, CommandExecutor {
	
    public static java.util.List<String> Lore(String string)
    {
		return null;

    }
	
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	public static ItemStack head;
	public static ItemMeta headmeta;
	
	@EventHandler
	public void Execute(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§cAdmins")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();			
			}
			if (e.getCurrentItem().isSimilar(vidro)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(livro)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			}
			}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoce precisa ser um player");
			return true;
		}
		Player p = (Player)sender;
		Inventory warp = Bukkit.createInventory(p, 54, "§aStatus");
		
		
	    livro = new ItemStack(Material.BOOK);
	    livrometa = livro.getItemMeta();
	    livrometa.setDisplayName("§a▸ Status");
	    livro.setItemMeta(livrometa);
	    
	    
        ItemStack stack = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta meta = (SkullMeta) stack.getItemMeta();
		meta.setOwner(p.getName());
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("§7");
		lore.add("§c§m---(-)-----------------(-)---");
		lore.add("§7➜ Seu Nick: §7" + p.getName());
		lore.add("§7➜ Grupo:: " + Groups.getRank(p));
		lore.add("§c§m---(-)-----------------(-)---");
		meta.setLore(lore);

		meta.setDisplayName("§cStatus:");
		stack.setItemMeta(meta);
	    

	    for (int i =0; i != 54; i++) {
              warp.setItem(13, livro);
      		  warp.setItem(22, stack);
	    }
		
	    p.openInventory(warp);
	    return false;
	}
 }
