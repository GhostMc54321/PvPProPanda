package Eventos;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PluginsEvent
  implements Listener
{
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onCommandPreProcess(PlayerCommandPreprocessEvent e)
  {
    String[] msg = e.getMessage().split(" ");
    List<String> plugins = new ArrayList<>();
    plugins.add("pl");
    plugins.add("plugin");
    plugins.add("ver" + msg);
    plugins.add("help" + msg);
    plugins.add("pex" + msg);
    plugins.add("peermissionex" + msg);
    plugins.add("peermissionsex" + msg);
    plugins.add("ver");
    plugins.add("help");
    plugins.add("?");
    plugins.add("me");
    plugins.add("bukkit:help");
    plugins.add("plugins");
    plugins.add("minecraft:me");
    for (String Loop : plugins) {
      if (msg[0].equalsIgnoreCase("/" + Loop))
      {
          e.getPlayer().sendMessage("§5§lEPIC§F§lKITS§c §4-> §cComando nao encontrado! ");
        e.setCancelled(true);
      }
    }
  }
}
