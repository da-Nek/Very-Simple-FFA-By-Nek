package me.nek.ffabyne;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class AntiHunger implements Listener {

    @EventHandler
    public void on(FoodLevelChangeEvent event){
        event.setCancelled(true);
    }

}
