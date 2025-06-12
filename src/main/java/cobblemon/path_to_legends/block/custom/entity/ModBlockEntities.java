package cobblemon.path_to_legends.block.custom.entity;

import cobblemon.path_to_legends.PathToLegends;
import cobblemon.path_to_legends.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static void registerBlockEntities() {
    }

    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(PathToLegends.MOD_ID, "pedestal_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new,
                            ModBlocks.ANDESITE_PEDESTAL,
                            ModBlocks.DIORITE_PEDESTAL,
                            ModBlocks.GRANITE_PEDESTAL,
                            ModBlocks.DEEPSLATE_PEDESTAL,
                            ModBlocks.MUD_PEDESTAL,
                            ModBlocks.BLACKSTONE_PEDESTAL,
                            ModBlocks.END_STONE_PEDESTAL,
                            ModBlocks.PURPUR_PEDESTAL,
                            ModBlocks.BRICKS_PEDESTAL,
                            ModBlocks.SANDSTONE_PEDESTAL,
                            ModBlocks.RED_SANDSTONE_PEDESTAL,
                            ModBlocks.NETHER_BRICKS_PEDESTAL,
                            ModBlocks.RED_NETHER_BRICKS_PEDESTAL,
                            ModBlocks.PRISMARINE_BRICKS_PEDESTAL,
                            ModBlocks.TUFF_BRICKS_PEDESTAL,
                            ModBlocks.DARK_PRISMARINE_PEDESTAL,
                            ModBlocks.QUARTZ_BRICKS_PEDESTAL,
                            ModBlocks.STONE_BRICKS_PEDESTAL
                    ).build(null));

}
