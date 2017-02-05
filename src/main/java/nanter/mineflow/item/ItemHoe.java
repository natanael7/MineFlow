package nanter.mineflow.item;


import nanter.mineflow.MineFlow;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHoe extends net.minecraft.item.ItemHoe {
    private String name;

    public ItemHoe(String name, ToolMaterial material) {
        super(material);
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
    public ItemHoe setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
