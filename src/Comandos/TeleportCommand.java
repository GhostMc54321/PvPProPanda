package Comandos;

import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;


public class TeleportCommand implements CommandExecutor
{
    @SuppressWarnings("deprecation")
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("tp")) {
            if (p.hasPermission("pluspvp.cmd.tp")) {
                final Player t = Bukkit.getPlayer(args[0]);
                if (t == null) {
                    p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
                    return true;
                }
                p.teleport((Entity)t);
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê Foi Teleportado até §f" + t.getName());
            }
            else {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
            }
        }
        if (cmd.getName().equalsIgnoreCase("tphere")) {
            if (p.hasPermission("pluspvp.cmd.tp")) {
                if (args.length == 0) {
                    p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/tphere <player>");
                    return true;
                }
                final Player t = Bukkit.getPlayer(args[0]);
                if (t == null) {
                    p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
                    return true;
                }
                t.teleport((Entity)p);
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Jogador §f" + t.getName() + " §aFoi Teleportado até §fVOCE§a!");
            }
            else {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
            }
        }
        if (cmd.getName().equalsIgnoreCase("tpall")) {
            if (p.hasPermission("pluspvp.cmd.tp")) {
                Player[] onlinePlayers;
                for (int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length, i = 0; i < length; ++i) {
                    final Player todos = onlinePlayers[i];
                    todos.teleport((Entity)p);
                }
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVocê puxou Todos os Jogadores Online!");
                Bukkit.broadcastMessage("§5§lEPIC§F§lKITS§c ➜ §aTodos Foram Puxados até §f" + p.getName());
            }
            else {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
            }
        }
        return false;
    }
}
