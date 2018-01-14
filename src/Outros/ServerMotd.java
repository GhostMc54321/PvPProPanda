package Outros;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerMotd
  implements Listener
{
  @EventHandler
  public void NomedoServer(ServerListPingEvent e)
  {
	e.setMotd("       §3§m    §b§m    §7§m    §f§l§m[ §5§lEPIC§F§lKITS§c §f§l§m]§7§m    §b§m    §3§m     \n§f      §cVenha treinar seu pvp com qualidade!");
    e.setMaxPlayers(60);
  }
}
