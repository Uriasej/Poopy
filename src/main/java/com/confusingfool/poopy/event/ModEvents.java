package com.confusingfool.poopy.event;

import com.confusingfool.poopy.Poopy;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Poopy.MOD_ID)
public class ModEvents
{
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event)
    {
        if (event.getEntity() instanceof Sheep)
        {
            if (event.getSource().getEntity() instanceof Player player)
            {
                player.sendSystemMessage(Component.literal(player.getName().getString() + "hurt a sheep"));
            }
        }
    }
}
