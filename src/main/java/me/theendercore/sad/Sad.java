package me.theendercore.sad;

import me.theendercore.sad.commands.SadCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Item;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;

public final class Sad extends JavaPlugin {

    public static Map<String, Item> kits = new HashMap<>();

    @Override
    public void onEnable() {
        this.getConfig().addDefault("pp", 5);
        this.saveDefaultConfig();


        getCommand("sad").setExecutor(new SadCommand());

        getLogger().info("S.A.D. Has been ENABLED");
    }

    @Override
    public void onDisable() {
    }
}
