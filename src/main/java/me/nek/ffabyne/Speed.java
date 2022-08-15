package me.nek.ffabyne;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Speed {

    public void giveItems(Player p){

        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta metaHelmet = helmet.getItemMeta();
        metaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true);
        metaHelmet.setDisplayName(ChatColor.BLUE + "FFA HELMET");
        helmet.setItemMeta(metaHelmet);

        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta metaChest = helmet.getItemMeta();
        metaChest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        metaChest.setDisplayName(ChatColor.BLUE + "FFA CHESTPLATE");
        chestplate.setItemMeta(metaChest);

        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta metaLegs = helmet.getItemMeta();
        metaLegs.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
        metaLegs.setDisplayName(ChatColor.BLUE + "FFA LEGGINGS");
        leggings.setItemMeta(metaLegs);

        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta metaBoots = helmet.getItemMeta();
        metaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true);
        metaBoots.setDisplayName(ChatColor.BLUE + "FFA BOOTS");
        boots.setItemMeta(metaBoots);

        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta metaSword = helmet.getItemMeta();
        metaSword.addEnchant(Enchantment.DAMAGE_ALL,2,true);
        metaSword.setDisplayName(ChatColor.BLUE + "FFA SWORD");
        sword.setItemMeta(metaSword);


        p.getInventory().setBoots(boots);
        p.getInventory().setLeggings(leggings);
        p.getInventory().setChestplate(chestplate);
        p.getInventory().setHelmet(helmet);
        p.getInventory().setItem(0,sword);


    }



}
