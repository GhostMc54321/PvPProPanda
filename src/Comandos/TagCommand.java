package Comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import API.ChatInterativo;
import Utilidades.TagsAPI;
import ca.wacos.nametagedit.NametagAPI;

public class TagCommand implements CommandExecutor, Listener {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Comando apenas para jogadores");
			return true;
		}
		Player p = (Player) sender;
		if (args.length == 0) {
			if (p.hasPermission("rank.dono")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§2[DONO]", "/tag dono",
						"§e(Clique) §7" + "§7Exemplo: §4[DONO] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[DEVELOPER]", "/tag developer",
						"§e(Clique) §7" + "§7Exemplo: §3[DEVELOPER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[GERENTE]", "/tag gerente",
						"§e(Clique) §7" + "§7Exemplo: §3[GERENTE] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c[ADMIN]", "/tag admin",
						"§e(Clique) §7" + "§7Exemplo: §3[ADMIN] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD++]", "/tag modfull",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD++] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD+]", "/tag modplus",
						"§e(Clique) §7" + "§7Exemplo: §5[MODPLUS] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD]", "/tag mod",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[TRIAL]", "/tag trial",
						"§e(Clique) §7" + "§7Exemplo: §d[TRIAL] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§4[HELPER]", "/tag helper",
						"§e(Clique) §7" + "§7Exemplo: §d[HELPER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[BUILDER]", "/tag builder",
						"§e(Clique) §7" + "§7Exemplo: §2[BUILDER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER+]", "/tag youtuber+",
						"§e(Clique) §7" + "§7Exemplo: §B[YOUTUBER+] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER]", "/tag youtuber",
						"§e(Clique) §7" + "§7Exemplo: §b[YOUTUBER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.gerente")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§3[GERENTE]", "/tag gerente",
						"§e(Clique) §7" + "§7Exemplo: §3[GERENTE] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c[ADMIN]", "/tag admin",
						"§e(Clique) §7" + "§7Exemplo: §3[ADMIN] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD++]", "/tag modfull",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD++] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD+]", "/tag modplus",
						"§e(Clique) §7" + "§7Exemplo: §5[MODPLUS] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD]", "/tag mod",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[TRIAL]", "/tag trial",
						"§e(Clique) §7" + "§7Exemplo: §d[TRIAL] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§4[HELPER]", "/tag helper",
						"§e(Clique) §7" + "§7Exemplo: §d[HELPER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[BUILDER]", "/tag builder",
						"§e(Clique) §7" + "§7Exemplo: §2[BUILDER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER+]", "/tag youtuber+",
						"§e(Clique) §7" + "§7Exemplo: §B[YOUTUBER+] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER]", "/tag youtuber",
						"§e(Clique) §7" + "§7Exemplo: §b[YOUTUBER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.developer")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§3[DEVELOPER]", "/tag developer",
						"§e(Clique) §7" + "§7Exemplo: §3[DEVELOPER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[GERENTE]", "/tag gerente",
						"§e(Clique) §7" + "§7Exemplo: §3[GERENTE] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§c[ADMIN]", "/tag admin",
						"§e(Clique) §7" + "§7Exemplo: §3[ADMIN] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD++]", "/tag modfull",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD++] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD+]", "/tag modplus",
						"§e(Clique) §7" + "§7Exemplo: §5[MODPLUS] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§1[MOD]", "/tag mod",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[TRIAL]", "/tag trial",
						"§e(Clique) §7" + "§7Exemplo: §d[TRIAL] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§4[HELPER]", "/tag helper",
						"§e(Clique) §7" + "§7Exemplo: §d[HELPER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[BUILDER]", "/tag builder",
						"§e(Clique) §7" + "§7Exemplo: §2[BUILDER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER+]", "/tag youtuber+",
						"§e(Clique) §7" + "§7Exemplo: §B[YOUTUBER+] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER]", "/tag youtuber",
						"§e(Clique) §7" + "§7Exemplo: §b[YOUTUBER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.admin")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§c[ADMIN]", "/tag admin",
						"§e(Clique) §7" + "§7Exemplo: §3[ADMIN] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.modplus")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§1[MOD]", "/tag mod",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.builder")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§2[BUILDER]", "/tag builder",
						"§e(Clique) §7" + "§7Exemplo: §2[BUILDER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEliteEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.mod")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§1[MOD]", "/tag mod",
						"§e(Clique) §7" + "§7Exemplo: §5[MOD] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEliteEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.trial")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§5[TRIAL]", "/tag trial",
						"§e(Clique) §7" + "§7Exemplo: §d[TRIAL] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEliteEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.helper")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§4[HELPER]", "/tag helper",
						"§e(Clique) §7" + "§7Exemplo: §d[HELPER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.youtuber+")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER+]", "/tag youtuber+",
						"§e(Clique) §7" + "§7Exemplo: §B[YOUTUBER+] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER]", "/tag youtuber",
						"§e(Clique) §7" + "§7Exemplo: §b[YOUTUBER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.youtuber")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§b[YOUTUBER]", "/tag youtuber",
						"§e(Clique) §7" + "§7Exemplo: §b[YOUTUBER] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.VipEpic")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§5[VipEpic]", "/tag VipEpic",
						"§e(Clique) §7" + "§7Exemplo: §D[VipEliteEpic] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.VipLendario")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§3[VipLendario]", "/tag VipLendario",
						"§e(Clique) §7" + "§7Exemplo: §6[VipLendario] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			if (p.hasPermission("rank.VipElite")) {
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
				p.sendMessage("§E");
				ChatInterativo.Comando(p.getName(), "§2[VipElite]", "/tag VipElite",
						"§e(Clique) §7" + "§7Exemplo: §E[VipElite] §7" + p.getName());
				ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
						"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
				return true;
			}
			p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aListagem de §fTODAS§a as Suas §fTAGS§a:");
			p.sendMessage("§E");
			ChatInterativo.Comando(p.getName(), "§7[NORMAL]", "/tag normal",
					"§e(Clique) §7" + "§7Exemplo: §7" + p.getName());
			return true;
		}
		if (p.hasPermission("tag.dono")) {
			if (args[0].equalsIgnoreCase("dono")) {
				TagsAPI.setarTag(p, "§2[DONO]§7 ");
				NametagAPI.setPrefix(p.getName(), "§2[DONO]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §2[DONO]");

				return true;
			}
		}
		if (p.hasPermission("tag.gerente")) {
			if (args[0].equalsIgnoreCase("gerente")) {
				TagsAPI.setarTag(p, "§3[GERENTE]§7 ");
				NametagAPI.setPrefix(p.getName(), "§3[GERENTE]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §3[GERENTE]");

				return true;
			}
		}
		if (p.hasPermission("tag.admin")) {
			if (args[0].equalsIgnoreCase("admin")) {
				TagsAPI.setarTag(p, "§c[ADMIN]§7 ");
				NametagAPI.setPrefix(p.getName(), "§c[ADMIN]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §c[ADMIN]");

				return true;
			}
		}
		if (p.hasPermission("tag.mod++")) {
			if (args[0].equalsIgnoreCase("modfull")) {
				TagsAPI.setarTag(p, "§1[MOD++]§7 ");
				NametagAPI.setPrefix(p.getName(), "§1[MOD++]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §1[MOD++]");

				return true;
			}
		}
		if (p.hasPermission("tag.developer")) {
			if (args[0].equalsIgnoreCase("developer")) {
				TagsAPI.setarTag(p, "§3[DEVELOPER]§7 ");
				NametagAPI.setPrefix(p.getName(), "§3[DEVELOPER]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §3[DEVELOPER]");

				return true;
			}
		}
		if (p.hasPermission("tag.mod+")) {
			if (args[0].equalsIgnoreCase("modplus")) {
				TagsAPI.setarTag(p, "§1[MOD+]§7 ");
				NametagAPI.setPrefix(p.getName(), "§1[MOD+]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §1[MOD+]");

				return true;
			}
		}
		if (p.hasPermission("tag.mod")) {
			if (args[0].equalsIgnoreCase("mod")) {
				TagsAPI.setarTag(p, "§1[MOD]§7 ");
				NametagAPI.setPrefix(p.getName(), "§1[MOD]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §1[MOD]");

				return true;
			}
		}
		if (p.hasPermission("tag.builder")) {
			if (args[0].equalsIgnoreCase("builder")) {
				TagsAPI.setarTag(p, "§2[BUILDER]§7 ");
				NametagAPI.setPrefix(p.getName(), "§2[BUILDER]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §2[BUILDER]");

				return true;
			}
		}
		if (p.hasPermission("tag.trial")) {
			if (args[0].equalsIgnoreCase("trial")) {
				TagsAPI.setarTag(p, "§5[TRIAL]§7 ");
				NametagAPI.setPrefix(p.getName(), "§5[TRIAL]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §5[TRIAL]");

				return true;
			}
		}
		if (p.hasPermission("tag.helper")) {
			if (args[0].equalsIgnoreCase("helper")) {
				TagsAPI.setarTag(p, "§4[HELPER]§7 ");
				NametagAPI.setPrefix(p.getName(), "§4[HELPER]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §4[HELPER]");

				return true;
			}
		}
		if (p.hasPermission("tag.youtuber+")) {
			if (args[0].equalsIgnoreCase("youtuber+")) {
				TagsAPI.setarTag(p, "§b[YOUTUBER+]§7 ");
				NametagAPI.setPrefix(p.getName(), "§b[YOUTUBER+]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §B[YOUTUBER+]");

				return true;
			}
		}
		if (p.hasPermission("tag.youtuber")) {
			if (args[0].equalsIgnoreCase("youtuber")) {
				TagsAPI.setarTag(p, "§b[YOUTUBER]§7 ");
				NametagAPI.setPrefix(p.getName(), "§b[YOUTUBER]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§3 ➜ §aSua Tag foi Alterada para §B[YOUTUBER]");

				return true;
			}
		}
		if (p.hasPermission("tag.VipEliteEpic")) {
			if (args[0].equalsIgnoreCase("VipEliteEpic")) {
				TagsAPI.setarTag(p, "§5[VipEliteEpic]§7 ");
				NametagAPI.setPrefix(p.getName(), "§5[VipEliteEpic]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSua Tag foi Alterada para §5[VipEliteEpic]");

				return true;
			}
		}
		if (p.hasPermission("tag.VipLendario")) {
			if (args[0].equalsIgnoreCase("VipLendario")) {
				TagsAPI.setarTag(p, "§3[VipLendario]§7 ");
				NametagAPI.setPrefix(p.getName(), "§3[VipLendario]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSua Tag foi Alterada para §3[VipLendario]");

				return true;
			}
		}
		if (p.hasPermission("tag.VipElite")) {
			if (args[0].equalsIgnoreCase("VipElite")) {
				TagsAPI.setarTag(p, "§2[VipElite]§7 ");
				NametagAPI.setPrefix(p.getName(), "§2[VipElite]§7 ");
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSua Tag foi Alterada para §2[VipElite]§7");

				return true;
			}
		}
		if (p.hasPermission("tag.normal")) {
			if (args[0].equalsIgnoreCase("normal")) {
				TagsAPI.setarTag(p, "§7");
				NametagAPI.setPrefix(p.getName(), "§7");
				p.sendMessage("§5§lEPIC§F§lKITS§c ➜ §aSua Tag foi Alterada para §7[NORMAL]");

				return true;
			}
		}
		return false;
	}
}
