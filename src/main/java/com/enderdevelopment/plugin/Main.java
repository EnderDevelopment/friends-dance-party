package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("FriendsPlugin has been enabled!");
        this.getCommand("friendswine").setExecutor(new FriendsWineCommand());
        this.getCommand("friendsdoll").setExecutor(new FriendsDollCommand());
        this.getCommand("friendsremote").setExecutor(new FriendsRemoteCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("FriendsPlugin has been disabled!");
    }
}