package datrat.sbitems.items;

import datrat.sbitems.hashmapItems;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class aspectofthestars {

	static {
		ItemStack sots = new ItemStack(Material.GOLDEN_SWORD);
		ItemMeta metasots = sots.getItemMeta();

		assert metasots != null;
		metasots.setDisplayName(ChatColor.RED + "" + "Sword of the Stars");
		List<String> loresots = new ArrayList<String>();
		loresots.add(ChatColor.GRAY + "" + "Damage:" + ChatColor.RED + "" + " +99,999");
		loresots.add("");
		loresots.add(ChatColor.BLUE + "" + "Sharpness X");
		loresots.add(ChatColor.GRAY + "" + "Increases the damage dealt by");
		loresots.add(ChatColor.GREEN + "" + "50%");
		loresots.add("");
		loresots.add(ChatColor.LIGHT_PURPLE + "" + "\"Only those with the power to");
		loresots.add(ChatColor.LIGHT_PURPLE + "" + "create this world can wield this");
		loresots.add(ChatColor.LIGHT_PURPLE + "" + "blade.\"");
		loresots.add("");
		loresots.add(ChatColor.DARK_GRAY + "" + "This item can be reforged!");
		loresots.add(ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL SWORD");
		metasots.setLore(loresots);

		metasots.setUnbreakable(true);
		metasots.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		metasots.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 99999, AttributeModifier.Operation.ADD_NUMBER));
		metasots.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		metasots.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		metasots.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		sots.setItemMeta(metasots);

		hashmapItems.items.put("sots", sots);
	}

	public ItemStack sotsFinished = hashmapItems.items.put("sots", sots());

	public ItemStack sots() {
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
}
