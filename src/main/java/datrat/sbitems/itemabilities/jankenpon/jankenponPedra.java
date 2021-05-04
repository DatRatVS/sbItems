package datrat.sbitems.itemabilities.jankenpon;

import datrat.sbitems.sbItems;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class jankenponPedra implements Listener {
	@EventHandler
	public void jankenPedra(PlayerInteractEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.STONE))
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Ishi")) {

					Player player = event.getPlayer();
					Location loc = player.getLocation();
					player.resetTitle();

					int jankenponNumber = (int)(Math.random() * 3);
					String[] jankenponString = {"Stone!", "Shears!", "Paper!"};

					String result = jankenponString[jankenponNumber];

					if (event.getAction() == Action.RIGHT_CLICK_AIR) {
						event.setCancelled(true);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsu", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 0);
						}, 5L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsuno", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 1);
						}, 10L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsunoma", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 2);
						}, 15L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsunomaki", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 1);
						}, 20L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Jan", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 0);
						}, 25L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Janken", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 1);
						}, 30L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Jankenpon!", null, 2, 8, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 2);
						}, 35L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + result, null, 2, 40, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_PLING, 1, 2);
							switch (result) {
								case "Paper!":
									player.sendMessage("You lost!");
									player.playSound(loc, Sound.BLOCK_WOOL_STEP, 2, 0);
									break;
								case "Shears!":
									player.sendMessage("You won!");
									player.playSound(loc, Sound.EVENT_RAID_HORN, 100, 2);
									break;
								case "Stone!":
									player.sendMessage("You tied!");
									player.playSound(loc, Sound.BLOCK_WOOL_STEP, 2, 0);
									break;
							}
						}, 45L);
					}
					if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
						event.setCancelled(true);
						// String msg = "Tsunomaki Jankenpon";
							/* for(int i = 3; i <= msg.length(); i++) {
								int finalI = i;
								Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
									player.sendTitle(ChatColor.RED + msg.substring(0, finalI), null, 2, 5, 2);
									player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_BANJO, 1, 0);
								}, 6L * i);
							} */

						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsu", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 0);
						}, 5L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsuno", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 1);
						}, 10L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsunoma", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 2);
						}, 15L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Tsunomaki", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 1);
						}, 20L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Jan", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 0);
						}, 25L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Janken", null, 2, 5, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 1);
						}, 30L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + "Jankenpon!", null, 2, 8, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1, 2);
						}, 35L);
						Bukkit.getScheduler().scheduleSyncDelayedTask(sbItems.instance, () -> {
							player.sendTitle(ChatColor.RED + result, null, 2, 40, 2);
							player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_PLING, 1, 2);
							switch (result) {
								case "Paper!":
									player.sendMessage("You lost!");
									player.playSound(loc, Sound.BLOCK_WOOL_STEP, 2, 0);
									break;
								case "Shears!":
									player.sendMessage("You won!");
									player.playSound(loc, Sound.EVENT_RAID_HORN, 100, 2);
									break;
								case "Stone!":
									player.sendMessage("You tied!");
									player.playSound(loc, Sound.BLOCK_WOOL_STEP, 2, 0);
									break;
							}
						}, 45L);
					}
				}

	}
}
