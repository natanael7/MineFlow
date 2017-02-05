package nanter.mineflow.item.properties;


import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ToolMaterial {

    public static final Item.ToolMaterial EMERALD;
    public static final Item.ToolMaterial COPPER;

    //-- vanilla defaults
    /*
    WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);
    */

    static {
        EMERALD = EnumHelper.addToolMaterial("EMERALD", HarvestLevel.DIAMOND, 2515, 6.0F, 4.0F, 16);
        COPPER = EnumHelper.addToolMaterial("COPPER", HarvestLevel.IRON, 340, 5.0F, 2.0F, 18);
    }
}
