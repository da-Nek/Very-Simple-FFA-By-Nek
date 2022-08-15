package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.*;

public class SB implements Listener {
    @EventHandler
    public void onJn(PlayerJoinEvent event) {
        createScoreboard(event.getPlayer());

    }
    //Creates a scoreboard on death
    Plugin plugin = FFAByNe.getPlugin(FFAByNe.class);


    public void createScoreboard(Player p) {

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = (Scoreboard) manager.getNewScoreboard();


        Objective objective = scoreboard.registerNewObjective("vors", "vors", ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + plugin.getConfig().getString("ScoreboardName"));

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        Score score = objective.getScore(ChatColor.GOLD + "--=-=-=-/\\-=-=-=--");
        score.setScore(11);
        Score s2 = objective.getScore("  ");
        s2.setScore(10);
        Score kills = objective.getScore(ChatColor.DARK_GREEN + "Kills: " + ChatColor.WHITE + p.getStatistic(Statistic.PLAYER_KILLS));
        kills.setScore(7);
        Score brejk = objective.getScore("      ");
        brejk.setScore(6);
        Score deaths = objective.getScore(ChatColor.DARK_GREEN + "Deaths: " + ChatColor.WHITE + p.getStatistic(Statistic.DEATHS));
        deaths.setScore(5);
        Score brejk2 = objective.getScore("      ");
        brejk2.setScore(4);
        Score onlinep2 = objective.getScore(ChatColor.DARK_GREEN + "K/D: " + ChatColor.WHITE + Math.round((Double.valueOf(p.getStatistic(Statistic.PLAYER_KILLS)) / Double.valueOf(p.getStatistic(Statistic.DEATHS)))* 100.0) / 100.0);
        onlinep2.setScore(3);
        Score s232 = objective.getScore(" ");
        s232.setScore(2);
        Score scooore = objective.getScore(ChatColor.GOLD + "--=-=-=-\\/-=-=-=--");
        scooore.setScore(1);
        Score chujsko = objective.getScore(ChatColor.DARK_GREEN + ChatColor.BOLD.toString() + plugin.getConfig().getString("ScoreboardIp"));
        chujsko.setScore(0);



        p.setScoreboard(scoreboard);

    }


}
