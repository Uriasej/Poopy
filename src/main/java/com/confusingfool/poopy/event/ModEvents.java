package com.confusingfool.poopy.event;

import com.confusingfool.poopy.Poopy;
import com.confusingfool.poopy.effect.ModEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

import static com.confusingfool.poopy.item.ModItems.*;

@Mod.EventBusSubscriber(modid = Poopy.MOD_ID)
public class ModEvents
{
    @SubscribeEvent
    public static void onPlayerEats(LivingEntityUseItemEvent event)
    {
        if (event.getEntity() instanceof Player player && event.getItem().isEdible())
        {
             if (Objects.requireNonNull(event.getItem().getFoodProperties(player)).isMeat())
                        if (event.getDuration() == 0 && !event.getEntity().hasEffect(ModEffects.DYSENTERY.get())) {
                            player.spawnAtLocation(new ItemStack(POOPY.get()));
                        } else if (event.getDuration() == 0 && event.getEntity().hasEffect(ModEffects.DYSENTERY.get())) {
                            player.spawnAtLocation(new ItemStack(FOUL_POOPY.get()));
                        } else if (event.getDuration() == 0 && event.getEntity().hasEffect(ModEffects.CONSTIPATION_EFFECT.get())) {
                            player.spawnAtLocation(new ItemStack(HARDENED_POOPY.get()));
                        }
                }
            }

    @SubscribeEvent
    public static void onPlayerBreaks(BlockEvent.BreakEvent event)
    {
       // if ()
        {

        }
    }
}
