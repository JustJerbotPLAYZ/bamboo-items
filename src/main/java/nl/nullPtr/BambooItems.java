package nl.nullPtr;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nl.nullPtr.toolMaterial.BambooToolMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BambooItems implements ModInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger("bamboo-items");

    /* Axes */
    private static final AxeItem BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "bamboo_axe"), new AxeItem(BambooToolMaterial.BAMBOO, 6.5f, -3.1f, new FabricItemSettings()));
    private static final AxeItem STONE_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "stone_bamboo_axe"), new AxeItem(BambooToolMaterial.STONE, 7.0f, -3.0f, new FabricItemSettings()));
    private static final AxeItem GOLD_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "gold_bamboo_axe"), new AxeItem(BambooToolMaterial.GOLD, 6.0f, -2.7f, new FabricItemSettings()));
    private static final AxeItem IRON_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "iron_bamboo_axe"), new AxeItem(BambooToolMaterial.IRON, 6.0f, -2.9f, new FabricItemSettings()));
    private static final AxeItem DIAMOND_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "diamond_bamboo_axe"), new AxeItem(BambooToolMaterial.DIAMOND, 5.0f, -2.8f, new FabricItemSettings()));
    private static final AxeItem NETHERITE_BAMBOO_AXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "netherite_bamboo_axe"), new AxeItem(BambooToolMaterial.NETHERITE, 4.0f, -2.7f, new FabricItemSettings()));

    /* Swords */
    private static final float UNIVERSAL_SWORD_SPEED = -2f; //Wierd issue with hits where they sometimes don't register/hit an immunity frame
    private static final SwordItem BAMBOO_SWORD = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "bamboo_sword"), new SwordItem(BambooToolMaterial.BAMBOO, 3, UNIVERSAL_SWORD_SPEED, new FabricItemSettings()));
    private static final SwordItem STONE_BAMBOO_SWORD = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "stone_bamboo_sword"), new SwordItem(BambooToolMaterial.STONE, 3, UNIVERSAL_SWORD_SPEED, new FabricItemSettings()));
    private static final SwordItem GOLD_BAMBOO_SWORD = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "gold_bamboo_sword"), new SwordItem(BambooToolMaterial.GOLD, 3, UNIVERSAL_SWORD_SPEED, new FabricItemSettings()));
    private static final SwordItem IRON_BAMBOO_SWORD = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "iron_bamboo_sword"), new SwordItem(BambooToolMaterial.IRON, 3, UNIVERSAL_SWORD_SPEED, new FabricItemSettings()));
    private static final SwordItem DIAMOND_BAMBOO_SWORD = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "diamond_bamboo_sword"), new SwordItem(BambooToolMaterial.DIAMOND, 3, UNIVERSAL_SWORD_SPEED, new FabricItemSettings()));
    private static final SwordItem NETHERITE_BAMBOO_SWORD = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "netherite_bamboo_sword"), new SwordItem(BambooToolMaterial.NETHERITE, 3, UNIVERSAL_SWORD_SPEED, new FabricItemSettings()));

    /* Pickaxes */
    private static final int pickAttackDamage = 1;
    private static final float pickAttackSpeed = -2.5f;
    private static final PickaxeItem BAMBOO_PICKAXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "bamboo_pickaxe"), new PickaxeItem(BambooToolMaterial.BAMBOO, pickAttackDamage, pickAttackSpeed, new FabricItemSettings()));
    private static final PickaxeItem STONE_BAMBOO_PICKAXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "stone_bamboo_pickaxe"), new PickaxeItem(BambooToolMaterial.STONE, pickAttackDamage, pickAttackSpeed, new FabricItemSettings()));
    private static final PickaxeItem GOLD_BAMBOO_PICKAXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "gold_bamboo_pickaxe"), new PickaxeItem(BambooToolMaterial.GOLD, pickAttackDamage, pickAttackSpeed, new FabricItemSettings()));
    private static final PickaxeItem IRON_BAMBOO_PICKAXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "iron_bamboo_pickaxe"), new PickaxeItem(BambooToolMaterial.IRON, pickAttackDamage, pickAttackSpeed, new FabricItemSettings()));
    private static final PickaxeItem DIAMOND_BAMBOO_PICKAXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "diamond_bamboo_pickaxe"), new PickaxeItem(BambooToolMaterial.DIAMOND, pickAttackDamage, pickAttackSpeed, new FabricItemSettings()));
    private static final PickaxeItem NETHERITE_BAMBOO_PICKAXE = Registry.register(Registries.ITEM, new Identifier("bamboo-items", "netherite_bamboo_pickaxe"), new PickaxeItem(BambooToolMaterial.NETHERITE, pickAttackDamage, pickAttackSpeed, new FabricItemSettings()));

    private static final ItemGroup BAMBOO_TOOLS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.BAMBOO))
            .displayName(Text.translatable("itemGroup.bamboo-items.bamboo_items"))
            .entries((context, entries) -> {
                entries.add(BAMBOO_SWORD);
                entries.add(BAMBOO_PICKAXE);
                entries.add(BAMBOO_AXE);
                entries.add(STONE_BAMBOO_SWORD);
                entries.add(STONE_BAMBOO_PICKAXE);
                entries.add(STONE_BAMBOO_AXE);
                entries.add(GOLD_BAMBOO_SWORD);
                entries.add(GOLD_BAMBOO_PICKAXE);
                entries.add(GOLD_BAMBOO_AXE);
                entries.add(IRON_BAMBOO_SWORD);
                entries.add(IRON_BAMBOO_PICKAXE);
                entries.add(IRON_BAMBOO_AXE);
                entries.add(DIAMOND_BAMBOO_SWORD);
                entries.add(DIAMOND_BAMBOO_PICKAXE);
                entries.add(DIAMOND_BAMBOO_AXE);
                entries.add(NETHERITE_BAMBOO_SWORD);
                entries.add(NETHERITE_BAMBOO_PICKAXE);
                entries.add(NETHERITE_BAMBOO_AXE);
            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("bamboo-items", "bamboo_items"), BAMBOO_TOOLS);
        LOGGER.info("Meow Meow Mothertruckers!");
    }
}