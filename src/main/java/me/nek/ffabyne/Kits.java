package me.nek.ffabyne;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Kits {
    public void giveItems(Player p){


        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta metaHelmet = helmet.getItemMeta();
        metaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
        metaHelmet.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        helmet.setItemMeta(metaHelmet);

        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta metaChest = chestplate.getItemMeta();
        metaChest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        metaChest.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        chestplate.setItemMeta(metaChest);

        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta metaLegs = leggings.getItemMeta();
        metaLegs.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,3,true);
        metaLegs.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        leggings.setItemMeta(metaLegs);

        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta metaBoots = boots.getItemMeta();
        metaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
        metaBoots.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        boots.setItemMeta(metaBoots);

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta metaSword = sword.getItemMeta();
        metaSword.addEnchant(Enchantment.DAMAGE_ALL,0,true);
        metaSword.setDisplayName(ChatColor.BLUE + "FFA SWORD");
        sword.setItemMeta(metaSword);


        p.getInventory().setBoots(boots);
        p.getInventory().setLeggings(leggings);
        p.getInventory().setChestplate(chestplate);
        p.getInventory().setHelmet(helmet);
        p.getInventory().setItem(0,sword);


    }
    public void giveSpeedItems(Player p){


        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta metaHelmet = helmet.getItemMeta();
        metaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
        metaHelmet.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        helmet.setItemMeta(metaHelmet);

        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta metaChest = chestplate.getItemMeta();
        metaChest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true);
        metaChest.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        chestplate.setItemMeta(metaChest);

        ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta metaLegs = leggings.getItemMeta();
        metaLegs.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,1,true);
        metaLegs.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        leggings.setItemMeta(metaLegs);

        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta metaBoots = boots.getItemMeta();
        metaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,2,true);
        metaBoots.setDisplayName(ChatColor.BLUE + "FFA BY NEK");
        boots.setItemMeta(metaBoots);

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta metaSword = sword.getItemMeta();
        metaSword.addEnchant(Enchantment.DAMAGE_ALL,0,true);
        metaSword.setDisplayName(ChatColor.BLUE + "FFA SWORD");
        sword.setItemMeta(metaSword);


        p.getInventory().setBoots(boots);
        p.getInventory().setLeggings(leggings);
        p.getInventory().setChestplate(chestplate);
        p.getInventory().setHelmet(helmet);
        p.getInventory().setItem(0,sword);


    }


}
