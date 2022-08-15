package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    int max = 5;
    int min = 1;
    int range = max - min + 1;

    /*
     int rand = (int)(Math.random() * range) + min;
            if (rand == 0){
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " was destroyed by " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " on " +  ChatColor.RED +k.getHealth());
            } else if (rand == 1) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " lost his teeth because " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " on " +  ChatColor.RED +k.getHealth());

            }
            else if (rand == 2) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " went underwater due to " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " ob " +  ChatColor.RED +k.getHealth());

            }
            else if (rand == 3) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " was cleaned by " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " on " +  ChatColor.RED +k.getHealth());

            }
            else{
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " died thanks to " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " on " +  ChatColor.RED +k.getHealth());

            }

     */



    public void on(PlayerDeathEvent event){
        Player p = event.getEntity().getPlayer();
        Player k = event.getEntity().getKiller();
        event.setDeathMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " went underwater due to " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " ob " +  ChatColor.RED +k.getHealth());
        p.getInventory().clear();
        p.sendTitle("GG, you died", "because " + k.getName() + " on " + k.getHealth(), 5, 20, 10);
        k.setHealth(20);



    }



}
