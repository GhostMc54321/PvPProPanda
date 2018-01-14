package Utilidades;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Comandos.MOTDCommand;
import Comandos.StaffCommand;
import Manager.TopKillStreak;

@SuppressWarnings("deprecation")
public class Listeners implements Listener {

	@EventHandler
	public void ChatStaff(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		for (Player pl : Bukkit.getOnlinePlayers()) {

			if ((pl.hasPermission("pluspvp.cmd.staff")) && (StaffCommand.staffchat.contains(p.getName()))) {
				e.setCancelled(true);
				pl.sendMessage("§7➜ (§c§LSTAFFCHAT§7) " + p.getName() + " §c» §7" + e.getMessage());
			}
		}
	}
			public static void darItem(Player p, Material mat, int quant, int modo, String nome, int lugar) {
				ItemStack item = new ItemStack(mat, quant, (short) modo);
				ItemMeta itemm = item.getItemMeta();
				itemm.setDisplayName(nome);
				item.setItemMeta(itemm);
				p.getInventory().setItem(lugar, item);
			}

			public static void darItem(Player p, Material mat, int quant, int modo, String nome, Enchantment e, int lugar) {
				ItemStack item = new ItemStack(mat, quant, (short) modo);
				item.addUnsafeEnchantment(e, 100);
				ItemMeta itemm = item.getItemMeta();
				itemm.setDisplayName(nome);
				item.setItemMeta(itemm);
				p.getInventory().setItem(lugar, item);
			}

			public static void DarItem(Player p, Material item, int slot, String name) {
				ItemStack give = new ItemStack(item);
				ItemMeta givem = give.getItemMeta();
				givem.setDisplayName(name);
				give.setItemMeta(givem);
				p.getInventory().setItem(slot, give);
			}
			public static void KillStreak(Player p) {
				
				if(TopKillStreak.getKsTop(p) == 5){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f5§a!");
				}
				if(TopKillStreak.getKsTop(p) == 10){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f10§a!");
				}
				if(TopKillStreak.getKsTop(p) == 15){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f15§a!");
				}
				if(TopKillStreak.getKsTop(p) == 20){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f20§a!");
				}
				if(TopKillStreak.getKsTop(p) == 25){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f25§a!");
				}
				if(TopKillStreak.getKsTop(p) == 30){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f30§a!");
				}
				if(TopKillStreak.getKsTop(p) == 35){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f35§a!");
				}
				if(TopKillStreak.getKsTop(p) == 40){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f40§a!");
				}
				if(TopKillStreak.getKsTop(p) == 45){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f45§a!");
				}
				if(TopKillStreak.getKsTop(p) == 50){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f50§a!");
				}
				if(TopKillStreak.getKsTop(p) == 55){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f55§a!");
				}
				if(TopKillStreak.getKsTop(p) == 60){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f60§a!");
				}
				if(TopKillStreak.getKsTop(p) == 65){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f65§a!");
				}
				if(TopKillStreak.getKsTop(p) == 70){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f70§a!");
				}
				if(TopKillStreak.getKsTop(p) == 75){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f75§a!");
				}
				if(TopKillStreak.getKsTop(p) == 80){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f80§a!");
				}
				if(TopKillStreak.getKsTop(p) == 85){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f85§a!");
				}
				if(TopKillStreak.getKsTop(p) == 90){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f90§a!");
				}
				if(TopKillStreak.getKsTop(p) == 95){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu Um KillStreak de §f95§a!");
				}
				if(TopKillStreak.getKsTop(p) == 100){
					Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + p.getName() + " §aConseguiu a KillStreak Máxima de §f100§a!");
			}
			}
			@EventHandler 
			 public void onPing(ServerListPingEvent e) {
			  e.setMaxPlayers(Bukkit.getOnlinePlayers().length + 1);
			  if(!MOTDCommand.changeMOTD.isEmpty()) {
			   e.setMotd(MOTDCommand.changeMOTD.toString().replace("&", "§").replace("[", "").replace("]", "").replace("\n", "\n"));
			  } else {
			   e.setMotd("       §9§m     §b§m    §7§m    §f§l§m[§5§lEPIC§F§lKITS§c §f§l§m]§7§m    §b§m    §9§m     \n§f      §cVenha treinar seu pvp com qualidade!");
			  }
			  return;
			 }
		}

