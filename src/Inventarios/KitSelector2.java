package Inventarios;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
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



public class KitSelector2 implements Listener, CommandExecutor {
	
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static java.util.List<String> Lore(String string)
      {
        String[] split = string.split(" ");
        string = "";
        ChatColor color = ChatColor.GOLD;
            ArrayList<String> newString = new ArrayList();
        for (int i = 0; i < split.length; i++)
        {
          if ((string.length() > 20) || (string.endsWith(".")))
          {
            newString.add(color + string);
            if ((string.endsWith("."))) {
              newString.add("");
            }
            string = "";
          }
          string = string + (string.length() == 0 ? "" : " ") + split[i];
        }
        newString.add(string);
        return newString;
      }
    
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack vidro1;
	public static ItemMeta vidro1meta;
	public static ItemStack bolo;
	public static ItemMeta bolometa;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	public static ItemStack corante;
	public static ItemMeta corantemeta;
	public static ItemStack pvp;
	public static ItemMeta pvpmeta;
	public static ItemStack kangaroo;
	public static ItemStack ajnin;
	public static ItemMeta ajninmeta;
	public static ItemStack thresh;
	public static ItemMeta threshmeta;
	public static ItemMeta kangaroometa;
	public static ItemStack viper;
	public static ItemMeta vipermeta;
	public static ItemStack snail;
	public static ItemMeta snailmeta;
	public static ItemStack health;
	public static ItemMeta healthmeta;
	public static ItemStack reaper;
	public static ItemMeta reapermeta;
	public static ItemStack switcher;
	public static ItemMeta switchermeta;
	public static ItemStack Fisherman;
	public static ItemMeta Fishermanmeta;
	public static ItemStack stomper;
	public static ItemMeta stompermeta;
	public static ItemStack viking;
	public static ItemMeta vikingmeta;
	public static ItemStack ninja;
	public static ItemMeta ninjameta;
	public static ItemStack boxer;
	public static ItemMeta boxermeta;
	public static ItemStack deshfire;
	public static ItemMeta deshfiremeta;
	public static ItemStack deshviper;
	public static ItemMeta deshvipermeta;
	public static ItemStack ff;
	public static ItemMeta ffmeta;
	public static ItemStack hulk;
	public static ItemMeta hulkmeta;
	public static ItemStack madman;
	public static ItemMeta madmanmeta;
	public static ItemStack ryu;
	public static ItemMeta ryumeta;
	public static ItemStack seya;
	public static ItemStack monk;
	public static ItemMeta monkmeta;
	public static ItemMeta seyameta;
	public static ItemStack sonic;
	public static ItemMeta sonicmeta;
	public static ItemStack specialist;
	public static ItemMeta specialistmeta;
	public static ItemStack titan;
	public static ItemMeta titanmeta;
	public static ItemStack turtle;
	public static ItemMeta turtlemeta;
	public static ItemStack urgal;
	public static ItemMeta urgalmeta;
	public static ItemStack thor;
	public static ItemMeta thormeta;
	public static ItemStack timelord;
	public static ItemMeta timelordmeta;
	public static ItemStack magma;
	public static ItemMeta magmameta;
	public static ItemStack rain;
	public static ItemMeta rainmeta;
	public static ItemStack phantom;
	public static ItemMeta phantommeta;
	public static ItemStack poseidon;
	public static ItemMeta poseidonmeta;
	public static ItemStack quickdropper;
	public static ItemMeta quickdroppermeta;
	public static ItemStack Camel;
	public static ItemMeta Camelmeta;
	public static ItemStack burstmaster;
	public static ItemMeta burstmastermeta;
	public static ItemStack Gladiator;
	public static ItemMeta Gladiatormeta;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	public static ItemStack ar;
	public static ItemMeta armeta;
	public static ItemStack close;
	public static ItemMeta closemeta;
	public static ItemStack hunter;
	public static ItemMeta huntermeta;
	public static ItemStack arrow;
	public static ItemMeta arrowmeta;
	public static ItemStack arrow2;
	public static ItemMeta arrow2meta;
	public static ItemStack anchor;
	public static ItemMeta anchormeta;
	public static ItemStack assassin;
	public static ItemMeta assassinmeta;

	

