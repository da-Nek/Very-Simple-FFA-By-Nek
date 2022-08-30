package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scheduler.BukkitRunnable;

public class DiscordRefreshTask extends BukkitRunnable {

    SB autoScoreboard = new SB();

    FFAByNe plugin;


    public DiscordRefreshTask(FFAByNe plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "vors:" + ChatColor.GOLD + " dołączcie na naszego discorda /dc");
    }
}