package cobblemon.path_to_legends.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.UseAction;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.world.ServerWorld;

public class FunctionalItem extends Item {
    private final String functionName;

    public FunctionalItem(Settings settings, String functionName) {
        super(settings);
        this.functionName = functionName;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.setCurrentHand(hand);
        return TypedActionResult.consume(player.getStackInHand(hand));
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 3600000;
    }



    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!world.isClient && user instanceof PlayerEntity player && world instanceof ServerWorld serverWorld) {

            MinecraftServer server = serverWorld.getServer();
            ServerCommandSource commandSource = player.getCommandSource().withLevel(2).withSilent();

            if (functionName != null && !functionName.isEmpty()) {
                server.getCommandManager().executeWithPrefix(commandSource, "function " + functionName);
            }

            player.getItemCooldownManager().set(this, 40);
        }
    }

}