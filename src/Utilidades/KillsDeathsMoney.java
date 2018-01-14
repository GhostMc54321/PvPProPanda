package Utilidades;

import org.bukkit.entity.Player;

import Main.Main;

public class KillsDeathsMoney {
	
	public static void addKill(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Kills");
		Main.getInstace().stats.set(p.getUniqueId() + ".Kills", Integer.valueOf(Value + 1));
		Main.getInstace().save();
	}
	
	public static void addDeaths(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Deaths");
		Main.getInstace().stats.set(p.getUniqueId() + ".Deaths", Integer.valueOf(Value + 1));
		Main.getInstace().save();
	}
	
	public static void addMoney(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Money");
		Main.getInstace().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(Value + 100));
		Main.getInstace().save();
	}
	public static void removeCashUltimate(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Cash");
		Main.getInstace().stats.set(p.getUniqueId() + ".Cash", Integer.valueOf(Value - 30));
		Main.getInstace().save();
	}
	public static void removeCashPremium(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Cash");
		Main.getInstace().stats.set(p.getUniqueId() + ".Cash", Integer.valueOf(Value - 20));
		Main.getInstace().save();
	}
	public static void AddVip(Player p, int i) {
		int Value = Main.getInstace().lojacashvip.getInt(p.getUniqueId() + ".Vips");
		Main.getInstace().lojacashvip.set(p.getUniqueId() + ".Vips", Value);
		Main.getInstace().save();
	}
	public static void removeCashPlatinum(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Cash");
		Main.getInstace().stats.set(p.getUniqueId() + ".Cash", Integer.valueOf(Value - 15));
		Main.getInstace().save();
	}
	public static void addPts(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Pontos");
		Main.getInstace().stats.set(p.getUniqueId() + ".Pontos", Integer.valueOf(Value + 1));
		Main.getInstace().save();
	}
	public static void removePts(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Pontos");
		Main.getInstace().stats.set(p.getUniqueId() + ".Pontos", Integer.valueOf(Value - 100));
		Main.getInstace().save();
	}
	public static void addCash(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Cash");
		Main.getInstace().stats.set(p.getUniqueId() + ".Cash", Integer.valueOf(Value + 1));
		Main.getInstace().save();
	}
	public static void removermoney(Player p, int i) {
		int Value = Main.getInstace().stats.getInt(p.getUniqueId() + ".Money");
		if ((Value - 60) > 0) {
			Main.getInstace().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(Value - 60));
		} else {
			Main.getInstace().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(0));
		}
		Main.getInstace().save();
	}
	
	public static int getKills(Player p) {
		return Main.getInstace().stats.getInt(p.getUniqueId() + ".Kills");
	}
	
	public static int getDeaths(Player p) {
		return Main.getInstace().stats.getInt(p.getUniqueId() + ".Deaths");
	}
	
	public static int getMoney(Player p) {
		return Main.getInstace().stats.getInt(p.getUniqueId() + ".Money");
	}
	public static int getCash(Player p) {
		return Main.getInstace().stats.getInt(p.getUniqueId() + ".Cash");
	}
	public static int getPts(Player p) {
		return Main.getInstace().stats.getInt(p.getUniqueId() + ".Points");
	}

}
