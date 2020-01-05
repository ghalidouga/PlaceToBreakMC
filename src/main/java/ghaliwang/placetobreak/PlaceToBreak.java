package ghaliwang.placetobreak;

import Events.BreakBlock;
import Events.PlaceBlock;
import org.bukkit.plugin.java.JavaPlugin;


public final class PlaceToBreak extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BreakBlock(),this);
        getServer().getPluginManager().registerEvents(new PlaceBlock(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
