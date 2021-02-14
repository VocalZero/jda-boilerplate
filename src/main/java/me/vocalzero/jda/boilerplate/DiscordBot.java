package me.vocalzero.jda.boilerplate;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.LoginException;
import me.vocalzero.jda.boilerplate.handlers.EventHandler;
import me.vocalzero.jda.boilerplate.managers.LoggerManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.utils.ChunkingFilter;

/**
 *
 * @author Kacper Mura
 */
public class DiscordBot {
    
    private JDA jda;
    
    private LoggerManager loggerManager;
    
    public static void main(String[] args) {
        new DiscordBot().init();
    }
    
    private void init() {
        this.loggerManager = new LoggerManager();
        
        JDABuilder builder = JDABuilder.createLight("");
        builder.setChunkingFilter(ChunkingFilter.NONE);
        builder.setBulkDeleteSplittingEnabled(true);
        builder.setLargeThreshold(50);
        builder.addEventListeners(new EventHandler(this));
        try {
            this.jda = builder.build();
        } catch (LoginException ex) {
            Logger.getLogger(DiscordBot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JDA getJda() {
        return jda;
    }
    
    public void consoleInfo(String text) {
        this.loggerManager.sendInfo(text);
    }

    public void consoleWarning(String text) {
        this.loggerManager.sendWarning(text);
    }

    public void consoleError(String text) {
        this.loggerManager.sendError(text);
    }
    
}
