package nanter.mineflow.init;


import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModRecipes {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.EMERALD_PICKAXE), "EEE", " S ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.COPPER_PICKAXE), "CCC", " S ", " S ", 'C', ModItems.COPPER_INGOT.getOreName(), 'S', Items.STICK));
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 0.7F);
    }
}
