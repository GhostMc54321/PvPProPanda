package Comandos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import Main.Main;
import ScoreBoard.ScoreboardUpdater;
import Utilidades.KitAPI;
import Utilidades.WarpsAPI;

public class SpawnCommand extends WarpsAPI implements CommandExecutor {
	
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
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVocê Não Pode usar isso No Console!");
			return true;
		}
		final Player p = (Player)sender;
		if (args.length == 0) {
			segundos.add(p.getName());
			p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aTeleportando ao §FSPAWN§a Em §f5 Segundos§a!");
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 250, 50));
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 250, 50));
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable() {
				@Override
				public void run() {
					if (segundos.contains(p.getName())) {
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
						p.sendMessage("  ");	
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aTeleportado ao §fSPAWN§a!");
					ir(p, "spawn");
					p.setLevel(0);
					segundos.remove(p.getName());
		            KitAPI.KitDelay.remove(p.getName());
					KitAPI.RemoveKit(p);
					ScoreboardUpdater.Score(p);
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.AIR));
					p.getInventory().setChestplate(new ItemStack(Material.AIR));
					p.getInventory().setLeggings(new ItemStack(Material.AIR));
					p.getInventory().setBoots(new ItemStack(Material.AIR));
			        for (PotionEffect effect : p.getActivePotionEffects()) {
 		                 p.removePotionEffect(effect.getType());
					p.setHealth(20);
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
				    
				    loja = new ItemStack(Material.EMERALD);
				    lojameta = loja.getItemMeta();
				    lojameta.setDisplayName("§b§l➜ §7Loja");
				    loja.setItemMeta(lojameta);
				    
				    p.getInventory().setItem(8, click);
				    p.getInventory().setItem(3, loja);
				    p.getInventory().setItem(4, kits);
				    p.getInventory().setItem(5, warps);
				    p.updateInventory();
				    
				    if (p.hasPermission("pluspvp.cmd.admin")) {
				    	p.getInventory().setItem(0, admins);
					}
			        }
					}
				}
			}, 5*20);
		}else {
			if (args[0].equalsIgnoreCase("set")) {
			    if (p.hasPermission("pluspvp.cmd.setarenas")) {
			    	Set(p, "spawn");
			    	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê Setou o §fSPAWN§a!");
			}
		}
	 }
		return false;
	}
}