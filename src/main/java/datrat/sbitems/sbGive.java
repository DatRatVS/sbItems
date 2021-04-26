package datrat.sbitems;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sbGive implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("sbgivealt")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("[DatRat's sbItems] - Consoles aren't able to use this command");
				return true;
			}
			Player player = (Player) sender;
			//if (player.hasPermission("datratsbitems.sbgive")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "" + "[DatRat's sbItems] - Usage: /sbgive (item) (player)");
				return true;
			}
			if (hashmapItems.items.containsKey(args[0].toLowerCase())) {
				Player destiny;
				if (args[1].equalsIgnoreCase("")) {
					destiny = (Player) sender;
				} else {
					destiny = Bukkit.getPlayer(args[1]);
				}
				if (destiny == null) {
					player.sendMessage(ChatColor.GOLD + "" + "[DatRat's sbItems] - Seems like this player doesn't exist.");
					return true;
				}
				destiny.getInventory().addItem(hashmapItems.items.get(args[0].toLowerCase()));
				return true;
			} else {
				player.sendMessage(ChatColor.GOLD + "" + "[DatRat's sbItems] - Seems like this item doesn't exist.");
				return true;
			}
		}
		//}
		return false;
	}
}
