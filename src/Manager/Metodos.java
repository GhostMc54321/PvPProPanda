package Manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;

import net.md_5.bungee.api.ChatColor;


public class Metodos {

	@SuppressWarnings("deprecation")
	public static void Head(Player p, String nome, int slot, List<String> lore) {
		ItemStack skull = new ItemStack(Material.getMaterial(397));

		SkullMeta sm = (SkullMeta) skull.getItemMeta();
		sm.setLore(lore);
		skull.setDurability((short) 3);
		sm.hasOwner();
		sm.setOwner(p.getName());
		sm.setDisplayName(nome);
		skull.setItemMeta(sm);

		p.getInventory().setItem(slot, skull);

	}
	
	public static Integer getTOPNameArrayList(List<Integer> list) {
		Collections.sort(list);
		return list.get(list.size() - 1);
	}

	public static void sendTabTitle(Player player, String header, String footer) {
		if (header == null)
			header = "";
		header = ChatColor.translateAlternateColorCodes('&', header);

		if (footer == null)
			footer = "";
		footer = ChatColor.translateAlternateColorCodes('&', footer);

		header = header.replaceAll("%player%", player.getDisplayName());
		footer = footer.replaceAll("%player%", player.getDisplayName());
	}
	static HashMap<String, ItemStack[]> armor = new HashMap<>();
	static HashMap<String, ItemStack[]> inv = new HashMap<>();

	public static void saveArmor(Player p) {
		armor.put(p.getName(), p.getInventory().getArmorContents());
	}

	public static void loadArmor(Player p) {
		p.getInventory().setArmorContents(armor.get(p.getName()));
		p.updateInventory();
	}

	public static void saveInv(Player p) {
		inv.put(p.getName(), p.getInventory().getArmorContents());
	}

	public static void loadInv(Player p) {
		p.getInventory().setArmorContents(inv.get(p.getName()));
	}

	public static ArrayList<Location> getCircle(Location loc, Integer r) {
		ArrayList<Location> locations = new ArrayList<Location>();

		int x;
		int y = loc.getBlockY();
		int z;

		for (double i = 0.0; i < 360.0; i += 0.1) {
			double angle = i * Math.PI / 180;
			x = (int) (loc.getX() + r * Math.cos(angle));
			z = (int) (loc.getZ() + r * Math.sin(angle));
			locations.add(new Location(loc.getWorld(), x, y, z));
		}
		return locations;
	}

	public static Collection<? extends Player> allPlayer() {
		return null;
	}
	public static void SetRopaColorida(Player p, Color cor) {
		ItemStack c = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta cm = (LeatherArmorMeta) c.getItemMeta();
		cm.setColor(cor);
		c.setItemMeta(cm);

		p.getInventory().setHelmet(c);

		ItemStack c1 = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta cm1 = (LeatherArmorMeta) c1.getItemMeta();
		cm1.setColor(cor);
		c1.setItemMeta(cm1);
		p.getInventory().setChestplate(c1);

		ItemStack c11 = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta cm11 = (LeatherArmorMeta) c11.getItemMeta();
		cm11.setColor(cor);
		c11.setItemMeta(cm11);

		p.getInventory().setLeggings(c11);

		ItemStack c111 = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta cm111 = (LeatherArmorMeta) c111.getItemMeta();
		cm111.setColor(cor);
		c111.setItemMeta(cm111);

		p.getInventory().setBoots(c111);

		p.updateInventory();

	}

	public static int getAmount(Player player, Material id) {
		int amout = 0;
		for (ItemStack item : player.getInventory().getContents()) {
			if ((item != null) && (item.getType() == id) && (item.getAmount() > 0)) {
				amout += item.getAmount();
			}
		}
		return amout;
	}

	public static Inventory criarmenu(int slot, String nome) {
		return Bukkit.createInventory(null, slot, nome);
	}

