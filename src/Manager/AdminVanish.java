package Manager;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class AdminVanish
  implements Listener
{
  public static ArrayList<Player> vanished = new ArrayList<Player>();
  
  	@SuppressWarnings("deprecation")
  	public static void makeVanished(Player p){
  		for (Player player : Bukkit.getOnlinePlayers()) {

      if (!player.getName().equals(p.getName())) {
        player.hidePlayer(p);
      }
    }
    if (!vanished.contains(p)) {
      vanished.add(p);
    }
  }
  
  	public static boolean isVanished(Player p)
  {
    return vanished.contains(p);
  }
  
    @SuppressWarnings("deprecation")
  	public static void updateVanished()
  {
		for (Player p : Bukkit.getOnlinePlayers()) {
      if (isVanished(p)) {
        makeVanished(p);
      } else {
        makeVisible(p);
      }
    }
  }
  
  @SuppressWarnings("deprecation")
  public static void makeVisible(Player p)
  {
		for (Player player : Bukkit.getOnlinePlayers()) {
      player.showPlayer(p);
    }
    if (vanished.contains(p)) {
      vanished.remove(p);
    }
  }
}