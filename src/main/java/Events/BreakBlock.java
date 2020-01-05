package Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakBlock implements Listener {
    @EventHandler
    public void breakBlock (BlockBreakEvent e){
        e.setCancelled(true);
    }
}
