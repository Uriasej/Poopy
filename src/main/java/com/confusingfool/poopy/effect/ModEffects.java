package com.confusingfool.poopy.effect;

import com.confusingfool.poopy.Poopy;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects
{
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Poopy.MOD_ID);


    public static final RegistryObject<MobEffect> DYSENTERY = MOB_EFFECTS.register("dysentery",
            () -> new DysenteryEffect(MobEffectCategory.HARMFUL, 8084480));

    public static void register(IEventBus eventBus)
    {
        MOB_EFFECTS.register(eventBus);
    }
}
