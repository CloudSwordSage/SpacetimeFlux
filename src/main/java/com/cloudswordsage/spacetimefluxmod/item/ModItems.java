package com.cloudswordsage.spacetimefluxmod.item;

import com.cloudswordsage.spacetimefluxmod.SpacetimeFluxMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SpacetimeFluxMod.MOD_ID);

    public static final DeferredItem<Item> TIME_CRYSTAL = ITEMS.register("time_crystal",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SPACE_CRYSTAL = ITEMS.register("space_crystal",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
