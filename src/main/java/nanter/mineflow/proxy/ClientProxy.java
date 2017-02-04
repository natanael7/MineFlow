package nanter.mineflow.proxy;


import nanter.mineflow.init.ModBlocks;
import nanter.mineflow.init.ModItems;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();
        ModItems.registerModels();
        ModBlocks.registerModels();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
