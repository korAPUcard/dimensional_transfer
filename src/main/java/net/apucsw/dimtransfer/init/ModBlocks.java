package net.apucsw.dimtransfer.init;

import net.apucsw.dimtransfer.DimTransfer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DimTransfer.MODID);

    public static final RegistryObject<Block> OVER_DIMENSIONAL_CHEST = BLOCKS.register("over_dimensional_chest", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY)));
}
