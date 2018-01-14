package ScoreBoard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import Main.Main;
import Manager.CombatLog;
import Manager.Elos;
import Manager.Groups;
import Manager.PorcentElo;
import Utilidades.KillsDeathsMoney;
import Utilidades.KitAPI;

public class ScoreboardUser
  extends BukkitRunnable
{
  public void run()
  {
    Player[] arrayOfPlayer;
    @SuppressWarnings("deprecation")
	int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
    for (int i = 0; i < j; i++)
    {
      Player p = arrayOfPlayer[i];
      ScoreboardHelper score = (ScoreboardHelper)Main.scoreboard.get(p);
      score.clear();
      score.add(" ", " ");
      score.add("  §fKills: ", " §a" + KillsDeathsMoney.getKills(p));
      score.add("  §fMortes:", " §c" + KillsDeathsMoney.getDeaths(p));
      score.add(" ", " ");
      score.add("  §fKit: ", "§6" + KitAPI.getKit(p));
      score.add("  §fCombate: ", "§7" + CombatLog.statuscombat(p));
      score.add("  §fCargo: ", Groups.getRank(p));
      score.add("", " ");
      score.add("  §fXP: ", " §b" + KillsDeathsMoney.getMoney(p));
      score.add("  §fElo UP: ", " §f" + PorcentElo.ExperienciaPlayer(p));
      score.add("  §fElo:", " §6" + Elos.getElo(p));
      score.add("", " ");
      score.update(p);
    }
  }
  
  public static Scoreboard getScoreBoard()
  {
    ScoreboardManager manager = Bukkit.getScoreboardManager();
    Scoreboard board = manager.getNewScoreboard();
    return board;
  }
  
  public static void clearScoreboard(Player p)
  {
    getScoreBoard().clearSlot(DisplaySlot.SIDEBAR);
    p.setScoreboard(getScoreBoard());
  }
}
