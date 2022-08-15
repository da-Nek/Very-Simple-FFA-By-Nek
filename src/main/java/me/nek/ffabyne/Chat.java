package me.nek.ffabyne;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {

    @EventHandler
    public void onMessage(AsyncPlayerChatEvent event) {
        Player p = event.getPlayer();
        if (p.hasPermission("vorsutility.owner")) {
            event.setFormat(ChatColor.DARK_RED + "[Owner] " + ChatColor.GRAY + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.admin")) {
            event.setFormat(ChatColor.RED + "[Admin] " + ChatColor.RED + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.helper")) {
            event.setFormat(ChatColor.BLUE + "[Helper] " + ChatColor.DARK_BLUE + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.media")) {
            event.setFormat(ChatColor.DARK_BLUE + "[Media] " + ChatColor.BLUE + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.minimedia")) {
            event.setFormat(ChatColor.BLUE + "[MiniMedia] " + ChatColor.DARK_BLUE + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.vors")) {
            event.setFormat(ChatColor.DARK_GREEN + "[VORS] " + ChatColor.GREEN + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.mvpplus")) {
            event.setFormat(ChatColor.GOLD + "[MVP+] " + ChatColor.YELLOW + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.mvp")) {
            event.setFormat(ChatColor.YELLOW + "[MVP] " + ChatColor.GOLD + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.vipplus")) {
            event.setFormat(ChatColor.DARK_AQUA + "[VIP+] " + ChatColor.AQUA + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else if (p.hasPermission("vorsutility.vip")) {
            event.setFormat(ChatColor.GREEN + "[VIP] " + ChatColor.DARK_GREEN + p.getName() + ": " + ChatColor.GRAY + event.getMessage());
        } else {
            event.setFormat(ChatColor.GRAY + p.getName() + ": " + event.getMessage());
        }


    }
    }
