package Utilidades;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import Main.Main;
import ca.wacos.nametagedit.NametagAPI;

public class TagsAPI implements Listener {
	public static void setarTag(Player p ,String tag) {
		new BukkitRunnable() {
			@Override
			public void run() {
				p.setDisplayName(tag + p.getName());
				NametagAPI.setPrefix(p.getName(), tag);
			}
		}.runTaskAsynchronously(Main.getInstace());
	}
	@EventHandler
	public void tag(PlayerJoinEvent e) {
		new BukkitRunnable() {
			
			@Override
			public void run() {
				Player p = e.getPlayer();
				if(p.hasPermission("rank.dono")) {
					setarTag(p, "§2[DONO]§7");
					NametagAPI.setPrefix(p.getName(), "§2[DONO]§7 ");
					return;
				}
				if(p.hasPermission("rank.gerente")) {
					setarTag(p, "§3[GERENTE]§7 ");
					NametagAPI.setPrefix(p.getName(), "§3[GERENTE]§7 ");
					return;
				}
				if(p.hasPermission("rank.admin")) {
					setarTag(p, "§c[ADMIN]§7 ");
					NametagAPI.setPrefix(p.getName(), "§c[ADMIN]§7 ");
					return;
				}
				if(p.hasPermission("rank.modfull")) {
					setarTag(p, "§1[MOD++]§7 ");
					NametagAPI.setPrefix(p.getName(), "§1[MOD++]§7 ");
					return;
				}
				if(p.hasPermission("rank.modplus")) {
					setarTag(p, "§1[MOD+]§7 ");
					NametagAPI.setPrefix(p.getName(), "§1[MOD+]§7 ");
					return;
				}
				if(p.hasPermission("rank.mod")) {
					setarTag(p, "§1[MOD]§7 ");
					NametagAPI.setPrefix(p.getName(), "§1[MOD]§7 ");
					return;
				}
				if(p.hasPermission("rank.trial")) {
					setarTag(p, "§5[TRIAL]§7 ");
					NametagAPI.setPrefix(p.getName(), "§5[TRIAL]§7 ");
					return;
				}
				if(p.hasPermission("rank.helper")) {
					setarTag(p, "§4[HELPER]§7 ");
					NametagAPI.setPrefix(p.getName(), "§4[HELPER]§7 ");
					return;
				}
				if(p.hasPermission("rank.youtuber+")) {
					setarTag(p, "§B[YOUTUBER+,]§7 ");
					NametagAPI.setPrefix(p.getName(), "§B[YOUTUBER+]§7 ");
					return;
				}
				if(p.hasPermission("rank.youtuber")) {
					setarTag(p, "§B[YOUTUBER]§7 ");
					NametagAPI.setPrefix(p.getName(), "§B[YOUTUBER]§7 ");
					return;
				}
				if(p.hasPermission("rank.vipepic")) {
					setarTag(p, "§5[VIP EPIC]§7 ");
					NametagAPI.setPrefix(p.getName(), "§5[VIP EPIC]§7 ");
					return;
				}
				if(p.hasPermission("rank.viplendario")) {
					setarTag(p, "§3[Vip Lendario]§7 ");
					NametagAPI.setPrefix(p.getName(), "§3[Vip Lendario]§7 ");
					return;
				}
			if(p.hasPermission("rank.builder")) {
				setarTag(p, "§2[BUILDER]§7 ");
				NametagAPI.setPrefix(p.getName(), "§2[BUILDER]§7 ");
				return;
			}
			if(p.hasPermission("rank.developer")) {
				setarTag(p, "§3[DEVELOPER]§7 ");
				NametagAPI.setPrefix(p.getName(), "§3[DEVELOPER]§7 ");
				return;
			}
				if(p.hasPermission("rank.vipelite")) {
					setarTag(p, "§2[Vip Elite]§7 ");
					NametagAPI.setPrefix(p.getName(), "§2[Vip Elite]§7 ");
					return;
				}
				if(p.hasPermission("rank.normal")) {
					setarTag(p, "§7");
					p.setPlayerListName("§7" + p.getName());
					return;
				}
				setarTag(p, "§7");
				p.setPlayerListName("§7" + p.getName());
				return;
				
			}
		}.runTaskAsynchronously(Main.getInstace());
	}
}
