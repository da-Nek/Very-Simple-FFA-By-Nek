package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class ScoreBoardRefreshTask extends BukkitRunnable {

    SB autoScoreboard = new SB();

    FFAByNe plugin;


    public ScoreBoardRefreshTask(FFAByNe plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(player -> autoScoreboard.createScoreboard(player));
    }
}