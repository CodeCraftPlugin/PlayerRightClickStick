package me.codecraft.playerrightclickstick.events;

import me.codecraft.playerrightclickstick.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerRightClickStick implements Listener {

    private Main plugin;

    public PlayerRightClickStick(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }
    @EventHandler
    public static void playerintractwithstick(PlayerInteractEvent e){
        if (e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.STICK)){
            if(e.getAction().equals(Action.RIGHT_CLICK_AIR)||e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                Player p = e.getPlayer();
                p.sendMessage("You just interacted with a stick");
            }
        }
    }

}
