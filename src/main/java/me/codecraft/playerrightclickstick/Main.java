package me.codecraft.playerrightclickstick;

import me.codecraft.playerrightclickstick.events.PlayerRightClickStick;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("PlayerRightClickStick loaded");
        new PlayerRightClickStick(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
