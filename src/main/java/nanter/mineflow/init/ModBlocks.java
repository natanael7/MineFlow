package nanter.mineflow.init;


import nanter.mineflow.block.BlockOre;
import nanter.mineflow.item.properties.HarvestLevel;

public class ModBlocks {

    //BLOCKS
    public static final BlockOre COPPER_ORE = new BlockOre("copper_ore").setCreativeTab(ModCreativeTabs.MAIN).registerOreDict("oreCopper").setHarvestLevel(HarvestLevel.STONE);

    public static void init(){

    }

    public static void registerModels(){
        COPPER_ORE.registerModel();
    }
}
