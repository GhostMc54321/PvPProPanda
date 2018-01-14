package Utilidades;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Comandos.setArenaCommand;


public class KitAPI {
	
	public static ItemStack sopa;
	public static ItemMeta sopameta;
	public static ItemStack pocao;
	public static ItemMeta pocaometa;
	public static ItemStack cogu1;
	public static ItemMeta cogu1meta;
	public static ItemStack cogu2;
	public static ItemMeta cogu2meta;
	public static ItemStack potes;
	public static ItemMeta potesmeta;
	public static ItemStack Kangaroo;
	public static ItemMeta Kangaroometa;
	public static ItemStack reaper;
	public static ItemMeta reapermeta;
	public static ItemStack Fisherman;
	public static ItemMeta Fishermanmeta;
	public static ItemStack deshfire;
	public static ItemMeta deshfiremeta;
	public static ItemStack deshviper;
	public static ItemMeta deshvipermeta;
	public static ItemStack forcefield;
	public static ItemMeta forcefieldmeta;
	public static ItemStack hulk;
	public static ItemMeta hulkmeta;
	public static ItemStack hunter;
	public static ItemMeta huntermeta;
	public static ItemStack madman;
	public static ItemMeta madmanmeta;
	public static ItemStack ryu;
	public static ItemMeta ryumeta;
	public static ItemStack seya;
	public static ItemMeta seyameta;
	public static ItemStack sonic;
	public static ItemMeta sonicmeta;
	public static ItemStack titan;
	public static ItemMeta titanmeta;
	public static ItemStack turtle;
	public static ItemMeta turtlemeta;
	public static ItemStack urgal;
	public static ItemMeta urgalmeta;
	public static ItemStack thor;
	public static ItemMeta thormeta;
	public static ItemStack phantom;
	public static ItemMeta phantommeta;
	public static ItemStack specialist;
	public static ItemMeta specialistmeta;
	public static ItemStack quickdropper;
	public static ItemMeta quickdroppermeta;
	public static ItemStack poseidon;
	public static ItemMeta poseidonmeta;
	public static ItemStack burstmaster;
	public static ItemMeta burstmastermeta;
	public static ItemStack timelord;
	public static ItemMeta timelordmeta;
	public static ItemStack parkour;
	public static ItemMeta parkourmeta;
	public static ItemStack gladiator;
	public static ItemMeta gladiatormeta;
	public static ItemStack Bussola;
	public static ItemMeta Bussolameta;
	public static ItemStack thresh;
	public static ItemMeta threshmeta;
	public static ItemStack monk;
	public static ItemMeta monkmeta;
	public static ItemStack switcher;
	public static ItemMeta switchermeta;
	public static ItemStack rain;
	public static ItemMeta rainmeta;
	public static ItemStack anchor;
	public static ItemMeta anchormeta;
	
	public static HashMap<String, String> Kit = new HashMap<>();
	public static HashMap<String, Integer> KitDelay = new HashMap<>();
	
	public static void setKit(Player p, String kit) {
		Kit.put(p.getName(), kit);
	}
	
	public static String getKit(Player p) {
		if (Kit.containsKey(p.getName())) {
			return Kit.get(p.getName());
		} else {
		   return "Nenhum";
	}
	}
		public static void RemoveKit(Player p) {
			Kit.remove(p.getName());
		
	}    
        public static void DarSopas(Player p) {
    	    sopa = new ItemStack(Material.MUSHROOM_SOUP);
    	    sopameta = sopa.getItemMeta();
    	    sopameta.setDisplayName("§6Sopa");
    	    sopa.setItemMeta(sopameta);
    	    
    	    cogu1 = new ItemStack(Material.RED_MUSHROOM, 64);
    	    cogu1meta = cogu1.getItemMeta();
    	    cogu1meta.setDisplayName("§4Cogumelos");
    	    cogu1.setItemMeta(cogu1meta);
    	    
    	    cogu2 = new ItemStack(Material.BROWN_MUSHROOM, 64);
    	    cogu2meta = cogu2.getItemMeta();
    	    cogu2meta.setDisplayName("§7Cogumelos");
    	    cogu2.setItemMeta(cogu2meta);
    	    
    	    potes = new ItemStack(Material.BOWL, 64);
    	    potesmeta = potes.getItemMeta();
    	    potesmeta.setDisplayName("§ePotes");
    	    potes.setItemMeta(potesmeta);
    	    
    	    for (int i = 1; i < 36; i++) {
    	    	p.getInventory().addItem(sopa);
    	    	p.getInventory().setItem(13, cogu1);
    	    	p.getInventory().setItem(14, cogu2);
    	    	p.getInventory().setItem(15, potes);
    	    }
        }
            public static void DarPocao(Player p) {
        	    pocao = new ItemStack(Material.POTION, 1, (short)16421);
        	    pocaometa = pocao.getItemMeta();
        	    pocaometa.setDisplayName("§6Poçao");
        	    pocao.setItemMeta(pocaometa);
        	    
        	    for (int i = 1; i < 36; i++) {
        	    	p.getInventory().addItem(pocao);
        	    }

}
		
