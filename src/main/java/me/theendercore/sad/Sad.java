package me.theendercore.sad;

import me.theendercore.sad.commands.SadCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Sad extends JavaPlugin {

    public Logger LOGGER = getLogger();
    @Override
    public void onEnable() {
        LOGGER.info("S.A.D. Has been init()");
        getCommand("sad").setExecutor(new SadCommand());
    }

    @Override
    public void onDisable() {
    }
}
