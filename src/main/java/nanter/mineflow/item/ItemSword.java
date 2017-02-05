package nanter.mineflow.item;


import nanter.mineflow.MineFlow;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSword extends net.minecraft.item.ItemSword {
    private String name;

    public ItemSword(String name, ToolMaterial material) {
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
    public ItemSword setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
