package net.skyprison.skyprisoncore.commands;

import net.kyori.adventure.text.Component;
import net.skyprison.skyprisoncore.SkyPrisonCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.FurnaceInventory;
import org.jetbrains.annotations.NotNull;

public class VirtualFurnace implements CommandExecutor {
    private final SkyPrisonCore plugin;

    public VirtualFurnace(SkyPrisonCore plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
        if(sender instanceof Player player) {
            FurnaceInventory inv = (FurnaceInventory) Bukkit.createInventory(null, InventoryType.FURNACE, Component.text(ChatColor.RED + "Furnace Test"));
            player.openInventory(inv);
        }
        return true;
    }
}
