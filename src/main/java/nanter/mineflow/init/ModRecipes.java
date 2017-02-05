package nanter.mineflow.init;


import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
    public static void init(){
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 0.7F);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_AXE), "CC ", "CS ", " S ", 'C', ModItems.COPPER_INGOT.getOreDict(), 'S', Items.STICK));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_HOE), "CC ", " S ", " S ", 'C', ModItems.COPPER_INGOT.getOreDict(), 'S', Items.STICK));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_PICKAXE), "CCC", " S ", " S ", 'C', ModItems.COPPER_INGOT.getOreDict(), 'S', Items.STICK));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_SHOVEL), " C ", " S ", " S ", 'C', ModItems.COPPER_INGOT.getOreDict(), 'S', Items.STICK));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_SWORD), " C ", " C ", " S ", 'C', ModItems.COPPER_INGOT.getOreDict(), 'S', Items.STICK));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_HELMET), "CCC", "C C", 'C', ModItems.COPPER_INGOT.getOreDict()));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_CHESTPLATE), "C C", "CCC", "CCC", 'C', ModItems.COPPER_INGOT.getOreDict()));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_LEGGINGS), "CCC", "C C", "C C", 'C', ModItems.COPPER_INGOT.getOreDict()));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_BOOTS), "C C", "C C", 'C', ModItems.COPPER_INGOT.getOreDict()));

        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_AXE), "EE ", "ES ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_HOE), "EE ", " S ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_PICKAXE), "EEE", " S ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SHOVEL), " E ", " S ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_SWORD), " E ", " E ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_HELMET), "EEE", "E E", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_CHESTPLATE), "E E", "EEE", "EEE", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_LEGGINGS), "EEE", "E E", "E E", 'E', Items.EMERALD);
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_BOOTS), "E E", "E E", 'E', Items.EMERALD);

    }
}