	public static void Item1v1(Player p) {
		p.getInventory().clear();
		p.getInventory().setArmorContents(null);
		p.getInventory().setItem(2, itemStack(Material.IRON_FENCE, 0, 1, "§7» §aDesafiar §7«"));
		p.getInventory().setItem(4, itemStack(Material.SLIME_BALL, 0, 1, "§7» §aPartida Rapida §7«"));
		p.getInventory().setItem(6, itemStack(Material.REDSTONE, 0, 1, "§7» §aSair da 1v1 §7«"));
	}

	@SuppressWarnings("deprecation")
	public static ItemStack head(String nome, String owner, List<String> lore) {
		ItemStack skull = new ItemStack(Material.getMaterial(397));

		SkullMeta sm = (SkullMeta) skull.getItemMeta();
		sm.setLore(lore);
		skull.setDurability((short) 3);
		sm.hasOwner();
		sm.setOwner(owner);
		sm.setDisplayName(nome);
		skull.setItemMeta(sm);
		return skull;
	}

	public static ItemStack itemstack(Material mat, int data, int quantia, String nome, List<String> lore) {
		ItemStack a = new ItemStack(mat, quantia, (short) data);
		ItemMeta am = a.getItemMeta();
		am.setLore(lore);
		am.setDisplayName(nome);
		a.setItemMeta(am);
		return a;
	}

	public static void SetItemHotBar(Player p, String nome, int slot, int data, Material mat) {
		ItemStack sopa = new ItemStack(mat, 1, (short) data);
		ItemMeta sopam = sopa.getItemMeta();
		sopam.setDisplayName(nome);
		sopa.setItemMeta(sopam);
		p.getInventory().setItem(slot, sopa);
	}

	public static void spawnRandomFirework(Location loc) {
		Firework fw = (Firework) loc.getWorld().spawnEntity(loc, EntityType.FIREWORK);
		FireworkMeta fwm = fw.getFireworkMeta();
		Random r = new Random();
		int rt = r.nextInt(4) + 1;
		FireworkEffect.Type type = FireworkEffect.Type.BALL;
		if (rt == 1) {
			type = FireworkEffect.Type.BALL;
		}
		if (rt == 2) {
			type = FireworkEffect.Type.BALL_LARGE;
		}
		if (rt == 3) {
			type = FireworkEffect.Type.BURST;
		}
		if (rt == 4) {
			type = FireworkEffect.Type.CREEPER;
		}
		if (rt == 5) {
			type = FireworkEffect.Type.STAR;
		}
		Color c1 = Color.RED;
		Color c2 = Color.YELLOW;
		Color c3 = Color.ORANGE;
		FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withColor(c2)
				.withFade(c3).with(type).trail(r.nextBoolean()).build();
		fwm.addEffect(effect);
		fwm.setPower(1);
		fw.setFireworkMeta(fwm);
	}

