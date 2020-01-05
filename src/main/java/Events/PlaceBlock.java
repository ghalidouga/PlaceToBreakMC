package Events;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlaceBlock implements Listener {
    @EventHandler
    public void placeBlock (BlockPlaceEvent e){
        Block blockAgainst = e.getBlockAgainst();
        blockAgainst.breakNaturally();
    }
}
