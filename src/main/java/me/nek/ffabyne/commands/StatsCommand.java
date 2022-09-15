package me.nek.ffabyne.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StatsCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        try{
            if (args.length == 1) {
                String targetName = args[0];
                Player target = Bukkit.getPlayer(targetName);
                p.sendMessage(ChatColor.GREEN + "Zabójstwa: " + target.getStatistic(Statistic.PLAYER_KILLS) + " Śmierci: " + target.getStatistic(Statistic.DEATHS));
            } else {
                p.sendMessage("wybierz gracza");
            }
            return false;
        }catch (Exception e){
            System.out.println("ciapciok ma ultra giga srake i musze robić catch blocki pozdro");

        }
        return false;
    }
}


