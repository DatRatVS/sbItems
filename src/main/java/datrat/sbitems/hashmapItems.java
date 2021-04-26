package datrat.sbitems;

import datrat.sbitems.itemabilities.cheattoggler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashmapItems {

	public static Map<String, ItemStack> items = new HashMap<>();

	public ItemStack cheatTogglerFinished = items.put("cheattoggler", cheatToggler());

	public ItemStack cheatToggler() {
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
		metacheatToggler.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		metacheatToggler.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attackDamage", 99999, AttributeModifier.Operation.ADD_NUMBER));
		metacheatToggler.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		metacheatToggler.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		metacheatToggler.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		cheatToggler.setItemMeta(metacheatToggler);

		return cheatToggler;
	}

}