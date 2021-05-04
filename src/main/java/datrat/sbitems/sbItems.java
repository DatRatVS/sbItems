package datrat.sbitems;

import datrat.sbitems.itemabilities.*;
import datrat.sbitems.itemabilities.jankenpon.jankenponPapel;
import datrat.sbitems.itemabilities.jankenpon.jankenponPedra;
import datrat.sbitems.itemabilities.jankenpon.jankenponTesoura;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class sbItems extends JavaPlugin {

	public static sbItems instance;

	@Override
	public void onEnable() {

		instance = this;

		getLogger().info("Successfully loaded DatRat's sbItems!");

		Bukkit.getServer().getPluginManager().registerEvents(new aspectofthejerry(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new cheattoggler(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new boomstick(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new integerLimit(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new waypointer(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new jankenponPedra(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new jankenponPapel(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new jankenponTesoura(), this);

		getLogger().info("Item abilities should be working!");

		Objects.requireNonNull(this.getCommand("sbgivealt")).setExecutor(new sbGive());
		Objects.requireNonNull(this.getCommand("sbgive")).setExecutor(new sbGiveButSwitch());
		Objects.requireNonNull(this.getCommand("sbgivealt")).setTabCompleter(new sbGiveTabCompleter());
		Objects.requireNonNull(this.getCommand("sbgive")).setTabCompleter(new sbGiveTabCompleter());
		Objects.requireNonNull(this.getCommand("sblist")).setExecutor(new sbList());

		getLogger().info("/sbgive should be working!");
	}

	@Override
	public void onDisable() {
		getLogger().info("Successfully unloaded DatRat's sbItems.");
	}
	public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
		for (Listener listener : listeners) {
			Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
		}
	}
}
