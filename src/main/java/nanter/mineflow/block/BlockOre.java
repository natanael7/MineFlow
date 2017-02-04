package nanter.mineflow.block;


import nanter.mineflow.MineFlow;
import nanter.mineflow.oredict.OreDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class BlockOre extends Block implements OreDict {
    private String name;
    private String oreName;
    private ItemBlock itemBlock;

    public BlockOre(String name) {
        super(Material.ROCK);

        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        GameRegistry.register(this);

        itemBlock = new ItemBlock(this);
        itemBlock.setRegistryName(name);
        GameRegistry.register(itemBlock);

        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 1); //Stone level
    }

    public void registerModel(){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(MineFlow.MOD_ID + ":" + this.name, "inventory");
        ModelLoader.setCustomModelResourceLocation(this.itemBlock, 0, modelResourceLocation);
    }

    public ItemBlock getItemBlock(){
        return this.itemBlock;
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public BlockOre registerOreDict(String oreName) {
        this.oreName = oreName;
        OreDictionary.registerOre(oreName, this);
        OreDictionary.registerOre(oreName, this.itemBlock);
        return this;
    }

    @Override
    public String getOreName() {
        return this.oreName;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        tooltip.add("Smelt to yield a Cooper Ingot");
    }

    @Override
    public BlockOre setHardness(float hardness) {
        super.setHardness(hardness);
        return this;
    }

    @Override
    public BlockOre setResistance(float resistance) {
        super.setResistance(resistance);
        return this;
    }

}
