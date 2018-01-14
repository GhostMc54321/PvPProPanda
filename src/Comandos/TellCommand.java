package Comandos;

import org.bukkit.entity.*;


import java.util.*;
import org.bukkit.command.*;
import org.bukkit.*;

public class TellCommand implements CommandExecutor
{
    public static HashMap<Player, Player> gettell;
    static ArrayList<Player> telloff;
    
    static {
        TellCommand.gettell = new HashMap<Player, Player>();
        TellCommand.telloff = new ArrayList<Player>();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (label.equalsIgnoreCase("tell")) {
            if (args.length == 0) {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/tell <nick> <mensagem>");
                return true;
            }
            final Player target = Bukkit.getPlayer(args[0]);
            if (args[0].toLowerCase().equalsIgnoreCase("on")) {
                TellCommand.telloff.remove(p);
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce ativou Seu §fTELL§a!");
            }
            else if (args[0].toLowerCase().equalsIgnoreCase("off")) {
                TellCommand.telloff.add(p);
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVoce desativou Seu §fTELL§c!");
            }
            if (args.length > 1) {
                if (target == null) {
                    p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
                    return true;
                }
                if (TellCommand.telloff.contains(target)) {
                    p.sendMessage( "§5§lEPIC§F§lKITS§c ➜ §cEste Jogador Está com o §fTELL§c Desligado!");
                    return true;
                }
                final StringBuilder sb = new StringBuilder();
                for (int i = 1; i < args.length; ++i) {
                    sb.append(args[i]).append(" ");
                }
                final String allArgs = sb.toString().trim();
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aMensagem Enviada para §f" + target.getName() + "§8(§a" + allArgs + "§8)");
                target.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aMensagem Recebida de §f" + p.getName() + "§8(§a" + allArgs + "§8)");
                TellCommand.gettell.put(p, target);
                TellCommand.gettell.put(target, p);
            }
        }
            if (!TellCommand.gettell.containsKey(p)) {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cNão Tem ninguém No seu Histórico para Responder!");
                return true;
            }
            final Player deslogo = TellCommand.gettell.get(p);
            if (deslogo == null) {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
                return true;
            }
            if (TellCommand.telloff.contains(deslogo)) {
                p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cEste Jogador Está com o §fTELL§c Desligado!");
                return true;
            }
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < args.length; ++i) {
                sb.append(args[i]).append(" ");
            }
            final String allArgs = sb.toString().trim();
            p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aMensagem Enviada para §f" + deslogo.getName() + "§8(§a" + allArgs + "§8)");
            deslogo.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aMensagem Recebida de §f" + p.getName() + "§8(§a" + allArgs + "§8)");
        return false;
    }
}