	@EventHandler
	public void Execute(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§7▸ Kits (Página 2)")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();
				}
			}
		}
	}
	@EventHandler
	public void Execute5(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§7▸ Kits (Página 2)")) {
				if (e.getCurrentItem().isSimilar(bolo)) {
					e.setCancelled(true);
					p.closeInventory();
				}
			}
		}
	}
	@EventHandler
	public void Execute1(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§7▸ Kits (Página 2)")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();				
			}
			if (e.getCurrentItem().isSimilar(pvp)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit pvp");
			}
			if (e.getCurrentItem().isSimilar(ajnin)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit ajnin");
			}
			if (e.getCurrentItem().isSimilar(anchor)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit anchor");
			}
			if (e.getCurrentItem().isSimilar(hunter)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit hunter");
			}
			if (e.getCurrentItem().isSimilar(assassin)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit assassin");
			}
			if (e.getCurrentItem().isSimilar(monk)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit monk");
			}
			if (e.getCurrentItem().isSimilar(kangaroo)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit kangaroo");
			}
			if (e.getCurrentItem().isSimilar(health)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit health");
			}
			if (e.getCurrentItem().isSimilar(viper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit viper");
			}
			if (e.getCurrentItem().isSimilar(rain)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit rain");
			}
			if (e.getCurrentItem().isSimilar(snail)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit snail");
			}
			if (e.getCurrentItem().isSimilar(reaper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit reaper");
			}
			if (e.getCurrentItem().isSimilar(Fisherman)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit fisherman");
			}
			if (e.getCurrentItem().isSimilar(stomper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit stomper");
			}
			if (e.getCurrentItem().isSimilar(magma)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit magma");
			}
			if (e.getCurrentItem().isSimilar(viking)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit viking");
			}
			if (e.getCurrentItem().isSimilar(thresh)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit thresh");
			}
			if (e.getCurrentItem().isSimilar(switcher)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit switcher");
			}
			if (e.getCurrentItem().isSimilar(ninja)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit ninja");
			}
			if (e.getCurrentItem().isSimilar(boxer)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit boxer");
			}
			if (e.getCurrentItem().isSimilar(deshfire)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit deshfire");
			}
			if (e.getCurrentItem().isSimilar(deshviper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit deshviper");
			}
			if (e.getCurrentItem().isSimilar(ff)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit forcefield");
			}
			if (e.getCurrentItem().isSimilar(hulk)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit hulk");
			}
			if (e.getCurrentItem().isSimilar(madman)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit madman");
			}
			if (e.getCurrentItem().isSimilar(ryu)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit ryu");
			}
			if (e.getCurrentItem().isSimilar(seya)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit seya");
			}
			if (e.getCurrentItem().isSimilar(sonic)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit sonic");
			}
			if (e.getCurrentItem().isSimilar(specialist)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit specialist");
			}
			if (e.getCurrentItem().isSimilar(titan)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit titan");
			}
			if (e.getCurrentItem().isSimilar(quickdropper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit quickdropper");
			}
			if (e.getCurrentItem().isSimilar(turtle)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit turtle");
			}
			
			if (e.getCurrentItem().isSimilar(urgal)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit urgal");
			}
			if (e.getCurrentItem().isSimilar(corante)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kits2");
			}
			if (e.getCurrentItem().isSimilar(thor)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit thor");
			}
			if (e.getCurrentItem().isSimilar(timelord)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit timelord");
			}
			if (e.getCurrentItem().isSimilar(phantom)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit phantom");
			}
			if (e.getCurrentItem().isSimilar(poseidon)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit poseidon");
			}
			if (e.getCurrentItem().isSimilar(phantom)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit phantom");
			}
			if (e.getCurrentItem().isSimilar(Camel)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit Camel");
			}
			if (e.getCurrentItem().isSimilar(burstmaster)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit burstmaster");
			}
			if (e.getCurrentItem().isSimilar(Gladiator)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit Gladiator");
			}
			if (e.getCurrentItem().isSimilar(ar)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(vidro1)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(arrow)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§cEste Menu Não Possui Páginas Posteriores!");
			}
			if (e.getCurrentItem().isSimilar(arrow2)) {
				e.setCancelled(true);
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1,0F);
				p.chat("/kits");
			}
			if (e.getCurrentItem().isSimilar(close)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§cMenu de §fKITS§c Fechado!");
			}
				
		}
	  }
	}
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoce precisa ser um player");
			return true;
		}
		Player p = (Player)sender;
		Inventory kit = Bukkit.createInventory(p, 54, "§7▸ Kits (Página 2)");
		
	    vidro1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
	    vidro1meta = vidro1.getItemMeta();
	    vidro1meta.setDisplayName("§c-");
	    vidro1.setItemMeta(vidro1meta);
	    
	    close = new ItemStack(Material.getMaterial(351), 1, (short)1);
	    closemeta = close.getItemMeta();
	    closemeta.setDisplayName("§c▸ Fechar");
	    close.setItemMeta(closemeta);
	    
	    ar = new ItemStack(Material.STAINED_GLASS_PANE);
	    armeta = ar.getItemMeta();
	    armeta.setDisplayName("§0-");
	    ar.setItemMeta(armeta);
	    
	    arrow = new ItemStack(Material.ARROW);
	    arrowmeta = arrow.getItemMeta();
	    arrowmeta.setDisplayName("§c▸ Não existem Paginas Posteriores");
	    arrow.setItemMeta(arrowmeta);
	    
	    arrow2 = new ItemStack(Material.ARROW);
	    arrow2meta = arrow2.getItemMeta();
	    arrow2meta.setDisplayName("§a▸ Página Anterior");
	    arrow2.setItemMeta(arrow2meta);
	    
	    
	    vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
	    vidrometa = vidro.getItemMeta();
	    vidrometa.setDisplayName("§cVoce não Possui este Kit");
	    vidro.setItemMeta(vidrometa);
		
	    livro = new ItemStack(Material.BOOK);
	    livrometa = livro.getItemMeta();
	    livrometa.setDisplayName("§a▸ Kits");
	    livro.setItemMeta(livrometa);
	    
	    thor = new ItemStack(Material.STONE_AXE);
	    thormeta = thor.getItemMeta();
	    thormeta.setDisplayName("§e▸ Thor");
	    thormeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    thor.setItemMeta(thormeta);
	    
	    anchor = new ItemStack(Material.ANVIL);
	    anchormeta = anchor.getItemMeta();
	    anchormeta.setDisplayName("§e▸ Anchor");
	    anchormeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    anchor.setItemMeta(anchormeta);
	    
	    hunter = new ItemStack(Material.STICK);
	    huntermeta = hunter.getItemMeta();
	    huntermeta.setDisplayName("§e▸ Hunter");
	    huntermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    hunter.setItemMeta(huntermeta);
	    
	    rain = new ItemStack(Material.ARROW);
	    rainmeta = rain.getItemMeta();
	    rainmeta.setDisplayName("§e▸ Rain");
	    rainmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    rain.setItemMeta(rainmeta);
	    
	    health = new ItemStack(Material.FLOWER_POT);
	    healthmeta = health.getItemMeta();
	    healthmeta.setDisplayName("§e▸ Health");
	    healthmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    health.setItemMeta(healthmeta);
	    
	    assassin = new ItemStack(Material.GOLD_SWORD);
	    assassinmeta = assassin.getItemMeta();
	    assassinmeta.setDisplayName("§e▸ Assassin");
	    assassinmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    assassin.setItemMeta(assassinmeta);
	    
	    monk = new ItemStack(Material.BLAZE_ROD);
	    monkmeta = monk.getItemMeta();
	    monkmeta.setDisplayName("§e▸ Monk");
	    monkmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    monk.setItemMeta(monkmeta);
	    
	    magma = new ItemStack(Material.BLAZE_POWDER);
	    magmameta = magma.getItemMeta();
	    magmameta.setDisplayName("§e▸ Magma");
	    magmameta.setLore(Lore("§a▸ Selecionar §aKit"));
	    magma.setItemMeta(magmameta);
	    
	    switcher = new ItemStack(Material.SNOW_BALL);
	    switchermeta = switcher.getItemMeta();
	    switchermeta.setDisplayName("§e▸ Switcher");
	    switchermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    switcher.setItemMeta(switchermeta);
	    
	    thresh = new ItemStack(Material.LEASH);
	    threshmeta = thresh.getItemMeta();
	    threshmeta.setDisplayName("§e▸ Thresh");
	    threshmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    thresh.setItemMeta(threshmeta);
	    
	    timelord = new ItemStack(Material.WATCH);
	    timelordmeta = timelord.getItemMeta();
	    timelordmeta.setDisplayName("§e▸ TimeLord");
	    timelordmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    timelord.setItemMeta(timelordmeta);
	    
	    ajnin = new ItemStack(Material.COMPASS);
	    ajninmeta = ajnin.getItemMeta();
	    ajninmeta.setDisplayName("§e▸ Ajnin");
	    ajninmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    ajnin.setItemMeta(ajninmeta);

	    quickdropper = new ItemStack(Material.BOWL);
	    quickdroppermeta = quickdropper.getItemMeta();
	    quickdroppermeta.setDisplayName("§e▸ QuickDropper");
	    quickdroppermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    quickdropper.setItemMeta(quickdroppermeta);
	    
	    poseidon = new ItemStack(Material.WATER);
	    poseidonmeta = poseidon.getItemMeta();
	    poseidonmeta.setDisplayName("§e▸ Poseidon");
	    poseidonmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    poseidon.setItemMeta(poseidonmeta);
	    
	    phantom = new ItemStack(Material.FEATHER);
	    phantommeta = phantom.getItemMeta();
	    phantommeta.setDisplayName("§e▸ Phantom");
	    phantommeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    phantom.setItemMeta(phantommeta);
	    
	    Camel = new ItemStack(Material.SANDSTONE);
	    Camelmeta = Camel.getItemMeta();
	    Camelmeta.setDisplayName("§e▸ Camel");
	    Camelmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    Camel.setItemMeta(Camelmeta);
	    
	    burstmaster = new ItemStack(Material.STONE_HOE);
	    burstmastermeta = burstmaster.getItemMeta();
	    burstmastermeta.setDisplayName("§e▸ BurstMaster");
	    burstmastermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    burstmaster.setItemMeta(burstmastermeta);
	    
	    Gladiator = new ItemStack(Material.IRON_FENCE);
	    Gladiatormeta = Gladiator.getItemMeta();
	    Gladiatormeta.setDisplayName("§e▸ Gladiator");
	    Gladiatormeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    Gladiator.setItemMeta(Gladiatormeta);
	    
	    for (int i =0; i != 54; i++) {
	    	  kit.setItem(0, close); 
	    	  kit.setItem(1, vidro1); 
	    	  kit.setItem(2, ar); 
	    	  kit.setItem(3, vidro1); 
	    	  kit.setItem(4, ar); 
	    	  kit.setItem(5, vidro1); 
	    	  kit.setItem(6, ar); 
	    	  kit.setItem(7, vidro1); 
	    	  kit.setItem(8, ar); 
	    	  kit.setItem(9, ar); 
	    	  kit.setItem(10, ar); 
	    	  kit.setItem(11, ar); 
	    	  kit.setItem(12, vidro1); 
	    	  kit.setItem(13, livro); 
	    	  kit.setItem(14, vidro1); 
	    	  kit.setItem(15, ar); 
	    	  kit.setItem(16, ar); 
	    	  kit.setItem(17, ar); 
	    	  kit.setItem(18, vidro1); 
	    	  kit.setItem(26, vidro1); 
	    	  kit.setItem(27, arrow2); 
	    	  kit.setItem(35, arrow); 
	    	  kit.setItem(36, ar); 
	    	  kit.setItem(44, ar); 
	    	  kit.setItem(45, ar); 
	    	  kit.setItem(46, vidro1); 
	    	  kit.setItem(47, ar); 
	    	  kit.setItem(48, vidro1); 
	    	  kit.setItem(49, ar); 
	    	  kit.setItem(50, vidro1); 
	    	  kit.setItem(51, ar); 
	    	  kit.setItem(52, vidro1); 
	    	  kit.setItem(53, ar); 
	    }

		if (p.hasPermission("kit.thor")) {
	    	kit.removeItem(vidro);
			kit.addItem(thor);
		}
		if (p.hasPermission("kit.timelord")) {
	    	kit.removeItem(vidro);
			kit.addItem(timelord);
		}
		if (p.hasPermission("kit.quickdropper")) {
	    	kit.removeItem(vidro);
			kit.addItem(quickdropper);
		}
		if (p.hasPermission("kit.poseidon")) {
	    	kit.removeItem(vidro);
			kit.addItem(poseidon);
		}
		if (p.hasPermission("kit.assassin")) {
	    	kit.removeItem(vidro);
			kit.addItem(assassin);
		}
		if (p.hasPermission("kit.rain")) {
	    	kit.removeItem(vidro);
			kit.addItem(rain);
		}
		if (p.hasPermission("kit.phantom")) {
	    	kit.removeItem(vidro);
			kit.addItem(phantom);
		}
		if (p.hasPermission("kit.switcher")) {
	    	kit.removeItem(vidro);
			kit.addItem(switcher);
		}
		if (p.hasPermission("kit.health")) {
	    	kit.removeItem(vidro);
			kit.addItem(health);
		}
		if (p.hasPermission("kit.magma")) {
	    	kit.removeItem(vidro);
			kit.addItem(magma);
		}
		if (p.hasPermission("kit.anchor")) {
	    	kit.removeItem(vidro);
			kit.addItem(anchor);
		}
		if (p.hasPermission("kit.Camel")) {
	    	kit.removeItem(vidro);
			kit.addItem(Camel);
		}
		if (p.hasPermission("kit.hunter")) {
	    	kit.removeItem(vidro);
			kit.addItem(hunter);
		}
		if (p.hasPermission("kit.burstmaster")) {
	    	kit.removeItem(vidro);
			kit.addItem(burstmaster);
		}
		if (p.hasPermission("kit.ajnin")) {
	    	kit.removeItem(vidro);
			kit.addItem(ajnin);
		}
		if (p.hasPermission("kit.thresh")) {
	    	kit.removeItem(vidro);
			kit.addItem(thresh);
		}
		if (p.hasPermission("kit.monk")) {
	    	kit.removeItem(vidro);
			kit.addItem(monk);
		}
		if (p.hasPermission("kit.Gladiator")) {
	    	kit.removeItem(vidro);
			kit.addItem(Gladiator);
		}
		
		
	    p.openInventory(kit);
	    return false;
	}
}