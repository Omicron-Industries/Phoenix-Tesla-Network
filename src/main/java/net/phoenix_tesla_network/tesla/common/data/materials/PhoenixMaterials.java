package net.phoenix_tesla_network.tesla.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;
import com.gregtechceu.gtceu.api.fluids.store.FluidStorageKey;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class PhoenixMaterials {

    public static void register() {}

    public static void addFluid(Material m, FluidStorageKey key) {
        FluidProperty prop = new FluidProperty();

        prop.getStorage().enqueueRegistration(key, new FluidBuilder());

        m.setProperty(PropertyKey.FLUID, prop);
    }
}

