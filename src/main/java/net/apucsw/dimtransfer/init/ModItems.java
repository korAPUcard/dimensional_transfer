package net.apucsw.dimtransfer.init;

import net.apucsw.dimtransfer.DimTransfer;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DimTransfer.MODID);

    public static final RegistryObject<Item> MOD_DEBUG_ITEM = ITEMS.register("mod_debug_item",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> OVER_DIMENSIONAL_CHEST_ITEM = ITEMS.register("over_dimensional_chest", () -> new BlockItem(ModBlocks.OVER_DIMENSIONAL_CHEST.get(), new Item.Properties()));

    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build())));
}
