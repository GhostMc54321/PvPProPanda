package Kits;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import Main.Main;
import Utilidades.KitAPI;

public class Thor
  implements Listener
{
  @SuppressWarnings("deprecation")
@EventHandler
  public void Interagir(PlayerInteractEvent e)
  {
    final Player p = e.getPlayer();
    if ((KitAPI.getKit(p) == "Thor") && (e.getMaterial() == Material.GOLD_AXE)) {
      if (!KitAPI.KitDelay.containsKey(p.getName()))
      {
        Location loc = p.getTargetBlock(null, 20).getLocation();
        p.getWorld().strikeLightning(loc);
        p.getWorld().strikeLightningEffect(loc);
        p.getWorld().strikeLightningEffect(loc.add(1.0D, 0.0D, 1.0D));
        
        KitAPI.KitDelay.put(p.getName(), Integer.valueOf(15));
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable()
        {
          public void run()
          {
            if ((KitAPI.getKit(p) == "Thor") && (KitAPI.KitDelay.containsKey(p.getName())) && (((Integer)KitAPI.KitDelay.get(p.getName())).intValue() <= 0))
            {
              KitAPI.KitDelay.remove(p.getName());
              p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSeu Kit §fTHOR§a Saiu de Cooldown!");
            }
          }
        }, 300L);
      }
      else
      {
        p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cSeu Kit §fTHOR§c Ainda está em Cooldown!");
      }
    }
  }
}
