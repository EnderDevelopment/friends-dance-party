package com.enderdevelopment.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ArmorStand;
import org.bukkit.Location;

public class FriendsDollCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = player.getLocation();
            ArmorStand doll = (ArmorStand) loc.getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
            doll.setCustomName("Friends Doll");
            doll.setCustomNameVisible(true);
            doll.setGravity(false);
            player.sendMessage("Friends Doll has been placed!");
            return true;
        }
        return false;
    }
}