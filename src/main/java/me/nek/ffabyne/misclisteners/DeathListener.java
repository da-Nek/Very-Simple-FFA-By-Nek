package me.nek.ffabyne.misclisteners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.text.DecimalFormat;

public class DeathListener implements Listener {

  //  public void on(PlayerDeathEvent event){
    //    try {
      //      Player p = event.getEntity().getPlayer();
        //    Player k = p.getKiller();
          //  event.setDeathMessage(ChatColor.AQUA + p.getDisplayName() + ChatColor.GRAY + " was destroyed by " + ChatColor.AQUA + k.getDisplayName() + ChatColor.GRAY + " on ❤️" + ChatColor.RED + k.getHealth());
           // p.getInventory().clear();
           // p.sendTitle("GG", "❤️" + ChatColor.RED + k.getHealth(), 5, 20, 10);
          //  k.setHealth(20);
           // k.setSaturation(5);
       // }catch (Exception e){
     //       Bukkit.broadcastMessage("Chujsko!");
      //  }

   // }

    DecimalFormat df = new DecimalFormat("#.##");
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {

        if ((event.getEntity() instanceof Player)) {
            Player player = event.getEntity();
            Player killer = player.getKiller();
            player.getInventory().clear();
            player.sendTitle("GG", ChatColor.RED + "❤ " + df.format(killer.getHealth()), 5, 20, 10);
            event.setDeathMessage(ChatColor.AQUA + player.getDisplayName() + ChatColor.GRAY + " został zabity przez " + ChatColor.AQUA + killer.getDisplayName() + ChatColor.RED + " ❤ " + df.format(killer.getHealth()));
            killer.setHealth(20);
            killer.setSaturation(5);
        }

    }



}
