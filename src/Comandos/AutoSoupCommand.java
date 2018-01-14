package Comandos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import Main.Main;

public class AutoSoupCommand
  implements CommandExecutor
{
 
public static HashMap<String, ItemStack[]> saveinv = new HashMap<String, ItemStack[]>();
  public static HashMap<String, ItemStack[]> armadura = new HashMap<String, ItemStack[]>();

  public static ArrayList<String> AutoSoupChecker = new ArrayList<String>();

  

  public static int getAmount(Player p, Material m)
  {
    int amount = 0;
    ItemStack[] arrayOfItemStack;
    int j = (arrayOfItemStack = p.getInventory().getContents()).length;
    for (int i = 0; i < j; i++)
    {
      ItemStack item = arrayOfItemStack[i];
      if ((item != null) && (item.getType() == m) && 
        (item.getAmount() > 0)) {
        amount += item.getAmount();
      }
    }
    return amount;
  }
  public boolean onCommand(CommandSender sender, Command comando, String label, String[] args)
  {
    final Player p = (Player)sender;
    if (!(sender instanceof Player)) {
      sender.sendMessage("§7Comando apenas no servidor!");
      return true;
    }
    if (comando.getName().equalsIgnoreCase("autosoup")) {
      if (!p.hasPermission("pluspvp.cmd.autosoup"))
      {
        p.sendMessage("§5§lEPIC§F§lKITS §c➜ §cDesculpe, mas você não tem permissão para fazer isso.");
        return true;
      }
      if (args.length == 0)
      {
        p.sendMessage("§5§lEPIC§F§lKITS §c➜ §cOps! Use isso De Maneira Correta: §f/autosoup <nick>");
        return true;
      }
      final Player t = Bukkit.getPlayer(args[0]);
      if (t == null)
      {
        p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §cOps! Parece que este Jogador Não foi Encontrado!");
        return true;
      }
      ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
      saveinv.put(t.getName(), t.getInventory().getContents());
      armadura.put(t.getName(), t.getInventory().getArmorContents());
      t.getInventory().clear();
      Random r = new Random();
      int gg = r.nextInt(23) + 9;
      t.getInventory().setItem(gg, sopa);
      t.getInventory().setItem(gg, sopa);
      t.setHealth(4.5D);
      t.closeInventory();
      p.openInventory(t.getInventory());
      AutoSoupChecker.add(t.getName());
      p.sendMessage("§5§lEPIC§F§lKITS §c ➜ §aIniciando analise de AutoSoup...");
       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
      {
        public void run()
        {
          p.closeInventory();
          p.sendMessage("");
          p.sendMessage("");
          p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aJogador Testado: §f" + t.getName());
          p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aTomou a sopa: §fNão");
          if (getAmount(p, Material.MUSHROOM_SOUP) == 1)
            p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aProbabilidade: §fNenhuma.");
          else {
              p.sendMessage("");
              p.sendMessage("");
              p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aJogador Testado: §f" + t.getName());
              p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aTomou a sopa: §fSim");
              p.sendMessage("§5§lEPIC§F§lKITS §c➜ §aProbabilidade: §fSuspeito.");
              p.sendMessage("         §cSolicite Tela!§c         ");
          }
          p.sendMessage("");
        }
      }
      , 30L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
      {
        public void run()
        {
          t.setHealth(20.0D);
       AutoSoupChecker.remove(t.getName());
          t.getInventory().setContents((ItemStack[])saveinv.get(t.getName()));
          t.getInventory().setArmorContents((ItemStack[])armadura.get(t.getName()));
          t.updateInventory();
        }
      }
      , 45L);
    }
    return false;
  }
}