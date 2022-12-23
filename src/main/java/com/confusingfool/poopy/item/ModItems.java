package com.confusingfool.poopy.item;

import com.confusingfool.poopy.Poopy;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
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

    public static final RegistryObject<Item> JASPER_CRYSTAL = ITEMS.register("jasper_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB)));

    public static final RegistryObject<Item> DRIED_POOPY = ITEMS.register("dried_poopy",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(2.4f).meat().fast().effect(() -> new MobEffectInstance(MobEffects.WITHER, 200, 1), 0.9f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 1), 0.9f).build())));

    public static final RegistryObject<Item> MOLTEN_JASPER = ITEMS.register("molten_jasper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB)));

    public static final RegistryObject<Item> FOUL_POOPY = ITEMS.register("foul_poopy",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB)));

    public static final RegistryObject<Item> FLESH = ITEMS.register("flesh",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.POOPY_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
