package me.nek.ffabyne;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class Kits {
    Plugin plugin = FFAByNe.getPlugin(FFAByNe.class);
    public void giveItems(Player p){


        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta metaHelmet = helmet.getItemMeta();
        metaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaHelmet.setDisplayName(ChatColor.BLUE + "VORS.PL");
        helmet.setItemMeta(metaHelmet);

        ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta metaChest = chestplate.getItemMeta();
        metaChest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaChest.setDisplayName(ChatColor.BLUE + "VORS.PL");
        chestplate.setItemMeta(metaChest);

        ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta metaLegs = leggings.getItemMeta();
        metaLegs.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaLegs.setDisplayName(ChatColor.BLUE + "VORS.PL");
        leggings.setItemMeta(metaLegs);

        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta metaBoots = boots.getItemMeta();
        metaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaBoots.setDisplayName(ChatColor.BLUE + "VORS.PL");
        boots.setItemMeta(metaBoots);

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta metaSword = sword.getItemMeta();
        metaSword.addEnchant(Enchantment.DURABILITY,plugin.getConfig().getInt("Unbreaking"),true);
        metaSword.setDisplayName(ChatColor.BLUE + "VORS.PL");
        sword.setItemMeta(metaSword);

        ItemStack swordWood = new ItemStack(Material.WOODEN_SWORD);
        ItemMeta metaSwordWood = swordWood.getItemMeta();
        metaSwordWood.addEnchant(Enchantment.DURABILITY,plugin.getConfig().getInt("Unbreaking"),true);
        metaSwordWood.setDisplayName(ChatColor.BLUE + "VORS.PL");
        sword.setItemMeta(metaSword);


        p.getInventory().setBoots(boots);
        p.getInventory().setLeggings(leggings);
        p.getInventory().setChestplate(chestplate);
        p.getInventory().setHelmet(helmet);
        p.getInventory().setItem(0,sword);
        p.getInventory().setItem(1,swordWood);


    }

    public void giveItemsMeme(Player p){


        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta metaHelmet = helmet.getItemMeta();
        metaHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaHelmet.setDisplayName(ChatColor.BLUE + "Meme");
        helmet.setItemMeta(metaHelmet);

        ItemStack chestplate = new ItemStack(Material.ELYTRA);
        ItemMeta metaChest = chestplate.getItemMeta();
        metaChest.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Unbreaking"),true);
        metaChest.setDisplayName(ChatColor.BLUE + "VORS.PL");
        chestplate.setItemMeta(metaChest);

        ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta metaLegs = leggings.getItemMeta();
        metaLegs.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaLegs.setDisplayName(ChatColor.BLUE + "VORS.PL");
        leggings.setItemMeta(metaLegs);

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta metaBoots = boots.getItemMeta();
        metaBoots.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL,plugin.getConfig().getInt("Protection"),true);
        metaBoots.setDisplayName(ChatColor.BLUE + "VORS.PL");
        boots.setItemMeta(metaBoots);

        ItemStack sword = new ItemStack(Material.IRON_SWORD);
        ItemMeta metaSword = sword.getItemMeta();
        metaSword.addEnchant(Enchantment.DURABILITY,plugin.getConfig().getInt("Unbreaking"),true);
        metaSword.setDisplayName(ChatColor.BLUE + "VORS.PL");
        sword.setItemMeta(metaSword);

        ItemStack swordWood = new ItemStack(Material.FIREWORK_ROCKET, 64);
        ItemMeta metaSwordWood = swordWood.getItemMeta();;
        metaSwordWood.setDisplayName(ChatColor.BLUE + "VORS.PL");
        sword.setItemMeta(metaSword);


        p.getInventory().setBoots(boots);
        p.getInventory().setLeggings(leggings);
        p.getInventory().setChestplate(chestplate);
        p.getInventory().setHelmet(helmet);
        p.getInventory().setItem(0,sword);
        p.getInventory().setItem(1,swordWood);


    }




}
