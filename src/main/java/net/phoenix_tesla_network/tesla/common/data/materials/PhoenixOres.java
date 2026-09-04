package net.phoenix_tesla_network.tesla.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;

import net.phoenix_tesla_network.tesla.PhoenixTeslaNetwork;

public class PhoenixOres {

    public static Material NEVVONIAN_IRON;
    public static Material IGNISIUM;
    public static Material POLARITY_FLIPPED_BISMUTHITE;
    public static Material VOIDGLASS_SHARD;
    public static Material CRYSTALLIZED_FLUXSTONE;
    public static Material PERMAFROST;

    public static void register() {
        NEVVONIAN_IRON = new Material.Builder(PhoenixTeslaNetwork.id("nevvonian_iron"))
                .ingot()
                .ore()
                .color(0x7A687F)
                .iconSet(MaterialIconSet.DIAMOND)
                .buildAndRegister();

        VOIDGLASS_SHARD = new Material.Builder(PhoenixTeslaNetwork.id("voidglass_shard"))
                .gem()
                .ore()
                .color(0x6A00AA)
                .iconSet(MaterialIconSet.DIAMOND)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();

        POLARITY_FLIPPED_BISMUTHITE = new Material.Builder(PhoenixTeslaNetwork.id("polarity_flipped_bismuthite"))
                .dust()
                .ore()
                .color(0xE4D6FF)
                .iconSet(MaterialIconSet.DIAMOND)
                .flags(MaterialFlags.DISABLE_DECOMPOSITION)
                .buildAndRegister();

        PERMAFROST = new Material.Builder(net.phoenix_tesla_network.tesla.PhoenixTeslaNetwork.id("permafrost"))
                .dust()
                .ore()
                .color(0xA7D1EB)
                .iconSet(MaterialIconSet.DIAMOND)
                .buildAndRegister();

        IGNISIUM = new Material.Builder(PhoenixTeslaNetwork.id("ignisium"))
                .dust()
                .ore()
                .color(0xFF4500)
                .iconSet(MaterialIconSet.DIAMOND)
                .buildAndRegister();

        CRYSTALLIZED_FLUXSTONE = new Material.Builder(PhoenixTeslaNetwork.id("crystallized_fluxstone"))
                .dust()
                .ore()
                .color(0xD4BFFF)
                .iconSet(MaterialIconSet.DIAMOND)
                .buildAndRegister();
    }
}
