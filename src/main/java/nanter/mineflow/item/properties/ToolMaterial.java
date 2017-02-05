package nanter.mineflow.item.properties;


import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.security.InvalidParameterException;

public class ToolMaterial {

    //-- vanilla defaults
    /*
    WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);
    */

    public static final Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", HarvestLevel.DIAMOND, 2515, 6.0F, 4.0F, 16);
    public static final Item.ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", HarvestLevel.IRON, 340, 5.0F, 2.0F, 18);



    public static float getAttackSpeedForAxe(Item.ToolMaterial toolMaterial) {
        //custom's
        if (toolMaterial == ToolMaterial.EMERALD) return -2.9F;
        if (toolMaterial == ToolMaterial.COPPER)return -3.1F;
        //vanilla's
        if (toolMaterial == Item.ToolMaterial.WOOD) return -3.2F;
        if (toolMaterial == Item.ToolMaterial.STONE) return -3.2F;
        if (toolMaterial == Item.ToolMaterial.IRON) return -3.1F;
        if (toolMaterial == Item.ToolMaterial.DIAMOND) return -3.0F;
        if (toolMaterial == Item.ToolMaterial.GOLD) return -3.0F;
        //default
        throw new InvalidParameterException("Not found 'attackSpeed' for the specified 'toolMaterial'");
    }

    public static float getAttackDamageForAxe(Item.ToolMaterial toolMaterial) {
        //custom's
        if (toolMaterial == ToolMaterial.EMERALD) return 9.0F;
        if (toolMaterial == ToolMaterial.COPPER)return 8.0F;
        //vanilla's
        if (toolMaterial == Item.ToolMaterial.WOOD) return 6.0F;
        if (toolMaterial == Item.ToolMaterial.STONE) return 8.0F;
        if (toolMaterial == Item.ToolMaterial.IRON) return 8.0F;
        if (toolMaterial == Item.ToolMaterial.DIAMOND) return 8.0F;
        if (toolMaterial == Item.ToolMaterial.GOLD) return 6.0F;
        //default
        throw new InvalidParameterException("Not found 'attackDamage' for the specified 'toolMaterial'");
    }
}
