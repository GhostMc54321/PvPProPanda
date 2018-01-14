package Kits;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import API.CooldownAPI;
import Main.Main;
import Utilidades.KitAPI;

public class Rain implements Listener {
	public static ArrayList<String> rain = new ArrayList<>();
	public static ArrayList<String> cooldown = new ArrayList<>();

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e) {
		if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Arrow))) {
			e.setDamage(3.0D);
		}
	}

	@SuppressWarnings("unused")
	@EventHandler
	public void RainClick(PlayerInteractEntityEvent e) {
		if (!(e.getRightClicked() instanceof Player)) {
			return;
		}
		final Player p = e.getPlayer();
		final Player r = (Player) e.getRightClicked();
		if ((p.getItemInHand().getType() == Material.ARROW) && KitAPI.getKit(p).equalsIgnoreCase("rain")) {
			if ((KitAPI.getKit(p).equalsIgnoreCase("rain"))) {
				if (CooldownAPI.Cooldown.containsKey(p.getName())) {
					p.sendMessage("§4§lApple§f§lNetWork ➜ §cSeu Kit §FRAIN§c Ainda está em Cooldown!");

					return;
				}
			
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc = r.getLocation();
						loc.setY(loc.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow2 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc, EntityType.ARROW);
					}
				}, 40L);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc2 = r.getLocation();
						loc2.setY(loc2.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow3 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc2, EntityType.ARROW);
					}
				}, 35L);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc3 = r.getLocation();
						loc3.setY(loc3.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow4 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc3, EntityType.ARROW);
					}
				}, 30L);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc3 = r.getLocation();
						loc3.setY(loc3.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow4 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc3, EntityType.ARROW);
					}
				}, 25L);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc3 = r.getLocation();
						loc3.setY(loc3.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow4 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc3, EntityType.ARROW);
					}
				}, 20L);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc4 = r.getLocation();
						loc4.setY(loc4.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow5 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc4, EntityType.ARROW);
					}
				}, 5L);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc6 = r.getLocation();
						loc6.setY(loc6.getY() + 3.0D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));

						Entity arrow6 = Bukkit.getServer().getWorld(r.getLocation().getWorld().getName())
								.spawnEntity(loc6, EntityType.ARROW);
					}
				}, 3L);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Location loc5 = r.getLocation();
						loc5.setY(loc5.getY() + 2.5D);
						r.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10, 0));
					}
				}, 2L);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
					public void run() {
						Rain.rain.remove(p.getName());
					}
				}, 50L);
				CooldownAPI.addCooldown(p, 30);
		
			}

		}
	}
}
