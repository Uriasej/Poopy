package com.confusingfool.poopy.world.feature;

import com.confusingfool.poopy.Poopy;
import com.confusingfool.poopy.block.ModBlocks;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfuguredFeatures
{
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Poopy.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_JASPER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JASPER_ORE.get().defaultBlockState())
    ))::get;

    public static final Supplier<List<OreConfiguration.TargetBlockState>> DEEPSLATE_JASPER_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.JASPER_ORE.get().defaultBlockState())
    ));


    public static final RegistryObject<ConfiguredFeature<?,?>> JASPER_ORE = CONFIGURED_FEATURES.register("jasper_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_JASPER_ORES.get(), 50)));

    public static final RegistryObject<ConfiguredFeature<?,?>> DEEPSLATE_JASPER_ORE = CONFIGURED_FEATURES.register("deepslate_jasper_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_JASPER_ORES.get(), 50)));


    public static void register(IEventBus eventBus)
    {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
