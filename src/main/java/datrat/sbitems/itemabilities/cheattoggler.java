package datrat.sbitems.itemabilities;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class cheattoggler implements Listener {

	@EventHandler
	public void cheatToggler(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.SMOOTH_STONE))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Cheat Toggler")) {
					Player player = event.getPlayer();
					if (event.getAction() == Action.RIGHT_CLICK_AIR) {
						if (player.isOp()) {
							player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are not opped anymore.");
						} else {
							player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are now opped.");
						}
						player.setOp(!player.isOp());
					}
						if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
							event.setCancelled(true);
							if (player.isOp()) {
								player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are not opped anymore.");
							} else {
								player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are now opped.");
							}
							player.setOp(!player.isOp());
						}
						if (event.getAction() == Action.LEFT_CLICK_AIR) {
							switch (player.getGameMode()) {
								case CREATIVE:
									player.setGameMode(GameMode.SURVIVAL);
									player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are now on survival mode.");
									break;
								case SURVIVAL:
								case ADVENTURE:
								case SPECTATOR:
									player.setGameMode(GameMode.CREATIVE);
									player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are now on creative mode.");
									break;
							}
						}
							if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
								event.setCancelled(true);
								switch (player.getGameMode()) {
									case CREATIVE:
										player.setGameMode(GameMode.SURVIVAL);
										player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are now on survival mode.");
										break;
									case SURVIVAL:
									case ADVENTURE:
									case SPECTATOR:
										player.setGameMode(GameMode.CREATIVE);
										player.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "Cheat Toggler whispers to you: You are now on creative mode.");
										break;
								}
							}
						}
				}
		/*if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.SMOOTH_STONE))
			if (Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta()).hasLore()) {
				Player player = event.getPlayer();
				// Parley - Right Click
				if (event.getAction() == Action.RIGHT_CLICK_AIR) {
					player.setOp(!player.isOp());
					if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
						event.setCancelled(true);
						player.setOp(!player.isOp());
					}
					if (event.getAction() == Action.LEFT_CLICK_AIR) {
						switch (player.getGameMode()) {
							case CREATIVE:
								player.setGameMode(GameMode.SURVIVAL);
								break;
							case SURVIVAL:
							case ADVENTURE:
							case SPECTATOR:
								player.setGameMode(GameMode.CREATIVE);
								break;
						}
						if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
							event.setCancelled(true);
							switch (player.getGameMode()) {
								case CREATIVE:
									player.setGameMode(GameMode.SURVIVAL);
									break;
								case SURVIVAL:
								case ADVENTURE:
								case SPECTATOR:
									player.setGameMode(GameMode.CREATIVE);
									break;
							}
						}
					}
				}
			}*/
}
