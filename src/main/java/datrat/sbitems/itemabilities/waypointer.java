package datrat.sbitems.itemabilities;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;

public class waypointer implements Listener {

	@EventHandler
	public void waypointerAbility(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.MOJANG_BANNER_PATTERN))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Waypointer")) {
					Player player = event.getPlayer();
					if (event.getAction() == Action.RIGHT_CLICK_AIR) {

						locationSave.remove(player);
						worldSave.remove(player);

						locationSave.put(player, player.getLocation());
						worldSave.put(player, player.getWorld().getSpawnLocation());
						player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Waypointer whispers to you: Saved your waypoint!");

					}
					if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

						locationSave.remove(player);
						worldSave.remove(player);

						locationSave.put(player, player.getLocation());
						worldSave.put(player, player.getWorld().getSpawnLocation());
						player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Waypointer whispers to you: Saved your waypoint!");

					}

					if (event.getAction() == Action.LEFT_CLICK_AIR) {

						Location worldSpawn = worldSave.get(player);
						player.teleport(worldSpawn);

						Location originalLocation = locationSave.get(player);
						player.teleport(originalLocation);
						player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Waypointer whispers to you: You got teleported to the waypoint!");

					}

					if (event.getAction() == Action.LEFT_CLICK_BLOCK) {

						event.setCancelled(true);
						Location worldSpawn = worldSave.get(player);
						player.teleport(worldSpawn);

						Location originalLocation = locationSave.get(player);
						player.teleport(originalLocation);
						player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Waypointer whispers to you: You got teleported to the waypoint!");

					}
				}
	}
	public HashMap<Player, Location> locationSave = new HashMap<>();
	public HashMap<Player, Location> worldSave = new HashMap<>();
}