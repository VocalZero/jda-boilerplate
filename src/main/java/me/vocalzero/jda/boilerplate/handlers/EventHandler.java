package me.vocalzero.jda.boilerplate.handlers;

import me.vocalzero.jda.boilerplate.DiscordBot;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 *
 * @author Kacper Mura
 */
public class EventHandler extends ListenerAdapter {
    
    private final DiscordBot discordBot;

    public EventHandler(DiscordBot discordBot) {
        this.discordBot = discordBot;
    }

    @Override
    public void onReady(ReadyEvent event) {

    }

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

    }
    
}
