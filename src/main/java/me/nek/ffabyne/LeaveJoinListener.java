package me.nek.ffabyne;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
//todo

public class LeaveJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        player.playSound(e.getPlayer().getLocation(), Sound.BLOCK_BELL_USE, 1, 1.00F);
        if (!player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer pierwszy raz.");

        } else if (player.hasPermission("vorsutility.owner")) {
            e.setJoinMessage(ChatColor.DARK_RED + "[Owner] " + ChatColor.GRAY + player.getDisplayName() + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.vip")) {
            e.setJoinMessage(ChatColor.GREEN + "[VIP] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.vipplus")) {
            e.setJoinMessage(ChatColor.DARK_AQUA + "[VIP+] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.mvp")) {
            e.setJoinMessage(ChatColor.YELLOW + "[MVP] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.mvpplus")) {
            e.setJoinMessage(ChatColor.GOLD + "[MVP+] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.minimedia")) {
            e.setJoinMessage(ChatColor.BLUE + "[MiniMedia] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.admin")) {
            e.setJoinMessage(ChatColor.RED + "[Admin] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.helper")) {
            e.setJoinMessage(ChatColor.BLUE + "[Helper] " + ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.vors")) {
            e.setJoinMessage(ChatColor.DARK_GREEN + "[VORS] " + ChatColor.GREEN + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else if (player.hasPermission("vorsutility.media")) {
            e.setJoinMessage(ChatColor.DARK_BLUE + "[Media] " + ChatColor.BLUE + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");

        } else {
            e.setJoinMessage(ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " dołączył na serwer.");
        }
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.GRAY + player.getDisplayName() + ChatColor.DARK_GRAY + " wyszedł z serwera.");


    }



}
