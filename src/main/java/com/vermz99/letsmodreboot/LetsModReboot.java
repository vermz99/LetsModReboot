// This file is used to load the mod into minecraft

package com.vermz99.letsmodreboot;

import com.vermz99.letsmodreboot.configuration.ConfigurationHandler;
import com.vermz99.letsmodreboot.proxy.IProxy;
import com.vermz99.letsmodreboot.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance; // This object can be used in the code knowing no one as tempered with it

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) // initialise blocks and items
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) // initialise GUI, tile entities, recipes
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) // things to run after other mods init
    {

    }
}
