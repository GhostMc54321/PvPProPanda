package Inventarios;

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

public class Monitor implements Listener, CommandExecutor {
	
    public static java.util.List<String> Lore(String string)
    {
		return null;

    }
	
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	public static ItemStack close;
	public static ItemMeta closemeta;
	public static ItemStack adminmode;
	public static ItemMeta adminmodemeta;
	public static ItemStack monitor;
	public static ItemMeta monitormeta;
	public static ItemStack vis;
	public static ItemMeta vismeta;
	
	@EventHandler
	public void Execute(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§cAdmins - Monitor")) {
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
			if (e.getCurrentItem().isSimilar(vis)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/monitorar on");
			}
			if (e.getCurrentItem().isSimilar(monitor)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/monitorar off");
			}
			if (e.getCurrentItem().isSimilar(close)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§cInventário de §FMONITOR§c Fechado!");
				
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
		Inventory warp = Bukkit.createInventory(p, 54, "§cAdmins - Monitor");
		
		
	    livro = new ItemStack(Material.BOOK);
	    livrometa = livro.getItemMeta();
	    livrometa.setDisplayName("§c▸ Monitor");
	    livro.setItemMeta(livrometa);
	    
	    
	    monitor = new ItemStack(Material.ARROW);
	    monitormeta = monitor.getItemMeta();
	    monitormeta.setDisplayName("§C▸ Desativar Modo Monitor");
	    monitor.setItemMeta(monitormeta);
	    
	    vis = new ItemStack(Material.ARROW);
	    vismeta = vis.getItemMeta();
	    vismeta.setDisplayName("§a▸ Ativar Modo Monitor");
	    vis.setItemMeta(vismeta);
	    
	    close = new ItemStack(Material.REDSTONE);
	    closemeta = close.getItemMeta();
	    closemeta.setDisplayName("§c▸ Fechar");
	    close.setItemMeta(closemeta);
	    

	    for (int i =0; i != 54; i++) {
              warp.setItem(13, livro);
              warp.setItem(21, vis);
              warp.setItem(23, monitor);
	    }
		
	    p.openInventory(warp);
	    return false;
	}
 }
