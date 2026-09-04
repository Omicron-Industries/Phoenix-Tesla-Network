package net.phoenix_tesla_network.tesla.client.particle;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phoenix_tesla_network.tesla.PhoenixTeslaNetwork;

public class PhoenixParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister
            .create(ForgeRegistries.PARTICLE_TYPES, PhoenixTeslaNetwork.MOD_ID);

    public static final RegistryObject<SimpleParticleType> TESLA_SPARK = PARTICLES.register("tesla_spark",
            () -> new SimpleParticleType(false));

    public static void init(IEventBus modBus) {
        PARTICLES.register(modBus);
    }
}

