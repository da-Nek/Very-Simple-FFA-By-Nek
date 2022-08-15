package me.nek.ffabyne;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public class GUI implements CommandExecutor {
    Plugin plugin = FFAByNe.getPlugin(FFAByNe.class);


    Inventory gui;
    public void createGUI(Player p){
        gui = Bukkit.createInventory(p, 9, ChatColor.AQUA + "FFA BY NEK");

        ItemStack center = new ItemStack(Material.COBBLESTONE);
        ItemMeta centerM = center.getItemMeta();
        centerM.setDisplayName(ChatColor.RED + plugin.getConfig().getString("Location1Name"));
        center.setItemMeta(centerM);

        ItemStack bunny = new ItemStack(Material.WHITE_WOOL);
        ItemMeta bunnyM = center.getItemMeta();
        bunnyM.setDisplayName(ChatColor.GRAY + plugin.getConfig().getString("Location2Name"));
        bunny.setItemMeta(bunnyM);

        ItemStack border = new ItemStack(Material.BARRIER);
        ItemMeta borderM = center.getItemMeta();
        borderM.setDisplayName(ChatColor.BLUE + plugin.getConfig().getString("Location3Name"));
        border.setItemMeta(borderM);

        ItemStack o = new ItemStack(Material.AIR);


        ItemStack[] menu_items = {o,o,o,bunny,center,border,o,o,o};
        gui.setContents(menu_items);

        p.openInventory(gui);

    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        createGUI(p);
        return false;
    }
}
