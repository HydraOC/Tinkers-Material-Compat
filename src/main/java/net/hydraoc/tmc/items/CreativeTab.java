package net.hydraoc.tmc.items;

import net.hydraoc.tmc.TinkersMaterialCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TinkersMaterialCompat.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tmc_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.BRICK))
                    .title(Component.translatable("creativetab.tmc_item_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //pOutput.accept(ModBlocks.MITHRIL_ORE.get());
                    })
                    .build());
}
