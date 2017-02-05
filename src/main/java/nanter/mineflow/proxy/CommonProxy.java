package nanter.mineflow.proxy;


import nanter.mineflow.init.ModBlocks;
import nanter.mineflow.init.ModItems;
import nanter.mineflow.init.ModRecipes;
import nanter.mineflow.world.gen.ModWorldGen;

public class CommonProxy {

    public void preInit(){
        ModItems.init();
        ModBlocks.init();

    }

    public void init(){
        ModRecipes.init();
        ModWorldGen.init();
    }

    public void postInit(){

    }

}
