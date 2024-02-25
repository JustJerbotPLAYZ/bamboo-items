package nl.nullPtr;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nl.nullPtr.item.BambooAxeItem;
import nl.nullPtr.toolMaterial.BambooToolMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BambooItems implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("bamboo-items");
    public static final BambooAxeItem FLINT_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "flint_bamboo_axe"), new BambooAxeItem(BambooToolMaterial.FLINT, 6.5f, -3.1f, new FabricItemSettings()));
    public static final BambooAxeItem STONE_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "stone_bamboo_axe"), new BambooAxeItem(BambooToolMaterial.STONE, 7.0f, -3.0f, new FabricItemSettings()));
    public static final BambooAxeItem GOLD_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "gold_bamboo_axe"), new BambooAxeItem(BambooToolMaterial.GOLD, 6.0f, -2.7f, new FabricItemSettings()));
    public static final BambooAxeItem IRON_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "iron_bamboo_axe"), new BambooAxeItem(BambooToolMaterial.IRON, 6.0f, -2.9f, new FabricItemSettings()));
    public static final BambooAxeItem DIAMOND_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "diamond_bamboo_axe"), new BambooAxeItem(BambooToolMaterial.DIAMOND, 5.0f, -2.8f, new FabricItemSettings()));
    public static final BambooAxeItem NETHERITE_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "netherite_bamboo_axe"), new BambooAxeItem(BambooToolMaterial.NETHERITE, 5.0f, -2.7f, new FabricItemSettings()));

    private static final ItemGroup BAMBOO_TOOLS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.BAMBOO))
            .displayName(Text.translatable("itemGroup.bamboo-items.bamboo_items"))
            .entries((context, entries) -> {
                entries.add(FLINT_BAMBOO_AXE);
                entries.add(STONE_BAMBOO_AXE);
                entries.add(GOLD_BAMBOO_AXE);
                entries.add(IRON_BAMBOO_AXE);
                entries.add(DIAMOND_BAMBOO_AXE);
                entries.add(NETHERITE_BAMBOO_AXE);
            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("bamboo-items", "bamboo_items"), BAMBOO_TOOLS);
        LOGGER.info("Meow Meow Mothertruckers!");
    }
}