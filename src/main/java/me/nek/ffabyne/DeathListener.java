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



    public void on(PlayerDeathEvent event){
        Player p = event.getEntity().getPlayer();
        Player k = event.getEntity().getKiller().getPlayer();

            int rand = (int)(Math.random() * range) + min;
            if (rand == 0){
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " został zniszczony przez " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " na " +  ChatColor.RED +k.getHealth());
            } else if (rand == 1) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " straciły zęby przez " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " na " +  ChatColor.RED +k.getHealth());

            }
            else if (rand == 2) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " poszedł pod wodę dzięki " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " na " +  ChatColor.RED +k.getHealth());

            }
            else if (rand == 3) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " wyczyścił " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " na " +  ChatColor.RED +k.getHealth());

            }
            else if (rand == 4) {
                Bukkit.broadcastMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " umarł za pomocą gracza " + ChatColor.AQUA + k.getName() + ChatColor.GRAY  + " na " +  ChatColor.RED +k.getHealth());

            }




        k.setHealth(20);



    }



}
