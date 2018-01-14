package Inventarios;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Warps implements Listener, CommandExecutor {
	
    public static java.util.List<String> Lore(String string)
    {
		return null;

    }
	
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack vidro1;
	public static ItemMeta vidro1meta;
	public static ItemStack fps;
	public static ItemMeta fpsmeta;
	public static ItemStack main;
	public static ItemMeta mainmeta;
	public static ItemStack lava;
	public static ItemMeta lavameta;
	public static ItemStack sumo;
	public static ItemMeta sumometa;
	public static ItemStack fish;
	public static ItemMeta fishmeta;
	public static ItemStack z1v1;
	public static ItemMeta z1v1meta;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	
	   @EventHandler
	   public void Clicar(PlayerInteractEvent e)
	   {
	     Player p = e.getPlayer();
	     if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) &&
	       (p.getItemInHand().getType() == Material.ENCHANTED_BOOK) &&
	       (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§9§l➜ §7Warps"))) {
	       p.chat("/warps");
	     }
}
	@EventHandler
	public void Execute(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§9▸ Warps")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();			
			}
			if (e.getCurrentItem().isSimilar(vidro)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(vidro1)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(main)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/main");
			}
			if (e.getCurrentItem().isSimilar(sumo)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/sumo");
			}
			if (e.getCurrentItem().isSimilar(lava)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/challenge");
			}
			if (e.getCurrentItem().isSimilar(fps)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/fps");
			}
			if (e.getCurrentItem().isSimilar(fish)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/fisherman");
			}
			if (e.getCurrentItem().isSimilar(z1v1)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/1v1");
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
		Inventory warp = Bukkit.createInventory(p, 54, "§9▸ Warps");
		
	    vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
	    vidrometa = vidro.getItemMeta();
	    vidrometa.setDisplayName("§a▸ Warps");
	    vidro.setItemMeta(vidrometa);
		
	    livro = new ItemStack(Material.BOOK);
	    livrometa = livro.getItemMeta();
	    livrometa.setDisplayName("§9▸ Warps");
	    livro.setItemMeta(livrometa);
	    
	    lava = new ItemStack(Material.LAVA);
	    lavameta = lava.getItemMeta();
	    lavameta.setDisplayName("§e▸ Lava");
	    lavameta.setLore(Lore("§a▸ Entrar"));
	    lava.setItemMeta(lavameta);
	    
	    fps = new ItemStack(Material.GLASS);
	    fpsmeta = fps.getItemMeta();
	    fpsmeta.setDisplayName("§e▸ FPS");
	    fpsmeta.setLore(Lore("§a▸ Entrar"));
	    fps.setItemMeta(fpsmeta);
	    
	    main = new ItemStack(Material.DIAMOND_CHESTPLATE);
	    mainmeta = main.getItemMeta();
	    mainmeta.setDisplayName("§e▸ Main");
	    mainmeta.setLore(Lore("§a▸ Entrar"));
	    main.setItemMeta(mainmeta);
	    
	    sumo = new ItemStack(Material.STICK);
	    sumometa = sumo.getItemMeta();
	    sumometa.setDisplayName("§e▸ Sumo");
	    sumometa.setLore(Lore("§a▸ Entrar"));
	    sumo.setItemMeta(sumometa);
	    
	    fish = new ItemStack(Material.PISTON_BASE);
	    fishmeta = fish.getItemMeta();
	    fishmeta.setDisplayName("§e▸ Parkuor");
	    fishmeta.setLore(Lore("§a▸ Entrar"));
	    fish.setItemMeta(fishmeta);
	    
	    z1v1 = new ItemStack(Material.BLAZE_ROD);
	    z1v1meta = z1v1.getItemMeta();
	    z1v1meta.setDisplayName("§e▸ 1v1");
	    z1v1meta.setLore(Lore("§a▸ Entrar"));
	    z1v1.setItemMeta(z1v1meta);

	    for (int i =0; i != 54; i++) {
	    	  warp.setItem(0, vidro);    
              warp.setItem(1, vidro);      
              warp.setItem(2, vidro);
              warp.setItem(3, vidro);
              warp.setItem(4, vidro);
              warp.setItem(5, vidro);
              warp.setItem(6, vidro);
              warp.setItem(7, vidro);
              warp.setItem(8, vidro);
              warp.setItem(9, vidro);
              warp.setItem(9, vidro);
              warp.setItem(9, vidro);
              warp.setItem(9, vidro);
              warp.setItem(9, vidro);
              warp.setItem(10, vidro);
              warp.setItem(11, vidro);
              warp.setItem(12, vidro);
              warp.setItem(13, livro);
              warp.setItem(14, vidro);
              warp.setItem(15, vidro);
              warp.setItem(16, vidro);
              warp.setItem(17, vidro);
              warp.setItem(18, vidro);
              warp.setItem(19, vidro);
              warp.setItem(25, vidro);
              warp.setItem(26, vidro);
              warp.setItem(27, vidro);
              warp.setItem(28, vidro);
              warp.setItem(30, vidro);
              warp.setItem(31, vidro);
              warp.setItem(32, vidro);
              warp.setItem(33, vidro);
              warp.setItem(34, vidro);
              warp.setItem(35, vidro);
              warp.setItem(36, vidro);
              warp.setItem(37, vidro);
              warp.setItem(38, vidro);
              warp.setItem(39, vidro);
              warp.setItem(40, vidro);
              warp.setItem(41, vidro);
              warp.setItem(42, vidro);
              warp.setItem(43, vidro);
              warp.setItem(44, vidro);
              warp.setItem(45, vidro);
              warp.setItem(46, vidro);
              warp.setItem(47, vidro);
              warp.setItem(48, vidro);
              warp.setItem(49, vidro);
              warp.setItem(50, vidro);
              warp.setItem(51, vidro);
              warp.setItem(52, vidro);
              warp.setItem(53, vidro);
              warp.setItem(20, fps);
              warp.setItem(21, main);
              warp.setItem(22, fish);
              warp.setItem(23, lava);
              warp.setItem(24, sumo);
              warp.setItem(29, z1v1);


	    }
		
	    p.openInventory(warp);
	    return false;
	}
 }
