package Comandos;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Main.Main;

public class ClicktestCommand
  implements Listener, CommandExecutor
{
	
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	public static ItemStack click1;
	public static ItemMeta click1meta;
	public static ItemStack parkour;
	public static ItemMeta parkourmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;
  
  public static ArrayList<String> click = new ArrayList<>();
  public static ArrayList<String> jaesta = new ArrayList<>();
  
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args)
  {
    final Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("testclick"))
    {
      if (jaesta.contains(p.getName()))
      {
        p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cVocê já está em um Teste!");
        return true;
      }
      Bukkit.getScheduler().scheduleAsyncDelayedTask(Main.getInstace(), new Runnable()
      {
        public void run()
        {
        	jaesta.add(p.getName());
        	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aTeste iniciando em §f3 Segundos!");
         
        }
      }, 20L);
      Bukkit.getScheduler().scheduleAsyncDelayedTask(Main.getInstace(), new Runnable()
      {
        public void run()
        {
        	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aTeste iniciando em §f2 Segundos!");
        
        }
      }, 40L);
      Bukkit.getScheduler().scheduleAsyncDelayedTask(Main.getInstace(), new Runnable()
      {
        public void run()
        {
           	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aTeste iniciando em §f1 Segundos!");
          
        }
      }, 60L);
      Bukkit.getScheduler().scheduleAsyncDelayedTask(Main.getInstace(), new Runnable()
      {
		public void run()
        {
           	p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Teste foi §fINICIADO§a!");
          
          p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cLembre-se de Clicar sem §fNADA§a Na Mão!");
          ClicktestCommand.click.add(p.getName());
        }
      }, 80L);
      Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstace(), new Runnable()
      {
		public void run()
        {
          if (ClicktestCommand.click.contains(p.getName()))
          {
        	jaesta.remove(p.getName());
            click.remove(p.getName());
           
            p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aVoce finalizou o Teste!");
            p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aCalculando Resultados...");
            p.sendMessage("§E");
            p.sendMessage("§E");
            p.sendMessage("§E");
            p.sendMessage("§E");
            p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aResultados Calculados:");
            p.sendMessage("§7");
            p.sendMessage("§7�? Tempo do Teste ▸ §a20 Segundos");
            p.sendMessage("§7�? Clicks que Você deu ▸ §a" + p.getLevel());
            p.sendMessage("§E");
            p.setLevel(0);
          }
        }
      }, 500L);
      return true;
    }
    return true;
  }
  
  @EventHandler
  public void clicar(PlayerInteractEvent e)
  {
    Player p = e.getPlayer();
    if ((click.contains(p.getName())) && (e.getAction() == Action.LEFT_CLICK_AIR) && (p.getItemInHand().getType() == Material.AIR)) {
      p.setLevel(p.getLevel() + 1);
    }
  }
   @EventHandler
   public void clicando(PlayerInteractEvent e) {
   Player p = e.getPlayer();
  	if ((jaesta.contains(p.getName()))) {
  		
  	}
  }
}
