package Manager;

import org.bukkit.entity.Player;

public class Groups {
	
	public static String getRank(Player p) {
		if (p.hasPermission("rank.dono")) {
			return "§2[DONO]";
		}
		if (p.hasPermission("rank.gerente")) {
			return "§3[GERENTE]";
		}
		if (p.hasPermission("rank.admin")) {
			return "§c[ADMIN]";
		}
		if (p.hasPermission("rank.modfull")) {
			return "§5MODERADORFULL [++]";
		}
		if (p.hasPermission("rank.modplus")) {
			return "§5MODERADORPLUS [+]";
		}
		if (p.hasPermission("rank.mod")) {
			return "§5MODERADOR";
		}
		if (p.hasPermission("rank.trial")) {
			return "§dTRIAL";
		}
		if (p.hasPermission("rank.helper")) {
			return "§DHELPER";
		}
		if (p.hasPermission("rank.youtuber+")) {
			return "§bYOUTUBER+";
		}
		if (p.hasPermission("rank.youtuber")) {
			return "§bYOUTUBER";
		}
		if (p.hasPermission("rank.vipepic")) {
			return "§5Vip Epic";
		}
		if (p.hasPermission("rank.lendario")) {
			return "§3Vip Lendario";
		}
		if (p.hasPermission("rank.vipelite")) {
			return "§2Vip Elite";
		}
		if (p.hasPermission("rank.developer")) {
			return "§3DEVELOPER";
		}
		if (p.hasPermission("rank.builder")) {
			return "§2BUILDER";
		}
		if (p.hasPermission("rank.normal")) {
			return "§7NORMAL";
		}
		return "§7NORMAL";
	}

}
