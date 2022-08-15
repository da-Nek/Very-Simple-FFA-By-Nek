package me.nek.ffabyne;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class FFAByNe extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new ClickListener(), this);
        getServer().getPluginManager().registerEvents(new ArmourstandCheck(), this);
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        getCommand("debug").setExecutor(new GUI());
        getCommand("spawn").setExecutor(new SpawnCommand());
        BukkitTask refresh = new ScoreBoardRefreshTask(this).runTaskTimer(this,0L, 85L);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
