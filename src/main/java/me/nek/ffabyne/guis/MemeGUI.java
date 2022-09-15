package me.nek.ffabyne.guis;

import me.nek.ffabyne.kits.Kits;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MemeGUI implements CommandExecutor {

    GUI gui = new GUI();
    Kits kits = new Kits();
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("ffabyne.meme")) {
                player.getInventory().clear();
                gui.createGUI(player);
                kits.giveItemsMeme(player);
                player.setSaturation(5);
            }
            else {
                player.sendMessage("Kup range na /dc aby użyć tego kitu");
            }
        }


        return false;
    }
}
