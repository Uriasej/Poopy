package com.confusingfool.poopy.potion;

import com.confusingfool.poopy.Poopy;
import com.confusingfool.poopy.effect.DysenteryEffect;
import com.confusingfool.poopy.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions
{
    public static DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, Poopy.MOD_ID);



    public static final RegistryObject<Potion> POOPY_ESSENCE = POTIONS.register("poopy_essence",
            () -> new Potion(new MobEffectInstance(ModEffects.DYSENTERY.get(), 1200, 4)));


    public static void register(IEventBus eventBus)
    {
        POTIONS.register(eventBus);
    }
}