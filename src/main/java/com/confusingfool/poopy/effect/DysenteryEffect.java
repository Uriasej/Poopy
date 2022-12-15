package com.confusingfool.poopy.effect;

import com.confusingfool.poopy.Poopy;
import com.confusingfool.poopy.item.ModItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;

public class DysenteryEffect extends MobEffect
{
    public DysenteryEffect(MobEffectCategory mobEffectCategory, int color)
    {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier)
    {
        pLivingEntity.hurt(DamageSource.WITHER, 1.0F);

        if (pLivingEntity instanceof Player)
        {
            ((Player)pLivingEntity).causeFoodExhaustion(0.005F * (float)(pAmplifier + 1));
        }

        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier)
    {
        return true;
    }
}
