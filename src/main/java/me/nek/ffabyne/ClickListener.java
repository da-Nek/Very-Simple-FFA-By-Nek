package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickListener implements Listener {
    Kits beast = new Kits();

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getClickedInventory().getSize() == 9) {
            try {

                switch (e.getCurrentItem().getType()) {
                    case COBBLESTONE:
                        p.closeInventory();
                        Location loc1 = new Location(Bukkit.getWorld("world"), 0, 30, 0, 0, 0);
                        p.teleport(loc1);
                        beast.giveItems(p);
                        break;
                    case WHITE_WOOL:
                        p.closeInventory();
                        Location loc2 = new Location(Bukkit.getWorld("world"), -156, 31, -17, 0, 0);
                        p.teleport(loc2);
                        beast.giveItems(p);
                        break;
                    case BARRIER:
                        p.closeInventory();
                        Location loc3 = new Location(Bukkit.getWorld("world"), 97, 32, -136, 0, 0);
                        p.teleport(loc3);
                        beast.giveItems(p);
                        break;

                }


                e.setCancelled(true);
            } catch (Exception exception) {
                p.sendMessage("chujsko");
            }


        }
    }


}