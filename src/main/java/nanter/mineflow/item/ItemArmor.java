package nanter.mineflow.item;


import nanter.mineflow.MineFlow;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemArmor extends net.minecraft.item.ItemArmor{
    private String name;

    public ItemArmor(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, 3, equipmentSlotIn);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        GameRegistry.register(this);
    }

    public void registerModel(){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(MineFlow.MOD_ID + ":" + this.name, "inventory");
        ModelLoader.setCustomModelResourceLocation(this, 0, modelResourceLocation);
    }

    @Override
    public ItemArmor setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
