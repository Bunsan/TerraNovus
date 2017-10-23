package com.technode.terranovus.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class tnCreativeTabs extends CreativeTabs {

    public static CreativeTabs TerraNovusBuilding = new tnCreativeTabs("TerraNovusBuilding");
    public static CreativeTabs TerraNovusDecoration = new tnCreativeTabs("TerraNovusDecoration");
    public static CreativeTabs TerraNovusDevices = new tnCreativeTabs("TerraNovusDevices");
    public static CreativeTabs TerraNovusPottery = new tnCreativeTabs("TerraNovusPottery");
    public static CreativeTabs TerraNovusMisc = new tnCreativeTabs("TerraNovusMisc");
    public static CreativeTabs TerraNovusFoods = new tnCreativeTabs("TerraNovusFoods");
    public static CreativeTabs TerraNovusTools = new tnCreativeTabs("TerraNovusTools");
    public static CreativeTabs TerraNovusWeapons = new tnCreativeTabs("TerraNovusWeapons");
    public static CreativeTabs TerraNovusArmor = new tnCreativeTabs("TerraNovusArmor");
    public static CreativeTabs TerraNovusMaterials = new tnCreativeTabs("TerraNovusMaterials");

    private ItemStack isIcon;

    public tnCreativeTabs(String label) { super(label); }

    public void setTabIconItemStack(ItemStack is) { isIcon = is; }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() { return isIcon; }

}
