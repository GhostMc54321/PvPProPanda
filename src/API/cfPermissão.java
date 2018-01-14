package API;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class cfPermiss�o {
	
	private static FileConfiguration player_permissao;
	private static File playerpermissao;
	
	public static void setarconfig(Plugin plugin){
		
		if(!plugin.getDataFolder().exists()){
			plugin.getDataFolder().mkdir();
		}
		playerpermissao = new File(plugin.getDataFolder(), "permiss�es.yml");
		if(playerpermissao.exists()){
			try{
				playerpermissao.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		player_permissao = YamlConfiguration.loadConfiguration(playerpermissao);
	}
	public static FileConfiguration pegarpermissao(){
		return player_permissao;
	}
	public static void salvarconfiguracao(){
		try{
			player_permissao.save(playerpermissao);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void setarPermissao(Player p, String Permissao, String trueoufalse){
		
		pegarpermissao().set("permiss�es." + p.getUniqueId() + ".Nick", p.getName());
		pegarpermissao().set("permiss�es." + p.getUniqueId() + "." + Permissao, trueoufalse);
		cfPermiss�o.salvarconfiguracao();
	}
	public static boolean getPermissao(Player p, String Permissao){
		
		if(pegarpermissao().get("permiss�es." + p.getUniqueId() + "." + Permissao).equals("true")){
			return true;
		}else{
			return false;
		}
	}
}
