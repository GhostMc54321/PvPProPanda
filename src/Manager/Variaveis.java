package Manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import Main.Main;

public class Variaveis {

	public static Main main;
	public static String prefix;
	public static String ip;

	
	public static HashMap<String, Boolean> StaffChat = new HashMap<>();
	public static Boolean chat = true;
	public static List<String> Admin = new ArrayList<String>();
	public static List<String> combat = new ArrayList<>();
	public static HashMap<String, String> modo = new HashMap<>();
	
	
	
	public static boolean hasSopa(Player p) {
		Boolean b = false;

		if (!modo.containsKey(p.getName())) {
			modo.put(p.getName(), "sopa");
		}
		if (modo.get(p.getName()).equalsIgnoreCase("sopa")) {
			b = true;
		}

		return b;
	}

	public static void setSopa(Player p, Boolean b) {
		if (b) {
			modo.put(p.getName(), "sopa");
		} else {
			modo.put(p.getName(), "potion");
		}
	}
	
	public static void setup(Main m){
		prefix = m.getConfig().getString("name").replace("&", "§");
		ip = m.getConfig().getString("ip").replace("&", "§");
	}
}
