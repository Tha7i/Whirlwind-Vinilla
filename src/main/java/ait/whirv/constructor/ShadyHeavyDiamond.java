package ait.whirv.constructor;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ShadyHeavyDiamond extends Item {

    public ShadyHeavyDiamond(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.damage(DamageSource.OUT_OF_WORLD, 1);
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}
