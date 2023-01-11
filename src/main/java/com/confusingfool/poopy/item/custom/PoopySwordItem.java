package com.confusingfool.poopy.item.custom;

import com.confusingfool.poopy.effect.ModEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class PoopySwordItem extends SwordItem
{

    public PoopySwordItem(Tier tier, int damageModifier, float attackSpeed, Properties properties) {
        super(tier, damageModifier, attackSpeed, properties);
    }


    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker)
    {
        target.addEffect(new MobEffectInstance(ModEffects.DYSENTERY.get(), 200), attacker);

        return super.hurtEnemy(itemStack, target, attacker);
    }
}
