package me.nek.ffabyne;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class AntiDick implements Listener {
    @EventHandler
    public void on(PlayerItemDamageEvent e){
        e.setCancelled(true);
    }



}
