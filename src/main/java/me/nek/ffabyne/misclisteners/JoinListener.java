package me.nek.ffabyne.misclisteners;

import me.nek.ffabyne.FFAByNe;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class JoinListener implements Listener {
    Plugin plugin = FFAByNe.getPlugin(FFAByNe.class);
    Location loc1 = new Location(Bukkit.getWorld("world"), plugin.getConfig().getInt("SpawnX"),
            plugin.getConfig().getInt("SpawnY"), plugin.getConfig().getInt("SpawnZ"), -180, 0);

    @EventHandler
    public void on(PlayerJoinEvent event){
        Player p = event.getPlayer();
        p.getInventory().clear();
        p.teleport(loc1);



    }


}
