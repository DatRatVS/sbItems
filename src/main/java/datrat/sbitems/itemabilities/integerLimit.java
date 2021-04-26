package datrat.sbitems.itemabilities;

import datrat.sbitems.sbItems;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;

public class integerLimit implements Listener {

	@EventHandler
	public void integerLimit0noPlace(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.PUFFERFISH_BUCKET))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Integer Limit")) {
				Player player = event.getPlayer();
				Location loc = player.getLocation();
				player.resetTitle();
				if (event.getAction() == Action.RIGHT_CLICK_AIR) {
					/* for (String s : Arrays.asList("2", "21", "214", "2147", "21474", "214748", "2147483", "21474836", "214748364")) {
						player.sendTitle(s, null, 1, 2, 1);
						player.playSound(loc, Sound.BLOCK_ANVIL_PLACE, 1, 0);
					}*/
					String msg = "2147483647";
					for(int i = 1; i <= msg.length(); i++) {
						int finalI = i;
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + msg.substring(0, finalI), null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_ANVIL_PLACE, 1, 0);
						}, 8L * i);
					}
				}
				if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					event.setCancelled(true);
					String msg = "2147483647";
					for(int i = 1; i <= msg.length(); i++) {
						int finalI = i;
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + msg.substring(0, finalI), null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_ANVIL_PLACE, 1, 0);
						}, 8L * i);
					}
				}
			}
	}

}