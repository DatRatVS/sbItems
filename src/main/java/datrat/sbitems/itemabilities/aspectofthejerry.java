package datrat.sbitems.itemabilities;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class aspectofthejerry implements Listener {

	@EventHandler
	public void jerryParley(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.WOODEN_SWORD))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Aspect of the Jerry")) {
				Player player = event.getPlayer();
				// Parley - Right Click
				if (event.getAction() == Action.RIGHT_CLICK_AIR) {
					Location loc = player.getLocation();
					player.playSound(loc, Sound.ENTITY_VILLAGER_AMBIENT, 10, 1);
                    /*ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                    String command = "playsound minecraft:entity.villager.ambient player @a";
                    Bukkit.dispatchCommand(console, command);*/
				}
				if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					Location loc = player.getLocation();
					player.playSound(loc, Sound.ENTITY_VILLAGER_AMBIENT, 10, 1);
				}
			}
	}
}
