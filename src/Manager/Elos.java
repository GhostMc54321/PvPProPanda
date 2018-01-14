package Manager;

import org.bukkit.entity.Player;

import Utilidades.KillsDeathsMoney;

public class Elos
{
  public static String getElo(Player p)
  {
    double a = KillsDeathsMoney.getMoney(p);
    if (a <= 30000.0D) {
      return "§fUNRANKED";
    }
    if (a <= 60000.0D) {
      return "§aINICIANTE";
    }
    if (a <= 90000.0D) {
      return "§eAPRENDIZ";
    }
    if (a <= 120000.0D) {
      return "§1EXPERT";
    }
    if (a <= 150000.0D) {
      return "§7SILVER";
    }
    if (a <= 170000.0D) {
      return "§6GOLD";
    }
    if (a <= 200000.0D) {
      return "§bDIAMOND";
    }
    if (a <= 250000.0D) {
      return "§2EMERALD";
    }
    if (a <= 270000.0D) {
      return "§cRUBY";
    }
    if (a <= 300000.0D) {
      return "§3SAFIRA";
    }
    if (a <= 350000.0D) {
      return "§4LENDARIO";
    }
    return "§4LENDARIO";
  }
}
