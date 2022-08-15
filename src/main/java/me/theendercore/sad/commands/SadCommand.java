package me.theendercore.sad.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class SadCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage("It ran");
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command !");
            return false;
        }
        Player p = (Player) sender;
        if (!p.hasPermission("sad.kit.command")){
            p.sendMessage(ChatColor.RED + "You don't have the perms");
            return false;
        }

        p.sendMessage("yay u have perms");

        return true;
    }
}
