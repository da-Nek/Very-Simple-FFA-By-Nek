package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;

public class ClickListener implements Listener {
    Plugin plugin = FFAByNe.getPlugin(FFAByNe.class);
    Kits beast = new Kits();

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getSize() == 9) {
            try {

                switch (e.getCurrentItem().getType()) {
                    case COBBLESTONE:
                        p.closeInventory();
                        Location loc1 = new Location(Bukkit.getWorld("world"), plugin.getConfig().getInt("Location1X"),
                                plugin.getConfig().getInt("Location1Y"), plugin.getConfig().getInt("Location1Z"), 0, 0);
                        p.teleport(loc1);
                        break;
                    case WHITE_WOOL:
                        p.closeInventory();
                        Location loc2 = new Location(Bukkit.getWorld("world"), plugin.getConfig().getInt("Location2X"),
                                plugin.getConfig().getInt("Location2Y"), plugin.getConfig().getInt("Location2Z"), 0, 0);
                        p.teleport(loc2);
                        break;
                    case BARRIER:
                        p.closeInventory();
                        Location loc3 = new Location(Bukkit.getWorld("world"), plugin.getConfig().getInt("Location3X"),
                                plugin.getConfig().getInt("Location3Y"), plugin.getConfig().getInt("Location3Z"), 0, 0);
                        p.teleport(loc3);
                        break;

                }
                p.setSaturation(5);
                e.setCancelled(true);
            } catch (Exception exception) {
                p.sendMessage("chujsko");
            }


        }
    }


}