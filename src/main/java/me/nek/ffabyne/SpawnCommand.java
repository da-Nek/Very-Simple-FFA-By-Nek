package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class SpawnCommand implements CommandExecutor {
    Plugin plugin = FFAByNe.getPlugin(FFAByNe.class);
    Location loc1 = new Location(Bukkit.getWorld("world"),plugin.getConfig().getInt("SpawnX"), plugin.getConfig().getInt("SpawnY"), plugin.getConfig().getInt("SpawnZ"), 180, 0);


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        p.getInventory().clear();
        p.setHealth(20);
        p.setSaturation(5);
        p.teleport(loc1);


        return false;
    }
}
