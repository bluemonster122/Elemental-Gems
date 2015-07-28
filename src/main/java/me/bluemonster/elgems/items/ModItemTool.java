package me.bluemonster.elgems.items;

import me.bluemonster.elgems.registry.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * @author bluemonster122 <boo122333@gmail.com>
 */
public class ModItemTool extends ModItem
{
    public ToolMaterials theToolMaterial;

    public ModItemTool(String name, String type, ToolMaterials material)
    {
        super(name);
        theToolMaterial = material;
        setMaxDamage(type.equals(Names.Tools.HOE) ? (int) Math.floor(material.getMaxUses() / 100) : material.getMaxUses());
        setMaxStackSize(1);
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
    {
        return false;
    }
}
