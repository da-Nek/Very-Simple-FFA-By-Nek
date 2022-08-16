package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    public void on(PlayerDeathEvent event){
        Player p = event.getEntity().getPlayer();
        Player k = event.getEntity().getKiller();
        if (k instanceof Player) {
            event.setDeathMessage(ChatColor.AQUA + p.getName() + ChatColor.GRAY + " went underwater due to " + ChatColor.AQUA + k.getName() + ChatColor.GRAY + " ob " + ChatColor.RED + k.getHealth());
            p.getInventory().clear();
            p.sendTitle("GG, you died", "because " + k.getName() + " on " + k.getHealth(), 5, 20, 10);
            k.setHealth(20);
            k.setSaturation(5);


        }else{
            event.setDeathMessage(p.getName() + " umarł xDD");
        }
    }



}
