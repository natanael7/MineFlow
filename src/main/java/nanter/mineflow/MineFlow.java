package nanter.mineflow;

import nanter.mineflow.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MineFlow.MOD_ID, name = MineFlow.MOD_NAME, version = MineFlow.MOD_VERSION, acceptedMinecraftVersions = MineFlow.MOD_ACCEPTED_MINECRAFT_VERSIONS, dependencies = "required-after:Forge@[12.18.3.2185,)")
public class MineFlow {

    //Mod settings
    public static final String MOD_ID = "mineflow";
    public static final String MOD_NAME = "MineFlow";
    public static final String MOD_VERSION = "0.1-alpha";
    public static final String MOD_ACCEPTED_MINECRAFT_VERSIONS = "[1.10.2]";

    @SidedProxy(clientSide = "nanter.mineflow.proxy.ClientProxy", serverSide = "nanter.mineflow.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static MineFlow INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }





}
