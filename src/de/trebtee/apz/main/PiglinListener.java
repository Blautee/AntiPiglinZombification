package de.trebtee.apz.main;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.PiglinAbstract;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class PiglinListener implements Listener {
	
	@EventHandler
	public void pickUpEvent(EntityPickupItemEvent event) {
		if (event.getEntityType() == EntityType.PIGLIN) {
			if (event.getItem().getItemStack().getType() == Material.GOLDEN_APPLE) {
				PiglinAbstract piglin = (PiglinAbstract) event.getEntity();
				piglin.setImmuneToZombification(true);
				Bukkit.getLogger().log(Level.INFO, "[APZ] Piglin was feeded a golden apple at " + piglin.getLocation().getBlockX() + ", " + piglin.getLocation().getBlockY() + ", " + piglin.getLocation().getBlockZ() + "! Zombification disabled.");
			}
		}
	}
}
