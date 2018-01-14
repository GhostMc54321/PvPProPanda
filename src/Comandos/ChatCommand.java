package Comandos;

import org.bukkit.event.*;
import org.bukkit.event.player.*;


import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;

public class ChatCommand implements Listener, CommandExecutor
{
    public static boolean chat1;
    
    static {
        ChatCommand.chat1 = true;
    }
    
    @EventHandler
    public void onPlayerChat(final AsyncPlayerChatEvent e) {
        if (!e.getPlayer().hasPermission("pluspvp.actions.falarchat") && !ChatCommand.chat1) {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§c-----------------------------------");
            e.getPlayer().sendMessage("         §5§lEPIC§F§lKITS §c     ");
            e.getPlayer().sendMessage("   §7O Chat está §cDeastivado§7!");
            e.getPlayer().sendMessage("§7Apenas Membros do grupo §6[VIPLENDARIO]");
            e.getPlayer().sendMessage("    §7Ou Superior podem falar!");
            e.getPlayer().sendMessage("§c-----------------------------------");
        }
    }
    
    @SuppressWarnings("deprecation")
	@EventHandler
    public void onPlayerChat1(final PlayerChatEvent e) {
        if (!e.getPlayer().hasPermission("pluspvp.actions.falarchat") && !ChatCommand.chat1) {
            e.setCancelled(true);
        }
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        if (sender.hasPermission("pluspvp.cmd.chat")) {
            if (args.length > 0) {
                if (args.length == 1) {
                    if (args[0].equalsIgnoreCase("off")) {
                        ChatCommand.chat1 = false;
                        Bukkit.broadcastMessage("§c-----------------------------------");
                        Bukkit.broadcastMessage("          §5§lEPIC§F§lKITS§c         ");
                        Bukkit.broadcastMessage("     §7O Chat foi §cDesativado§7!     ");
                        Bukkit.broadcastMessage(" §7Apenas Membros do Grupo §6[VIPLENDARIO]  ");
                        Bukkit.broadcastMessage("     §7Ou §dSuperior §7Podem falar     ");
                        Bukkit.broadcastMessage("§c-----------------------------------");
                    }
                    else if (args[0].equalsIgnoreCase("on")) {
                        ChatCommand.chat1 = true;
                        Bukkit.broadcastMessage("§c-----------------------------------");
                        Bukkit.broadcastMessage("          §5§lEPIC§F§lKITS§c         ");
                        Bukkit.broadcastMessage("     §7O Chat foi §aAtivado§7!     ");
                        Bukkit.broadcastMessage("   §7Todos podem Falar novamente!  ");
                        Bukkit.broadcastMessage("§c-----------------------------------");
                    }
                }
                else {
                    sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/chat <on/off>");
                }
            }
            else {
                sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/chat <on/off>");
            }
        }
        return true;
    }
}
