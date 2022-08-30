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
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getServer().getPluginManager().registerEvents(new AntiHunger(), this);
        getServer().getPluginManager().registerEvents(new AntiDick(), this);
        getCommand("createGUI").setExecutor(new GUI());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("stats").setExecutor(new StatsCommand());
        getCommand("creatememegui").setExecutor(new MemeGUI());
        getCommand("dc").setExecutor(new DiscordCommand());
        BukkitTask refresh = new ScoreBoardRefreshTask(this).runTaskTimer(this,0L, 85L);
        BukkitTask refresh2 = new DiscordRefreshTask(this).runTaskTimer(this,0L, 6000L);
        BukkitTask refresh3 = new ReportRefreshTask(this).runTaskTimer(this,0L, 1000L);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
