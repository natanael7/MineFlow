package nanter.mineflow.init;


import nanter.mineflow.item.ItemIngot;
import nanter.mineflow.item.ItemPickaxe;
import nanter.mineflow.item.ToolMaterial;

public class ModItems {

    //ITEMS
    public static final ItemPickaxe EMERALD_PICKAXE = new ItemPickaxe("emerald_pickaxe", ToolMaterial.EMERALD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemPickaxe COPPER_PICKAXE = new ItemPickaxe("copper_pickaxe", ToolMaterial.COPPER).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemIngot COPPER_INGOT = new ItemIngot("copper_ingot").setCreativeTab(ModCreativeTabs.MAIN).registerOreDict("ingotCopper");


    public static void init(){

    }

    public static void registerModels(){
        EMERALD_PICKAXE.registerModel();
        COPPER_PICKAXE.registerModel();
        COPPER_INGOT.registerModel();
    }

}
