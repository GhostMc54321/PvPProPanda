package Comandos;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import API.ChatInterativo;
import Main.Main;

public class ReportCommand
  implements CommandExecutor
{
	
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<String> reported = new ArrayList();
	  
	  
  private Main plugin;
  
  public ReportCommand(Main plugin)
  {
    this.plugin = plugin;
  }
  
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    final Player p = (Player)sender;
    if (!(sender instanceof Player))
    {
      sender.sendMessage("§cVocê Não Pode usar isso No Console!");
      return false;
    }
    if (commandLabel.equalsIgnoreCase("report")) {
      if (args.length >= 2)
      {
        Player target = p.getServer().getPlayer(args[0]);
        if (target != null)
        {
          if (this.reported.contains(p.getName()))
          {
            p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cAguarde Para §fREPORTAR§c Novamente!");
            return true;
          }
          String reportMsg = StringUtils.join(
            Arrays.copyOfRange(args, 1, args.length), " ");
          this.reported.add(p.getName());
          p.sendMessage("§E§LMASTERKITS ➜ §aO Jogador §f" + target.getName() + " §aFoi Reportado por §f" + reportMsg);
          Player[] arrayOfPlayer;
          int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
          for (int i = 0; i < j; i++)
          {
            Player s = arrayOfPlayer[i];
            if (s.hasPermission("pluspvp.actions.report"))
            {
              s.playSound(s.getLocation(), Sound.ANVIL_USE, 15.0F, 1.0F);
              s.sendMessage("§c§m>----------------------<");
              s.sendMessage("      §6�? §6§lREPORT §6�?     ");
              s.sendMessage("§c");
              s.sendMessage("§7�? Jogador Reportado ▸ §6" + target.getName());
              s.sendMessage("§7�? Motivo ▸ §6" + reportMsg);
              s.sendMessage("§7�? Reporter ▸ §6" + p.getName());
              s.sendMessage("§7�? Servidor ▸ §6KitPvP");
              ChatInterativo.Comando(s.getName(), "§c�? Teleportar-se Até o Suspeito","/tp " + target.getName(), "§7�? Ir Até ▸ §6" + target.getName());
              ChatInterativo.Comando(s.getName(), "§e�? Teleportar-se Até Quem Reportou","/tp " + p.getName(), "§7�? Ir Até ▸ §6" + p.getName());
              p.sendMessage("§c");
              s.sendMessage("§c");
              s.sendMessage("§c>§m----------------------<");
              Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
              {

                public void run()
                {
                  ReportCommand.this.reported.remove(p.getName());
                }
              }, 300L);
            }
          }
        }
        else
        {
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
        }
      }
      else
      {
        p.sendMessage("§5§lEPIC§F§lKITS§c ➜  §cOps! Use isso De Maneira Correta: §f/report <jogador> <motivo>");
      }
    }
    return false;
  }
}
