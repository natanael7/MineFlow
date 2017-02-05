package nanter.mineflow.item.properties;


import nanter.mineflow.MineFlow;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterial {

    /*
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    */

    public static final ItemArmor.ArmorMaterial EMERALD = EnumHelper.addArmorMaterial("EMERALD", (MineFlow.MOD_ID + ":emerald"), 47, new int[]{3, 6, 8, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.0F);
    public static final ItemArmor.ArmorMaterial COPPER = EnumHelper.addArmorMaterial("COPPER", (MineFlow.MOD_ID + ":copper"), 19, new int[]{1, 4, 5, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    /*
    public static int getEquipamentRenderIndex(EntityEquipmentSlot equipmentSlot){
        if(equipmentSlot == EntityEquipmentSlot.HEAD) return 1;
        if(equipmentSlot == EntityEquipmentSlot.CHEST) return 1;
        if(equipmentSlot == EntityEquipmentSlot.LEGS) return 2;
        if(equipmentSlot == EntityEquipmentSlot.FEET) return 1;
        return 0;
    }
    */
}
