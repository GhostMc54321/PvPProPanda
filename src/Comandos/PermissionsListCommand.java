package Comandos;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class PermissionsListCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("pluspvp.actions.permissionslist"))
		if(cmd.getName().equalsIgnoreCase("permissionslist")) {
			if(args.length == 0) {
				p.sendMessage("§eExibindo lista de permissões:");
				p.sendMessage("§e");
				p.sendMessage("§7▸ Admin - Permissão ao Modo Administrador");
				p.sendMessage("§7▸ staffchat - Permissão ao StaffChat");
				p.sendMessage("§7▸ fullkit - Permissão ao FullKit (Todos os kits)");
				p.sendMessage("§7▸ teleportar - Permissão para Usar o /tp , tphere e /tpall");
				p.sendMessage("§7▸ setgroups - Permissão para setar grupos");
				p.sendMessage("§7▸ givevips - Permissão para dar Vips");
				p.sendMessage("§7▸ givekit - Permissão para Dar Kits");
				p.sendMessage("§7▸ sortearkit - Permissão para Sortear Kits (/sortearkit)");
				p.sendMessage("§7▸ sortearvip - Permissão para Sortear Vips (/sortearvip)");
				p.sendMessage("§7");
				p.sendMessage("§c[OBSERVAÇÃO] Essas permissões devem ser usadas no /givepermission ou /removepermission, Exemplo:");
				p.sendMessage("§7▸ /givepermission Tester Admin");
				p.sendMessage("§cDará ao jogador 'Tester' a Permissão do /admin (Modo Administrador)");
				p.sendMessage("§4[AVISO] O USO INAPROPRIADO, DE M�? FÉ, E ABUSIVO DESTES COMANDOS PODEM CAUSAR PERDA PERMANENTE DO SEU CARGO!");
				return true;

		}
		}
		return false;
	}
}
