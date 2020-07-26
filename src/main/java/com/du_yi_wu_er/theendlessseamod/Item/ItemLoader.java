package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.Block.BlockLoader;
import com.du_yi_wu_er.theendlessseamod.Item.Processors.*;
import com.du_yi_wu_er.theendlessseamod.Item.Processors.Quartzs.*;
import com.du_yi_wu_er.theendlessseamod.Item.Tool.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    //Item 实例化
    // static Item (Item name) = new Item class("name");
    public static Item theendlessseaii = new Itemtheendlessseaii("theendlessseaii");
    public static Item storagefocus = new Itemstoragefocus("storagefocus");
    public static Item wandunbreakable_port = new Itemwandunbreakableport("wandunbreakable_port");
    public static Item wandunbreakable_stick = new Itemwandunbreakablestick("wandunbreakable_stick");
    public static Item false_sword = new Toolfalsesword("false_sword");
    public static Item false_axe = new Toolfalseaxe("false_axe");
    public static Item false_pickaxe = new Toolfalsepickaxe("false_pickaxe");
    public static Item false_shovel = new Toolfalseshovel("false_shovel");
    public static Item false_hoe = new Toolfalsehoe("false_hoe");
    public static Item quartz_processor_press = new ItemQuartzProcessorPress("quartz_processor_press");
    public static Item printed_quartz_processor = new ItemPrintedQuartzProcessor("printed_quartz_processor");
    public static Item redstone_printed_quartz_processor = new ItemRedstonePrintedQuartzProcessor("redstone_printed_quartz_processor");
    public static Item quartz_processor = new ItemQuartzProcessor("quartz_processor");
    public static Item redstone_printed_logic_processor = new ItemRedstonePrintedLogicProcessor("redstone_printed_logic_processor");
    public static Item redstone_printed_engineering_processor = new ItemRedstonePrintedEngineeringProcessor("redstone_printed_engineering_processor");
    public static Item redstone_printed_calculation_processor = new ItemRedstonePrintedCalculationProcessor("redstone_printed_calculation_processor");
    public static Item processor_binding = new ItemProcessorBinding("processor_binding");


    //block 物品方块注册
    public static void Blockitem(){
        //registeritemblock(BlockLoader.Block name);
        registeritemblock(BlockLoader.falsegrass);
    }

    public static void registeritemblock(Block block) {
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    public static void Itemitem() {
        //ForgeRegistries.ITEMS.register(Item name);
        ForgeRegistries.ITEMS.register(theendlessseaii);
        ForgeRegistries.ITEMS.register(storagefocus);
        ForgeRegistries.ITEMS.register(wandunbreakable_port);
        ForgeRegistries.ITEMS.register(wandunbreakable_stick);
        ForgeRegistries.ITEMS.register(false_sword);
        ForgeRegistries.ITEMS.register(false_axe);
        ForgeRegistries.ITEMS.register(false_pickaxe);
        ForgeRegistries.ITEMS.register(false_shovel);
        ForgeRegistries.ITEMS.register(false_hoe);
        ForgeRegistries.ITEMS.register(quartz_processor_press);
        ForgeRegistries.ITEMS.register(printed_quartz_processor);
        ForgeRegistries.ITEMS.register(redstone_printed_quartz_processor);
        ForgeRegistries.ITEMS.register(quartz_processor);
        ForgeRegistries.ITEMS.register(redstone_printed_logic_processor);
        ForgeRegistries.ITEMS.register(redstone_printed_engineering_processor);
        ForgeRegistries.ITEMS.register(redstone_printed_calculation_processor);
        ForgeRegistries.ITEMS.register(processor_binding);
    }

    //Block 物品材质加载
    @SideOnly(Side.CLIENT)
    public static void BlockitemregisterRenders() {
        //regsiterRender(Item.getItemFromBlock(BlockLoader.材质名);
        regsiterRender(Item.getItemFromBlock(BlockLoader.falsegrass));
    }

    //Item 物品材质加载
    @SideOnly(Side.CLIENT)
    public static void ItemitemregisterRenders() {
        //regsiterRender(物品材质名);
        regsiterRender(theendlessseaii);
        regsiterRender(storagefocus);
        regsiterRender(wandunbreakable_port);
        regsiterRender(wandunbreakable_stick);
        regsiterRender(false_sword);
        regsiterRender(false_axe);
        regsiterRender(false_pickaxe);
        regsiterRender(false_shovel);
        regsiterRender(false_hoe);
        regsiterRender(quartz_processor_press);
        regsiterRender(printed_quartz_processor);
        regsiterRender(redstone_printed_quartz_processor);
        regsiterRender(quartz_processor);
        regsiterRender(redstone_printed_logic_processor);
        regsiterRender(redstone_printed_engineering_processor);
        regsiterRender(redstone_printed_calculation_processor);
        regsiterRender(processor_binding);
    }

    @SideOnly(Side.CLIENT)
    private static void regsiterRender(Item item) {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0,model);
    }
}
