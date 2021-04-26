package datrat.sbitems;

import com.sun.tools.javac.jvm.Items;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import datrat.sbitems.sbGiveButSwitch;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class sbList implements CommandExecutor {

	private final sbGiveButSwitch itemclass = new sbGiveButSwitch();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("sblist")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("[DatRat's sbItems] - Consoles aren't able to use this command");
				return true;
			}
			Player player = (Player) sender;
			int inventorySize = 54;
			String inventoryName = "sbItems but DatRat made them:";
			Inventory inventory = Bukkit.createInventory(player, inventorySize, inventoryName);

			inventory.clear();
			inventory.addItem(itemclass.aotj());
			inventory.addItem(itemclass.cheatToggler());
			inventory.addItem(itemclass.sots());
			inventory.addItem(itemclass.boomstick());
			inventory.addItem(itemclass.integerLimit());
			inventory.addItem(itemclass.waypointer());
			inventory.addItem(itemclass.jankenponPedra());
			inventory.addItem(itemclass.jankenponPapel());
			inventory.addItem(itemclass.jankenponTesoura());

			player.openInventory(inventory);

			return true;
		}
		return false;
	}
	public ItemStack aotj () {
		ItemStack sword = new ItemStack(Material.WOODEN_SWORD);
		ItemMeta meta = sword.getItemMeta();

		assert meta != null;
		meta.setDisplayName(ChatColor.WHITE + "" + "Aspect of the Jerry");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "" + "Damage:" + ChatColor.RED + "" + " +1");
		lore.add("");
		lore.add(ChatColor.BLUE + "" + "Knockback ∞");
		lore.add(ChatColor.GRAY + "" + "Increases knockback by" + ChatColor.GREEN + "" + " ∞");
		lore.add(ChatColor.GRAY + "" + "blocks.");
		lore.add("");
		lore.add(ChatColor.GOLD + "" + "Item ability: Parley" + ChatColor.YELLOW + "" + ChatColor.BOLD + " RIGHT CLICK");
		lore.add(ChatColor.GRAY + "" + "Channel your inner Jerry.");
		lore.add(ChatColor.DARK_GRAY + "" + "Cooldown:" + ChatColor.GREEN + "" + " 0s");
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "" + "This item can be reforged!");
		lore.add(ChatColor.WHITE + "" + ChatColor.BOLD + "COMMON SWORD");
		meta.setLore(lore);

		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.KNOCKBACK, 32767, true);
		meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 1, AttributeModifier.Operation.ADD_NUMBER));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		sword.setItemMeta(meta);

		return sword;
	}
	public ItemStack cheatToggler () {

		ItemStack cheatToggler = new ItemStack(Material.SMOOTH_STONE);
		ItemMeta metacheatToggler = cheatToggler.getItemMeta();

		assert metacheatToggler != null;
		metacheatToggler.setDisplayName(ChatColor.LIGHT_PURPLE + "" + "Cheat Toggler");
		List<String> lorecheatToggler = new ArrayList<String>();
		lorecheatToggler.add("");
		lorecheatToggler.add(ChatColor.GOLD + "" + "Item ability: Toggle OP" + ChatColor.YELLOW + "" + ChatColor.BOLD + " RIGHT CLICK");
		lorecheatToggler.add(ChatColor.GRAY + "" + "Gives you all the power needed to have your own world.");
		lorecheatToggler.add("");
		lorecheatToggler.add(ChatColor.GOLD + "" + "Item ability: Toggle Gamemode" + ChatColor.YELLOW + "" + ChatColor.BOLD + " LEFT CLICK");
		lorecheatToggler.add(ChatColor.GRAY + "" + "Ah, immortality, easily achievable.");
		lorecheatToggler.add("");
		lorecheatToggler.add(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "MYTHIC ITEM");
		metacheatToggler.setLore(lorecheatToggler);

		metacheatToggler.setUnbreakable(true);
		metacheatToggler.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		metacheatToggler.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		metacheatToggler.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		cheatToggler.setItemMeta(metacheatToggler);

		return cheatToggler;
	}
	public ItemStack sots () {
		ItemStack sword = new ItemStack(Material.GOLDEN_SWORD);
		ItemMeta meta = sword.getItemMeta();

		assert meta != null;
		meta.setDisplayName(ChatColor.RED + "" + "Sword of the Stars");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "" + "Damage:" + ChatColor.RED + "" + " +99,999");
		lore.add("");
		lore.add(ChatColor.BLUE + "" + "Sharpness X");
		lore.add(ChatColor.GRAY + "" + "Increases the damage dealt by");
		lore.add(ChatColor.GREEN + "" + "50%");
		lore.add("");
		lore.add(ChatColor.LIGHT_PURPLE + "" + "\"Only those with the power to");
		lore.add(ChatColor.LIGHT_PURPLE + "" + "create this world can wield this");
		lore.add(ChatColor.LIGHT_PURPLE + "" + "blade.\"");
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "" + "This item can be reforged!");
		lore.add(ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL SWORD");
		meta.setLore(lore);

		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 99999, AttributeModifier.Operation.ADD_NUMBER));
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		sword.setItemMeta(meta);

		return sword;
	}
	public ItemStack boomstick () {
		ItemStack stick = new ItemStack(Material.STICK);
		ItemMeta meta = stick.getItemMeta();

		assert meta != null;
		meta.setDisplayName(ChatColor.GOLD + "" + "Boomstick");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "" + "Damage:" + ChatColor.RED + "" + " +???");
		lore.add("");
		lore.add(ChatColor.GOLD + "" + "Item ability: BOOM BOOM BOOM" + ChatColor.YELLOW + "" + ChatColor.BOLD + " RIGHT CLICK");
		lore.add(ChatColor.GRAY + "" + "Try and discover what this does.");
		lore.add(ChatColor.DARK_GRAY + "" + "Cooldown:" + ChatColor.GREEN + "" + " 0s");
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "" + "Red_acted's item");
		lore.add(ChatColor.GOLD + "" + ChatColor.BOLD + "LEGENDARY ITEM");
		meta.setLore(lore);

		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		stick.setItemMeta(meta);

		return stick;
	}
	public ItemStack integerLimit () {
		ItemStack stick = new ItemStack(Material.PUFFERFISH_BUCKET);
		ItemMeta meta = stick.getItemMeta();

		assert meta != null;
		meta.setDisplayName(ChatColor.DARK_GRAY + "" + "Integer Limit");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "" + "Damage:" + ChatColor.RED + "" + " +2.147.483.647");
		lore.add("");
		lore.add(ChatColor.BLUE + "" + "Sharpness 2147483647");
		lore.add(ChatColor.GRAY + "" + "Increases the damage dealt by");
		lore.add(ChatColor.GREEN + "" + "2147483647%");
		lore.add("");
		lore.add(ChatColor.GOLD + "" + "Item ability: Integer Limit" + ChatColor.YELLOW + "" + ChatColor.BOLD + " RIGHT CLICK");
		lore.add(ChatColor.GRAY + "" + "Shows you the integer limit.");
		lore.add(ChatColor.DARK_GRAY + "" + "Cooldown:" + ChatColor.GREEN + "" + " 0s");
		lore.add("");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + ChatColor.MAGIC + "l " + ChatColor.RESET + ChatColor.DARK_GRAY + ChatColor.BOLD + "LIMIT ITEM" + ChatColor.MAGIC + " l");
		meta.setLore(lore);

		meta.setUnbreakable(true);
		meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 2147483647, AttributeModifier.Operation.ADD_NUMBER));
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2147483647, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		stick.setItemMeta(meta);

		return stick;
	}
	public ItemStack waypointer () {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta meta = item.getItemMeta();

		assert meta != null;
		meta.setDisplayName(ChatColor.BLUE + "" + "Waypointer");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.GOLD + "" + "Item ability: Create" + ChatColor.YELLOW + "" + ChatColor.BOLD + " RIGHT CLICK");
		lore.add(ChatColor.GRAY + "" + "Creates your Waypoint.");
		lore.add("");
		lore.add(ChatColor.GOLD + "" + "Item ability: Teleport" + ChatColor.YELLOW + "" + ChatColor.BOLD + " LEFT CLICK");
		lore.add(ChatColor.GRAY + "" + "Teleports you to your Waypoint.");
		lore.add("");
		lore.add(ChatColor.BLUE + "" + ChatColor.BOLD + "RARE ITEM");
		meta.setLore(lore);

		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		item.setItemMeta(meta);

		return item;
	}
}