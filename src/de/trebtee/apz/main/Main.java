package de.trebtee.apz.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new PiglinListener(), (Plugin) this);
	}
}