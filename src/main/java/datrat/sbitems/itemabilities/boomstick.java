package datrat.sbitems.itemabilities;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class boomstick implements Listener {
	public void boomstickShoot(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.STICK))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Boomstick")) {
				Player player = (Player) event.getPlayer();
				if (event.getAction() == Action.RIGHT_CLICK_AIR) {
					TNTPrimed tnt = (TNTPrimed) player.getWorld().spawn(player.getLocation(), TNTPrimed.class);
					tnt.setVelocity(player.getLocation().getDirection().normalize().multiply(2));
				}
			}
	}
}