	public static void PvP(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "PvP");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
		espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Monk(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Monk");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    monk = new ItemStack(Material.BLAZE_ROD);
	    monkmeta = monk.getItemMeta();
	    monkmeta.setDisplayName("§eMonk");
	    monk.setItemMeta(monkmeta);
	    p.getInventory().setItem(1, monk);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void hunter(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Hunter");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    hunter = new ItemStack(Material.STICK);
	    huntermeta = hunter.getItemMeta();
	    huntermeta.setDisplayName("§eHunter");
	    hunter.setItemMeta(huntermeta);
	    p.getInventory().setItem(1, hunter);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Health(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Health");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void magma(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Magma");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Anchor(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Anchor");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Assassin(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Assassin");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Switcher(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Switcher");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    switcher = new ItemStack(Material.SNOW_BALL, 16);
	    switchermeta = switcher.getItemMeta();
	    switchermeta.setDisplayName("§eSwitcher");
	    switcher.setItemMeta(switchermeta);
	    p.getInventory().setItem(1, switcher);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Thresh(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Thresh");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    thresh = new ItemStack(Material.LEASH);
	    threshmeta = thresh.getItemMeta();
	    threshmeta.setDisplayName("§eThresh");
	    thresh.setItemMeta(threshmeta);
	    p.getInventory().setItem(1, thresh);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Rain(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Rain");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    rain = new ItemStack(Material.ARROW);
	    rainmeta = rain.getItemMeta();
	    rainmeta.setDisplayName("§eRain");
	    rain.setItemMeta(rainmeta);
	    p.getInventory().setItem(1, rain);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Stomper(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Stomper");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Viper(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Viper");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
public static void Snail(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Snail");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Reaper(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Reaper");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    reaper = new ItemStack(Material.WOOD_HOE);
    reapermeta = reaper.getItemMeta();
    reapermeta.setDisplayName("§eReaper");
    reaper.setItemMeta(reapermeta);
    p.getInventory().setItem(1, reaper);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Thor(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Thor");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    thor = new ItemStack(Material.GOLD_AXE);
    thormeta = thor.getItemMeta();
    thormeta.setDisplayName("§eThor");
    thor.setItemMeta(thormeta);
    p.getInventory().setItem(1, thor);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void TimeLord(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "TimeLord");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    timelord = new ItemStack(Material.WATCH);
    timelordmeta = timelord.getItemMeta();
    timelordmeta.setDisplayName("§eTimeLord");
    timelord.setItemMeta(timelordmeta);
    p.getInventory().setItem(1, timelord);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void quickdropper(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "QuickDropper");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Poseidon(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Poseidon");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Phantom(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Phantom");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    phantom = new ItemStack(Material.FEATHER);
    phantommeta = phantom.getItemMeta();
    phantommeta.setDisplayName("§ePhantom");
    phantom.setItemMeta(phantommeta);
    p.getInventory().setItem(1, phantom);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Gladiator(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Gladiator");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    gladiator = new ItemStack(Material.IRON_FENCE);
    gladiatormeta = gladiator.getItemMeta();
    gladiatormeta.setDisplayName("§eGladiator");
    gladiator.setItemMeta(gladiatormeta);
    p.getInventory().setItem(1, gladiator);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Camel(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Camel");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void BurstMaster(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "BurstMaster");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    burstmaster = new ItemStack(Material.STONE_HOE);
    burstmastermeta = burstmaster.getItemMeta();
    burstmastermeta.setDisplayName("§eBurstMaster");
    burstmaster.setItemMeta(burstmastermeta);
    p.getInventory().setItem(1, burstmaster);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Boxer(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Boxer");
    ItemStack espada = new ItemStack(Material.QUARTZ);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Deshfire(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Deshfire");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    deshfire = new ItemStack(Material.REDSTONE_BLOCK);
    deshfiremeta = deshfire.getItemMeta();
    deshfiremeta.setDisplayName("§eDeshFire");
    deshfire.setItemMeta(deshfiremeta);
    p.getInventory().setItem(1, deshfire);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Deshviper(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Deshviper");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    deshviper = new ItemStack(Material.EMERALD_BLOCK);
    deshvipermeta = deshviper.getItemMeta();
    deshvipermeta.setDisplayName("§eDeshViper");
    deshviper.setItemMeta(deshvipermeta);
    p.getInventory().setItem(1, deshviper);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Forcefield(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Forcefield");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    forcefield = new ItemStack(Material.IRON_FENCE);
    forcefieldmeta = forcefield.getItemMeta();
    forcefieldmeta.setDisplayName("§eForcefield");
    forcefield.setItemMeta(forcefieldmeta);
    p.getInventory().setItem(1, forcefield);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Hulk(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Hulk");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Ryu(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Ryu");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    ryu = new ItemStack(Material.DIAMOND_BLOCK);
    ryumeta = ryu.getItemMeta();
    ryumeta.setDisplayName("§eRyu");
    ryu.setItemMeta(ryumeta);
    p.getInventory().setItem(1, ryu);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Seya(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Seya");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    seya = new ItemStack(Material.DIAMOND);
    seyameta = seya.getItemMeta();
    seyameta.setDisplayName("§eSeya");
    seya.setItemMeta(seyameta);
    p.getInventory().setItem(1, seya);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void specialist(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Specialist");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    specialist = new ItemStack(Material.ENCHANTED_BOOK);
    specialistmeta = specialist.getItemMeta();
    specialistmeta.setDisplayName("§eSpecialist");
    specialist.setItemMeta(specialistmeta);
    p.getInventory().setItem(1, specialist);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Sonic(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Sonic");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    sonic = new ItemStack(Material.LAPIS_BLOCK);
    sonicmeta = sonic.getItemMeta();
    sonicmeta.setDisplayName("§eSonic");
    sonic.setItemMeta(sonicmeta);
    p.getInventory().setItem(1, sonic);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Titan(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Titan");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    titan = new ItemStack(Material.BEDROCK);
    titanmeta = titan.getItemMeta();
    titanmeta.setDisplayName("§eTitan");
    titan.setItemMeta(titanmeta);
    p.getInventory().setItem(1, titan);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Urgal(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Urgal");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    urgal = new ItemStack(Material.REDSTONE);
    urgalmeta = urgal.getItemMeta();
    urgalmeta.setDisplayName("§eUrgal");
    urgal.setItemMeta(urgalmeta);
    p.getInventory().setItem(1, urgal);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Turtle(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Turtle");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
public static void Madman(Player p) {
	p.getInventory().clear();
	DarSopas(p);
	setKit(p, "Madman");
    ItemStack espada = new ItemStack(Material.STONE_SWORD);
	p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
    ItemMeta espadameta = espada.getItemMeta();
    espadameta.setDisplayName("§eEspada");
    espada.setItemMeta(espadameta);
    p.getInventory().setItem(0, espada);
    setArenaCommand.TeleportArenaRandom(p);
    p.updateInventory();
}
	public static void Kangaroo(Player p) {
		Kits.Kangaroo.KangarroStats.put(p.getName(), Integer.valueOf(0));
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Kangaroo");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    Kangaroo = new ItemStack(Material.FIREWORK);
	    Kangaroometa = Kangaroo.getItemMeta();
	    Kangaroometa.setDisplayName("§eKangaroo");
	    Kangaroo.setItemMeta(Kangaroometa);
	    p.getInventory().setItem(1, Kangaroo);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
   }
	public static void Fisherman(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Fisherman");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    Fisherman = new ItemStack(Material.FISHING_ROD);
	    Fishermanmeta = Fisherman.getItemMeta();
	    Fishermanmeta.setDisplayName("§eFisherman");
	    Fisherman.setItemMeta(Fishermanmeta);
	    p.getInventory().setItem(1, Fisherman);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
   }
	public static void Ninja(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Ninja");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Vinking(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Viking");
	    ItemStack espada = new ItemStack(Material.STONE_AXE);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eViking");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
	public static void Fps(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Fps");
	    ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);
		p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
		p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
		espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eFPS");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    p.updateInventory();
	}
	public static void Sumo(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Sumo");
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
	    ItemStack kb = new ItemStack(Material.STICK);
	    ItemMeta kbmeta = kb.getItemMeta();
		kbmeta.addEnchant(Enchantment.KNOCKBACK, 2, true);
		kbmeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
	    kbmeta.setDisplayName("§eSumo");
	    kb.setItemMeta(kbmeta);
	    p.getInventory().setItem(0, kb);
	    p.updateInventory();
	}
	public static void aMain(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Main");
	    ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);
		p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
		p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
		p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
		espada.addEnchantment(Enchantment.DAMAGE_ALL, 2);
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eMAIN");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    p.updateInventory();
	}
	public static void ArenaFish(Player p) {
		p.getInventory().clear();
		setKit(p, "ArenaFish");
	    ItemStack fish = new ItemStack(Material.FISHING_ROD);
	    ItemMeta fishmeta = fish.getItemMeta();
	    fishmeta.setDisplayName("§eFisherman");
	    fish.setItemMeta(fishmeta);
	    p.getInventory().setItem(4, fish);
	    p.updateInventory();
	}
	public static void Challenge(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Challenge");
		p.getInventory().setHelmet(new ItemStack(Material.AIR));
		p.getInventory().setChestplate(new ItemStack(Material.AIR));
		p.getInventory().setLeggings(new ItemStack(Material.AIR));
		p.getInventory().setBoots(new ItemStack(Material.AIR));
	    p.updateInventory();
	}
	public static void Ajnin(Player p) {
		p.getInventory().clear();
		DarSopas(p);
		setKit(p, "Ajnin");
	    ItemStack espada = new ItemStack(Material.STONE_SWORD);
		p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
		espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
	    ItemMeta espadameta = espada.getItemMeta();
	    espadameta.setDisplayName("§eEspada");
	    espada.setItemMeta(espadameta);
	    p.getInventory().setItem(0, espada);
	    setArenaCommand.TeleportArenaRandom(p);
	    p.updateInventory();
	}
}