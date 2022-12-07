package com.confusingfool.poopy.item;

import com.confusingfool.poopy.Poopy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Poopy.MOD_ID);


    public static final RegistryObject<Item> POOPY = ITEMS.register("poopy",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB)));

    public static final RegistryObject<Item> POOPY_DIAMOND = ITEMS.register("poopy_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB)));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
