package com.papa.paparpg.item;

import com.papa.paparpg.PapaRPGMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PapaRPGMod.MOD_ID);


    // EXAMPLE OF GEM TYPE 2D ITEMS BELOW
    public static final RegistryObject<Item> PAPARITE = ITEMS.register("paparite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PAPARITE = ITEMS.register("raw_paparite",
            () -> new Item(new Item.Properties()));

    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
