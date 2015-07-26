package me.bluemonster.elgems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import me.bluemonster.elgems.registry.RegisterItems;

/**
 * @author bluemonster122 <boo122333@gmail.com>
 */

@Mod(modid = ElementalGems.MODID, name = ElementalGems.MODNAME, version = ElementalGems.VERSION)
public class ElementalGems
{
    public static final String MODID = "elgems";
    public static final String MODNAME = "Elemental Gems";
    public static final boolean ALPHA = true, BETA = false;
    public static final String VERSION = (ALPHA ? "A-" : BETA ? "B-" : "RC") + "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        RegisterItems.init();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }

}