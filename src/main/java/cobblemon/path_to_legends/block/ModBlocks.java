package cobblemon.path_to_legends.block;

import cobblemon.path_to_legends.block.custom.SimplePedestalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import cobblemon.path_to_legends.PathToLegends;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ANDESITE_PEDESTAL = registerBlock("andesite_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block DEEPSLATE_PEDESTAL = registerBlock("deepslate_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block MUD_PEDESTAL = registerBlock("mud_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block BLACKSTONE_PEDESTAL = registerBlock("blackstone_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block END_STONE_PEDESTAL = registerBlock("end_stone_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block PURPUR_PEDESTAL = registerBlock("purpur_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block BRICKS_PEDESTAL = registerBlock("bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block SANDSTONE_PEDESTAL = registerBlock("sandstone_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block RED_SANDSTONE_PEDESTAL = registerBlock("red_sandstone_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block NETHER_BRICKS_PEDESTAL = registerBlock("nether_bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block RED_NETHER_BRICKS_PEDESTAL = registerBlock("red_nether_bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block PRISMARINE_BRICKS_PEDESTAL = registerBlock("prismarine_bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block STONE_BRICKS_PEDESTAL = registerBlock("stone_bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block DARK_PRISMARINE_PEDESTAL = registerBlock("dark_prismarine_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block QUARTZ_BRICKS_PEDESTAL = registerBlock("quartz_bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    public static final Block TUFF_BRICKS_PEDESTAL = registerBlock("tuff_bricks_pedestal",
            new SimplePedestalBlock(AbstractBlock.Settings.create().nonOpaque().strength(-1f).resistance(3600000f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PathToLegends.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PathToLegends.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PathToLegends.LOGGER.info("Registering Mod Block for "+ PathToLegends.MOD_ID);
    }
}