	public static ItemStack ItemMenu(Material mat, int cor, String nome, List<String> lore) {
		ItemStack item = new ItemStack(mat, 1, (short) cor);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setLore(lore);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemStack(Material material, int durability, int amount, String nome) {
		ItemStack item = new ItemStack(material, amount, (short) durability);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemStack(Material material, int durability, int amount, String nome, List<String> lore) {
		ItemStack item = new ItemStack(material, amount, (short) durability);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setLore(lore);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemStack(Material material, String nome, int amount, int durability) {
		ItemStack item = new ItemStack(material, amount, (short) durability);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static void fillInvGlass(Material mat, Inventory inv, int cor) {
		ItemStack a1 = new ItemStack(mat, 1, (short) cor);
		ItemMeta am1 = a1.getItemMeta();
		am1.setDisplayName("§7-");
		a1.setItemMeta(am1);
		inv.addItem(a1);
		ItemStack[] arrayOfItemStack;
		int descpyro = (arrayOfItemStack = inv.getContents()).length;
		for (int metapyro = 0; metapyro < descpyro; metapyro++) {
			ItemStack item = arrayOfItemStack[metapyro];
			if (item == null) {
				inv.setItem(inv.firstEmpty(), a1);
			}
		}
	}

	public static String Convert(Integer i) {
		int minutes = i.intValue() / 60;
		int seconds = i.intValue() % 60;
		String disMinu = (minutes < 10 ? "" : "") + minutes;
		String disSec = (seconds < 10 ? "0" : "") + seconds;
		String formattedTime = disMinu + ":" + disSec;
		return formattedTime;
	}

	public static String TimePerfeito(Integer i) {
		int minutes = i / 60;
		int seconds = i % 60;
		String disMinu = (minutes < 10 ? "" : "") + minutes;
		String disSec = (seconds < 10 ? "" : "") + seconds;
		String formattedTime;
		if (i >= 60) {
			formattedTime = disMinu + "m " + disSec + "s";
		} else {
			formattedTime = disSec + "s";
		}

		if (i % 60 == 0) {
			formattedTime = disMinu + "m";
		}

		return formattedTime;
	}

	@SuppressWarnings("deprecation")
	public static ItemStack head(String owner) {
		ItemStack skull = new ItemStack(Material.getMaterial(397));
		SkullMeta sm = (SkullMeta) skull.getItemMeta();
		skull.setDurability((short) 3);
		sm.hasOwner();
		sm.setOwner(owner);
		sm.setDisplayName("§e" + owner);
		skull.setItemMeta(sm);
		return skull;
	}

	@SuppressWarnings("deprecation")
	public static ItemStack head(String owner, String d) {
		ItemStack skull = new ItemStack(Material.getMaterial(397));
		SkullMeta sm = (SkullMeta) skull.getItemMeta();
		skull.setDurability((short) 3);
		sm.hasOwner();
		sm.setOwner(owner);
		sm.setDisplayName("§e" + d);
		skull.setItemMeta(sm);
		return skull;
	}

	public static void CriarArena(Player p, Player o) {
		o.getLocation().add(0.0D, 13.0D, 0.0D).getBlock().setType(Material.BEDROCK);
		o.getLocation().add(0.0D, 11.0D, 1.0D).getBlock().setType(Material.BEDROCK);
		o.getLocation().add(1.0D, 11.0D, 0.0D).getBlock().setType(Material.BEDROCK);
		o.getLocation().add(0.0D, 11.0D, -1.0D).getBlock().setType(Material.BEDROCK);
		o.getLocation().add(-1.0D, 11.0D, 0.0D).getBlock().setType(Material.BEDROCK);
		o.getLocation().add(0.0D, 10.0D, 0.0D).getBlock().setType(Material.BEDROCK);
		o.teleport(o.getLocation().add(0.0D, 11.0D, -0.05D));
		o.teleport(o.getLocation().add(0.0D, 0.0D, -0.00D));
		o.teleport(o.getLocation().add(0.0D, 0.0D, -0.00D));
		o.teleport(o.getLocation().add(0.0D, 0.0D, -0.00D));
		o.teleport(o.getLocation().add(0.0D, 0.0D, -0.00D));
		o.teleport(o.getLocation().add(0.0D, 0.0D, -0.00D));
		p.teleport(o);
		p.teleport(p.getLocation().add(0.0D, 4.0D, -0.01D));
		p.sendMessage("§aA arena foi criada!");
		p.sendMessage("§cApos de verificar o player, remova os blocos!");
	}

	public static boolean isCommand(String label, String cmd) {
		return label.equalsIgnoreCase(cmd);
	}

	public static boolean isConsole(CommandSender sender) {
		return sender instanceof Player;
	}

	public static boolean hasPermission(CommandSender sender, String label) {
		return !sender.hasPermission("cmd." + label);
	}

	public static void SemPerm(CommandSender sender, String label) {
		sender.sendMessage("§c§lERRO§7,VocÃª nao Tem Permissao Para O Comando §c§l" + label);
	}

	public static ItemStack itemStack(Material material, String nome, List<String> lore) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setLore(lore);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}
	public static ItemStack itemStack(Material material, String nome, List<String> lore,int q) {
		ItemStack item = new ItemStack(material,q);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setLore(lore);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static void filltoInv(Material mat, Inventory inv, int cor, String nome) {
		ItemStack a1 = new ItemStack(mat, 1, (short) cor);
		ItemMeta am1 = a1.getItemMeta();
		am1.setDisplayName(nome);
		a1.setItemMeta(am1);
		inv.addItem(a1);
		ItemStack[] arrayOfItemStack;
		int descpyro = (arrayOfItemStack = inv.getContents()).length;

		for (int metapyro = 0; metapyro < descpyro; metapyro++) {
			ItemStack item = arrayOfItemStack[metapyro];
			if (item == null) {
				inv.setItem(inv.firstEmpty(), a1);
			}
		}
	}

	public static void filltoInv(Material mat, Inventory inv, String nome) {
		ItemStack a1 = new ItemStack(mat, 1, (short) new Random().nextInt(14));
		ItemMeta am1 = a1.getItemMeta();
		am1.setDisplayName(nome);
		a1.setItemMeta(am1);
		inv.addItem(a1);
		ItemStack[] arrayOfItemStack;
		int descpyro = (arrayOfItemStack = inv.getContents()).length;

		for (int metapyro = 0; metapyro < descpyro; metapyro++) {
			ItemStack item = arrayOfItemStack[metapyro];
			if (item == null) {
				inv.setItem(inv.firstEmpty(), a1);
			}
		}
	}

	public static String GetALlArgs(String[] args, Integer inicia) {
		StringBuilder sb = new StringBuilder();
		for (int i = inicia; i < args.length; i++) {
			sb.append(args[i]).append(" ");
		}

		String allArgs = sb.toString().trim();
		return ChatColor.translateAlternateColorCodes('&', allArgs);
	}

	public static void teleporta(Player p, int x, int y, int z) {
		p.teleport(new Location(p.getWorld(), x, y, z));
	}

	public static void DarSopas(Player p, int quantia) {
		for (int x = 0; x < 55; x++) {
			ItemStack a = new ItemStack(Material.MUSHROOM_SOUP);
			ItemMeta am = a.getItemMeta();
			am.setDisplayName("§fSopa");
			a.setItemMeta(am);
			p.getInventory().addItem(a);

		}
	}

	public static void DarPotion(Player p, int quantia) {
		for (int x = 0; x < 55; x++) {
			ItemStack a = new ItemStack(Material.POTION, 1, (short) 16421);
			ItemMeta am = a.getItemMeta();
			am.setDisplayName("§fPotion");
			a.setItemMeta(am);
			p.getInventory().addItem(a);

		}
	}

	public static void DarSopas(Player p) {
		for (int x = 0; x < 55; x++) {
			ItemStack a = new ItemStack(Material.MUSHROOM_SOUP);
			ItemMeta am = a.getItemMeta();
			am.setDisplayName("§fSopa");
			a.setItemMeta(am);
			p.getInventory().addItem(a);

		}
	}

	public static void KitSelector(Inventory inv, Material mat, String nome, int slot, int data, List<String> lore) {
		ItemStack a = new ItemStack(mat, 1, (short) data);
		ItemMeta am = a.getItemMeta();
		am.setLore(lore);
		am.setDisplayName(nome);
		a.setItemMeta(am);

		inv.setItem(slot, a);
	}

	public static void KitSelector2(Inventory inv, Material mat, String nome, int data, List<String> lore) {
		ItemStack a = new ItemStack(mat, 1, (short) data);
		ItemMeta am = a.getItemMeta();
		am.setLore(lore);
		am.setDisplayName(nome);
		a.setItemMeta(am);

		inv.addItem(a);
	}

	public static void Set(Player p, String nome, int slot, Material mat) {
		ItemStack a = new ItemStack(mat);
		ItemMeta am = a.getItemMeta();
		am.setDisplayName(nome);
		a.setItemMeta(am);

		p.getInventory().setItem(slot, a);
	}

	public static HashMap<String, Integer> ID = new HashMap<>();

	@SuppressWarnings("deprecation")
	public static void SetItemKIT(Player p, String nome, int slot, Material mat) {
		ItemStack a = new ItemStack(mat);
		ItemMeta am = a.getItemMeta();
		am.setDisplayName(nome);
		a.setItemMeta(am);

		p.getInventory().setItem(slot, a);
		ID.put(p.getName(), mat.getId());
	}

	public static void Clear(Player p) {
		p.getInventory().clear();
		p.getInventory().setArmorContents(null);
		if (p.getActivePotionEffects() != null) {
			for (PotionEffect e : p.getActivePotionEffects()) {
				p.removePotionEffect(e.getType());
			}
		}
	}

	public static ItemStack itemStack(Material material, String nome, String lore, Enchantment enchant,
			int levelEnchant) {
		ItemStack item = new ItemStack(material);
		item.addUnsafeEnchantment(enchant, levelEnchant);
		ItemMeta itemmeta = item.getItemMeta();
		List<String> iteml = new ArrayList<>();
		iteml.add(lore);
		itemmeta.setLore(iteml);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemStack(Material material, String nome, int amount, int durability, List<String> lore) {
		ItemStack item = new ItemStack(material, amount, (short) durability);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setLore(lore);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemstack(Material mat, int data, int quantia, String nome) {
		ItemStack a = new ItemStack(mat, quantia, (short) data);
		ItemMeta am = a.getItemMeta();
		am.setDisplayName(nome);
		a.setItemMeta(am);
		return a;
	}

	public static ItemStack itemstack(Material mat, int data, int quantia, String nome, Enchantment enchant,
			int level) {
		ItemStack a = new ItemStack(mat, quantia, (short) data);
		ItemMeta am = a.getItemMeta();
		am.addEnchant(enchant, level, true);
		am.setDisplayName(nome);
		a.setItemMeta(am);
		return a;
	}

	public static ItemStack itemStack(Material material, String nome) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}
	public static ItemStack itemStack(Material material, String nome,short data) {
		ItemStack item = new ItemStack(material,1,data);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}
	public static ItemStack itemStack(Material material, String nome,short data,List<String> lore) {
		ItemStack item = new ItemStack(material,1,data);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setLore(lore);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemStack(Material material, String nome, int q) {
		ItemStack item = new ItemStack(material, q);
		ItemMeta itemmeta = item.getItemMeta();
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static ItemStack itemStack(Material material, String nome, String lore) {
		ItemStack item = new ItemStack(material);
		ItemMeta itemmeta = item.getItemMeta();
		List<String> iteml = new ArrayList<>();
		iteml.add(lore);
		itemmeta.setLore(iteml);
		itemmeta.setDisplayName(nome);
		item.setItemMeta(itemmeta);
		return item;
	}

	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("deprecation")
	public static void itemSpawn(Player p) {
		p.getInventory().clear();
		//FileConfiguration c = Variaveis.main.getConfig();
		File file = new File(Variaveis.main.getDataFolder() + "/config.yml");
		FileConfiguration c = getyml(file);

		String kname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("KitSelector.Name"));
		String wname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("Warps.Name"));
		String lname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("Loja.Name"));
		String mname = org.bukkit.ChatColor.translateAlternateColorCodes('&', c.getString("Menu.Name"));
		
		ItemStack kit = itemStack(Material.getMaterial(c.getInt("KitSelector.ID")), 0, 1, kname);
		ItemStack warp = itemStack(Material.getMaterial(c.getInt("Warps.ID")), 0, 1, wname);
		ItemStack loja = itemStack(Material.getMaterial(c.getInt("Loja.ID")), 0, 1, lname);
		ItemStack menu = itemStack(Material.getMaterial(c.getInt("Menu.ID")), 0, 1, mname);

		p.getInventory().setItem(c.getInt("KitSelector.Slot"), kit);
		p.getInventory().setItem(c.getInt("Loja.Slot"), loja);
		p.getInventory().setItem(c.getInt("Warps.Slot"), warp);
		p.getInventory().setItem(c.getInt("Menu.Slot"), menu);
	}
	
	public static YamlConfiguration getyml(File file) {
		YamlConfiguration config = new YamlConfiguration();
		FileInputStream fileinputstream;

		try {
			fileinputstream = new FileInputStream(file);
			config.load(new InputStreamReader(fileinputstream, Charset.forName("UTF-8")));
		} catch (FileNotFoundException e) {
			System.out.print("File not found!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		}
		return config;
	}

	public static void sendactionBar(Player p, String string) {
		// TODO Auto-generated method stub
		
	}

}
