package Comandos;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import API.ArraysAPI;

public class sKitCommand implements CommandExecutor {
	
	public static HashMap<String, ItemStack[]> itens = new HashMap<String, ItemStack[]>();
	public static HashMap<String, ItemStack[]> armadura = new HashMap<String, ItemStack[]>();
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("skit")) {
			if (!(sender.hasPermission("pluspvp.cmd.skit"))) {
				sender.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cDesculpe, mas você não tem permissão para fazer isso.");
				return true;
			}
			if(args.length == 0) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/skit (criar, remover ou aplicar) <nome>");
				return true;
			}
			if(args.length == 1) {
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cOps! Use isso De Maneira Correta: §f/skit (criar, remover ou aplicar) <nome>");
				return true;
			}
			if(args.length <= 2) {
				if(args[0].equalsIgnoreCase("criar")) {
					String nome = args[1];
					if(itens.containsKey(nome) && armadura.containsKey(nome)) {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO kit §f" + nome + " §ajá existe!");
						return true;
					}
					itens.put(nome, p.getInventory().getContents());
					armadura.put(nome, p.getInventory().getArmorContents());
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO kit Nomeado de §f" + nome + " §aFoi criado!");
					return true;
				}
				if(args[0].equalsIgnoreCase("remover")) {
					String nome = args[1];
					if(!itens.containsKey(nome) && !armadura.containsKey(nome)) {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO kit §f" + nome + "§a não existe!");
						return true;
					}
					itens.remove(nome);
					armadura.remove(nome);
					p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §cO Kit" + nome + " §cFoi Removido!");
					return true;
				}
				if(args[0].equalsIgnoreCase("aplicar")) {
					String nome = args[1];
					if(!itens.containsKey(nome) && !armadura.containsKey(nome)) {
						p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Kit §f" + nome + "§a não existe!");
						return true;
					}
					if(itens.containsKey(nome) && armadura.containsKey(nome)) {
						for(Player todos : Bukkit.getOnlinePlayers()) {
							if(todos != p) {
								if(!ArraysAPI.Admin.contains(todos)) {
									todos.getInventory().setContents((ItemStack[])itens.get(nome));
									todos.getInventory().setArmorContents((ItemStack[])armadura.get(nome));
									todos.updateInventory();
									p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aO Kit §f" + nome + "§aFoi Aplicado Para Todos os Jogadores!");
									Bukkit.broadcastMessage("§c[ALERTA] O Kit §f" + nome + " §cFoi Aplicado para Todos os Jogadores Online!");
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

}
