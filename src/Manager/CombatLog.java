package Manager;

import java.util.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.plugin.*;

import Main.Main;
import Utilidades.KitAPI;

import org.bukkit.event.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.*;

public class CombatLog implements Listener
{
    public static HashMap<Player, Player> emcombate;
    
    static {
        CombatLog.emcombate = new HashMap<Player, Player>();
    }
    
    public static boolean emCombate(final Player p) {
        return CombatLog.emcombate.containsKey(p);
    }
    
    public static String statuscombat(final Player p) {
        String nome = "";
        if (emCombate(p)) {
            nome = "§aSim";
        }
        else if (!emCombate(p)) {
            nome = "§cNão";
        }
        return nome;
    }
    
    @EventHandler
    public void aocombatlog(final EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && e.getEntity() instanceof Player) {
            final Player p = (Player)e.getEntity();
            final Player hitter = (Player)e.getDamager();
            if (KitAPI.getKit(p) != "Nenhum" && KitAPI.getKit(hitter) != "Nenhum" && !CombatLog.emcombate.containsKey(p) && !CombatLog.emcombate.containsKey(hitter)) {
                CombatLog.emcombate.put(p, hitter);
                CombatLog.emcombate.put(hitter, p);
                hitter.sendMessage("§4§lApple§f§lNetWork ➜ §cVocê Está em Combate com §f" + p.getDisplayName());
                p.sendMessage("§4§lApple§f§lNetWork ➜ §cVocê está em Combate com §f" + hitter.getDisplayName());
                Bukkit.getScheduler().scheduleSyncDelayedTask((Plugin)Main.instance, (Runnable)new Runnable() {
                    @Override
                    public void run() {
                        CombatLog.emcombate.remove(p);
                        CombatLog.emcombate.remove(hitter);
                        hitter.sendMessage("§4§lApple§f§lNetWork ➜ §aVocê saiu de combate!");
                        p.sendMessage("§4§lApple§f§lNetWork ➜ §aVocê saiu de combate!");
                    }
                }, 80L);
            }
        }
    }
    
	@EventHandler
    public void aomorrer(final PlayerDeathEvent e) {
        final Player p = e.getEntity();
        if (CombatLog.emcombate.containsKey(p.getName())) {
            final Player t = CombatLog.emcombate.get(p.getName());
            p.teleport(p.getWorld().getSpawnLocation());
            t.sendMessage("§4§lApple§f§lNetWork ➜ §aVocê saiu de combate!");
            CombatLog.emcombate.remove(p);
            CombatLog.emcombate.remove(t);
        }
    }
    
	@EventHandler
    public void aosair(final PlayerQuitEvent e) {
        final Player p = e.getPlayer();
        if (CombatLog.emcombate.containsKey(p.getName())) {
            final Player t = CombatLog.emcombate.get(p.getName());
            p.setHealth(0.0);
            p.teleport(p.getWorld().getSpawnLocation());
            CombatLog.emcombate.remove(p);
            CombatLog.emcombate.remove(t);
            Bukkit.broadcastMessage("§4§lApple§f§lNetWork ➜ §cO Jogador §f" + p.getName() + "§c Deslogou em PvP!");
            t.sendMessage("§aVoce esta fora de combate");
        }
    }
    
    @EventHandler
    public void aocomando(final PlayerCommandPreprocessEvent e) {
        final Player p = e.getPlayer();
        if (e.getMessage().toLowerCase().startsWith("/") && CombatLog.emcombate.containsKey(p)) {
            p.sendMessage("");
            e.setCancelled(true);
        }
    }
}
