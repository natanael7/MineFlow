package nanter.mineflow.item;

import nanter.mineflow.MineFlow;
import nanter.mineflow.oredict.OreDict;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIngot extends Item implements OreDict{
    private String name;
    private String oreName;

    public ItemIngot(String name) {
        super();
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
    public ItemIngot setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public ItemIngot registerOreDict(String oreName) {
        this.oreName = oreName;
        OreDictionary.registerOre(oreName, this);
        return this;
    }

    @Override
    public String getOreName() {
        return this.oreName;
    }
}
