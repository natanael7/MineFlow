package nanter.mineflow.proxy;


import nanter.mineflow.init.ModBlocks;
import nanter.mineflow.init.ModItems;
import nanter.mineflow.init.ModRecipes;

public class CommonProxy {

    public void preInit(){
        ModItems.init();
        ModBlocks.init();
    }

    public void init(){
        ModRecipes.init();
    }

    public void postInit(){

    }

}
