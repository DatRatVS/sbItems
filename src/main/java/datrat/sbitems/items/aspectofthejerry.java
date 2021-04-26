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

public class aspectofthejerry {

	static {
		ItemStack aotj = new ItemStack(Material.WOODEN_SWORD);
		ItemMeta metaaotj = aotj.getItemMeta();

		assert aotj != null;
		metaaotj.setDisplayName(ChatColor.WHITE + "" + "Aspect of the Jerry");
		List<String> loreaotj = new ArrayList<String>();
		loreaotj.add(ChatColor.GRAY + "" + "Damage:" + ChatColor.RED + "" + " +1");
		loreaotj.add("");
		loreaotj.add(ChatColor.BLUE + "" + "Knockback XXXMMDCCLXVII");
		// ∞
		loreaotj.add(ChatColor.GRAY + "" + "Increases knockback by" + ChatColor.GREEN + "" + " ∞");
		loreaotj.add(ChatColor.GRAY + "" + "blocks.");
		loreaotj.add("");
		loreaotj.add(ChatColor.GOLD + "" + "Item ability: Parley" + ChatColor.YELLOW + "" + ChatColor.BOLD + " RIGHT CLICK");
		loreaotj.add(ChatColor.GRAY + "" + "Channel your inner Jerry.");
		loreaotj.add(ChatColor.DARK_GRAY + "" + "Cooldown:" + ChatColor.GREEN + "" + " 0s");
		loreaotj.add("");
		loreaotj.add(ChatColor.DARK_GRAY + "" + "This item can be reforged!");
		loreaotj.add(ChatColor.WHITE + "" + ChatColor.BOLD + "COMMON SWORD");
		metaaotj.setLore(loreaotj);

		metaaotj.setUnbreakable(true);
		metaaotj.addEnchant(Enchantment.KNOCKBACK, 32767, true);
		metaaotj.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 1, AttributeModifier.Operation.ADD_NUMBER));
		metaaotj.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		metaaotj.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		metaaotj.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		aotj.setItemMeta(metaaotj);

		// hashmapItems.items.put("aotj", aotj);
	}

	public ItemStack aotjFinished = hashmapItems.items.put("aotj", aotj());

	public ItemStack aotj() {
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
}
