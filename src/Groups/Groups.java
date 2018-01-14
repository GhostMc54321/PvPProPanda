package Groups;


import org.bukkit.entity.Player;

public class Groups {
	
	public static String getRank(Player p) {
		if (p.hasPermission("rank.dono")) {
			return "§4[DONO]";
		}
		if (p.hasPermission("rank.gerente")) {
			return "§C[GERENTE]";
		}
		if (p.hasPermission("rank.admin")) {
			return "§c[ADMIN]";
		}
		if (p.hasPermission("rank.modfull")) {
			return "§5[MOD++]";
		}
		if (p.hasPermission("rank.modplus")) {
			return "§5[MOD+]";
		}
		if (p.hasPermission("rank.mod")) {
			return "§5[MOD]";
		}
		if (p.hasPermission("rank.trial")) {
			return "§d[TRIAL]";
		}
		if (p.hasPermission("rank.helper")) {
			return "§D[HELPER]";
		}
		if (p.hasPermission("rank.youtuber+")) {
			return "§b[YOUTUBER+]";
		}
		if (p.hasPermission("rank.youtuber")) {
			return "§b[YOUTUBER]";
		}
		if (p.hasPermission("rank.mvp+")) {
			return "§3Vip Lendario";
		}
		if (p.hasPermission("rank.mvp")) {
			return "§2Vip Elite";
		}
		if (p.hasPermission("rank.vip")) {
			return "§5Vip Epic";
		}
		if (p.hasPermission("rank.normal")) {
			return "§7[NORMAL]";
		}
		return "§7[NORMAL]";
		}
}
