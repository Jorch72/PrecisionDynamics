package lordfokas.precisiondynamics;

import net.minecraft.item.Item;
import net.minecraft.world.World;

public class ProxyDedicatedServer implements IProxy {
    @Override public void registerItemRenderer(Item item, int meta, String id, String submodel){}
    @Override public void registerTESRs(){}
    @Override public void schedule(Runnable runnable) { throw new RuntimeException("Not Yet Implemented!"); }
    @Override public World getClientWorld() { throw new RuntimeException("Cannot get Client World from the Server side!"); }
}
