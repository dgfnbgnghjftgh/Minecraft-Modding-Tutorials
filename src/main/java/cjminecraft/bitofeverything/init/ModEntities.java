package com.example.mymod.init;

import com.example.mymod.MyMod;
import com.example.mymod.entities.PitBikeEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = 
        DeferredRegister.create(ForgeRegistries.ENTITIES, MyMod.MOD_ID);

    public static final RegistryObject<EntityType<PitBikeEntity>> PIT_BIKE =
        ENTITY_TYPES.register("pit_bike", () -> EntityType.Builder.of(PitBikeEntity::new, EntityClassification.MISC)
            .sized(1.0f, 0.5f)
            .clientTrackingRange(4)
            .build("pit_bike"));
}
