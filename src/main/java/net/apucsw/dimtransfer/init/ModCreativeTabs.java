package net.apucsw.dimtransfer.init;

import net.apucsw.dimtransfer.DimTransfer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DimTransfer.MODID);

    public static final RegistryObject<CreativeModeTab> DIMTRANSFER_TAB = CREATIVE_MODE_TABS.register("dimtransfer_tab", () -> CreativeModeTab.builder()
            .icon(() -> ModItems.EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.MOD_DEBUG_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());

    // Add the example block item to the building blocks tab
    public static void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == DIMTRANSFER_TAB.getKey())
            event.accept(ModItems.OVER_DIMENSIONAL_CHEST_ITEM);
    }
}
