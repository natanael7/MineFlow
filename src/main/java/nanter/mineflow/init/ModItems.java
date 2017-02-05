package nanter.mineflow.init;


import nanter.mineflow.item.*;
import nanter.mineflow.item.properties.ArmorMaterial;
import nanter.mineflow.item.properties.ToolMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ModItems {

    //ITEMS
    public static final ItemIngot   COPPER_INGOT        = new ItemIngot("copper_ingot").setCreativeTab(ModCreativeTabs.MAIN).registerOreDict("ingotCopper");
    public static final ItemAxe     COPPER_AXE          = new ItemAxe("copper_axe", ToolMaterial.COPPER).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemHoe     COPPER_HOE          = new ItemHoe("copper_hoe", ToolMaterial.COPPER).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemPickaxe COPPER_PICKAXE      = new ItemPickaxe("copper_pickaxe", ToolMaterial.COPPER).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemShovel  COPPER_SHOVEL       = new ItemShovel("copper_shovel", ToolMaterial.COPPER).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemSword   COPPER_SWORD        = new ItemSword("copper_sword", ToolMaterial.COPPER).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   COPPER_HELMET       = new ItemArmor("copper_helmet", ArmorMaterial.COPPER, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   COPPER_CHESTPLATE   = new ItemArmor("copper_chestplate", ArmorMaterial.COPPER, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   COPPER_LEGGINGS     = new ItemArmor("copper_leggings", ArmorMaterial.COPPER, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   COPPER_BOOTS        = new ItemArmor("copper_boots", ArmorMaterial.COPPER, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemAxe     EMERALD_AXE         = new ItemAxe("emerald_axe", ToolMaterial.EMERALD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemHoe     EMERALD_HOE         = new ItemHoe("emerald_hoe", ToolMaterial.EMERALD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemPickaxe EMERALD_PICKAXE     = new ItemPickaxe("emerald_pickaxe", ToolMaterial.EMERALD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemShovel  EMERALD_SHOVEL      = new ItemShovel("emerald_shovel", ToolMaterial.EMERALD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemSword   EMERALD_SWORD       = new ItemSword("emerald_sword", ToolMaterial.EMERALD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   EMERALD_HELMET      = new ItemArmor("emerald_helmet", ArmorMaterial.EMERALD, EntityEquipmentSlot.HEAD).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   EMERALD_CHESTPLATE  = new ItemArmor("emerald_chestplate", ArmorMaterial.EMERALD, EntityEquipmentSlot.CHEST).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   EMERALD_LEGGINGS    = new ItemArmor("emerald_leggings", ArmorMaterial.EMERALD, EntityEquipmentSlot.LEGS).setCreativeTab(ModCreativeTabs.MAIN);
    public static final ItemArmor   EMERALD_BOOTS       = new ItemArmor("emerald_boots", ArmorMaterial.EMERALD, EntityEquipmentSlot.FEET).setCreativeTab(ModCreativeTabs.MAIN);


    public static void init(){

    }

    public static void registerModels(){
        COPPER_INGOT.registerModel();
        COPPER_AXE.registerModel();
        COPPER_HOE.registerModel();
        COPPER_PICKAXE.registerModel();
        COPPER_SHOVEL.registerModel();
        COPPER_SWORD.registerModel();
        COPPER_HELMET.registerModel();
        COPPER_CHESTPLATE.registerModel();
        COPPER_LEGGINGS.registerModel();
        COPPER_BOOTS.registerModel();
        EMERALD_AXE.registerModel();
        EMERALD_HOE.registerModel();
        EMERALD_PICKAXE.registerModel();
        EMERALD_SHOVEL.registerModel();
        EMERALD_SWORD.registerModel();
        EMERALD_HELMET.registerModel();
        EMERALD_CHESTPLATE.registerModel();
        EMERALD_LEGGINGS.registerModel();
        EMERALD_BOOTS.registerModel();
    }

}
