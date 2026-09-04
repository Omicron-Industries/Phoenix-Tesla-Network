package net.phoenix_tesla_network.tesla.common.data.materials;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.world.level.block.Blocks;
import net.phoenix_tesla_network.tesla.PhoenixTeslaNetwork;

import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.GasTier.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.ingot;

public class PhoenixProgressionMaterials {

    public static Material ALUMINFROST, SOURCE_IMBUED_TITANIUM, RESONANT_RHODIUM_ALLOY;
    public static Material EightyFivePercentPureNevonianSteel, AURUM_STEEL,
            FIERY_BRONZE, VOID_TOUCHED_TUNGSTEN_STEEL, FROST_REINFORCED_STAINED_STEEL, FROST,
            ADVANCED_QUIN_NAQUADIAN_ALLOY, NEBULAR_GOLD;

    public static Material MAGMATIC_MANGANESE_LEAD, CRYOGENIC_ALUMINUM_STRAND, ICY_STEEL_MATRIX,
            SOURCE_TITANIUM_FILAMENT, MAGMA;

    public static Material UNREFINED_ALUMINFROST;
    public static Material BLAZING_DRILLING_FLUID, VOIDIC_DRILLING_FLUID, CRYO_EMBER_FLUID;

    public static void register() {
        MAGMA = new Material.Builder(PhoenixTeslaNetwork.id("magma"))
                .dust()
                .ingot()
                .fluid()
                .color(0xff6d00)
                .secondaryColor(0xeaa92e)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();

        ingot.setIgnored(MAGMA, Blocks.MAGMA_BLOCK.asItem());

        FROST = new Material.Builder(PhoenixTeslaNetwork.id("frost"))
                .langValue("Frost")
                .fluid()
                .color(0xA7D1EB)
                .secondaryColor(0x778899)
                .iconSet(MaterialIconSet.SHINY)
                .buildAndRegister();

        UNREFINED_ALUMINFROST = new Material.Builder(PhoenixTeslaNetwork.id("unrefined_aluminfrost"))
                .dust()
                .color(0xA7D1EB)
                .cableProperties(GTValues.MV, 1, 2, false)
                .secondaryColor(0x778899)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();

        ALUMINFROST = new Material.Builder(PhoenixTeslaNetwork.id("aluminfrost")).ingot().fluid().color(0xadd8e6)
                .secondaryColor(0xc0c0c0).iconSet(MaterialIconSet.BRIGHT)
                .fluidPipeProperties(1200, 110, true, true, false, false)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_ROUND, GENERATE_GEAR, GENERATE_SMALL_GEAR,
                        PHOSPHORESCENT, GENERATE_LONG_ROD,
                        GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DENSE, GENERATE_ROTOR,
                        GENERATE_FOIL)
                .buildAndRegister();
        SOURCE_IMBUED_TITANIUM = new Material.Builder(PhoenixTeslaNetwork.id("source_imbued_titanium")).ingot().fluid()
                .color(0xc600ff).formula("✨C✨Ti").iconSet(MaterialIconSet.METALLIC)
                .cableProperties(GTValues.EV, 1, 2, false)
                .fluidPipeProperties(2800, 200, true, true, false, false)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_SMALL_GEAR, GENERATE_GEAR, PHOSPHORESCENT, GENERATE_ROD,
                        GENERATE_LONG_ROD,
                        GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_FOIL,
                        GENERATE_ROTOR)
                .buildAndRegister();
        RESONANT_RHODIUM_ALLOY = new Material.Builder(PhoenixTeslaNetwork.id("resonant_rhodium_alloy"))
                .ingot().fluid()
                .color(0xE245F8).secondaryColor(0xA345B0).iconSet(MaterialIconSet.METALLIC)
                .components(GTMaterials.Rhodium, 3, GTMaterials.Palladium, 4, PhoenixOres.POLARITY_FLIPPED_BISMUTHITE,
                        1, GTMaterials.Cerium, 4)
                .cableProperties(GTValues.LuV, 1, 2, false)
                .blastTemp(3600, HIGH, 480, 400).fluidPipeProperties(2800, 200, true, true, false, false)
                .flags(GENERATE_PLATE, GENERATE_RING, PHOSPHORESCENT, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_GEAR,
                        GENERATE_SMALL_GEAR, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DENSE, GENERATE_ROTOR,
                        GENERATE_FOIL)
                .buildAndRegister();

        ADVANCED_QUIN_NAQUADIAN_ALLOY = new Material.Builder(PhoenixTeslaNetwork.id("advanced_quin_naquadian_alloy"))
                .ingot()
                .liquid(7400)
                .color(0x000000)
                .secondaryColor(0x8B0000)
                .cableProperties(GTValues.ZPM, 1, 2, false)
                .iconSet(MaterialIconSet.RADIOACTIVE)
                .fluidPipeProperties(8000, 800, true, true, true, true)
                .components(GTMaterials.Naquadah, 5, GTMaterials.Trinium, 1, GTMaterials.Technetium, 3,
                        GTMaterials.Strontium, 4, GTMaterials.Iodine, 1)
                .blastTemp(7200, HIGH, GTValues.VA[GTValues.ZPM], 1950)
                .flags(GENERATE_PLATE,
                        GENERATE_RING,
                        PHOSPHORESCENT,
                        GENERATE_ROD,
                        GENERATE_BOLT_SCREW,
                        GENERATE_FRAME,
                        GENERATE_DENSE,
                        GENERATE_SMALL_GEAR,
                        GENERATE_ROTOR,
                        GENERATE_FOIL,
                        GENERATE_LONG_ROD)
                .buildAndRegister();

        FROST_REINFORCED_STAINED_STEEL = new Material.Builder(PhoenixTeslaNetwork.id("frost_reinforced_stained_steel"))
                .ingot()
                .fluid()
                .color(0xB0E0E6).secondaryColor(0x708090)
                .iconSet(MaterialIconSet.SHINY)
                .cableProperties(GTValues.HV, 1, 2, false)
                .components(GTMaterials.StainlessSteel, 4, FROST, 2, GTMaterials.Aluminium, 2)
                .blastTemp(4500, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV], 1200)
                .flags(
                        GENERATE_PLATE,
                        GENERATE_ROD,
                        GENERATE_LONG_ROD,
                        GENERATE_GEAR,
                        GENERATE_SMALL_GEAR,
                        GENERATE_FRAME,
                        GENERATE_BOLT_SCREW,
                        GENERATE_ROTOR,
                        GENERATE_RING,
                        GENERATE_DENSE,
                        GENERATE_FOIL)
                .buildAndRegister();

        VOID_TOUCHED_TUNGSTEN_STEEL = new Material.Builder(PhoenixTeslaNetwork.id("void_touched_tungsten_steel"))
                .ingot()
                .liquid(3100)
                .color(0x4B0082).secondaryColor(0x000000)
                .iconSet(MaterialIconSet.METALLIC)
                .cableProperties(GTValues.IV, 1, 2, false)
                .components(GTMaterials.Tungsten, 4, PhoenixOres.VOIDGLASS_SHARD, 4, GTMaterials.Molybdenum, 2)
                .blastTemp(4200, BlastProperty.GasTier.MID, GTValues.VA[GTValues.EV], 1000)
                .fluidPipeProperties(3800, 250, true, true, true, true)
                .flags(
                        GENERATE_PLATE,
                        GENERATE_RING,
                        PHOSPHORESCENT,
                        GENERATE_ROD,
                        GENERATE_LONG_ROD,
                        GENERATE_BOLT_SCREW,
                        GENERATE_FRAME,
                        GENERATE_GEAR,
                        GENERATE_SMALL_GEAR,
                        GENERATE_DENSE,
                        GENERATE_ROTOR, GENERATE_FOIL)
                .buildAndRegister();
        AURUM_STEEL = new Material.Builder(PhoenixTeslaNetwork.id("aurum_steel")).ingot().fluid().color(0xd0a860)
                .secondaryColor(0xc0c0c0).iconSet(MaterialIconSet.METALLIC)
                .cableProperties(LV, 1, 2, false)
                .fluidPipeProperties(5000, 50, true, true, false, false)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_ROUND, GENERATE_GEAR, PHOSPHORESCENT, GENERATE_ROD,
                        GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DENSE, GENERATE_ROTOR, GENERATE_FOIL,
                        GENERATE_SMALL_GEAR, GENERATE_LONG_ROD)
                .buildAndRegister();
        FIERY_BRONZE = new Material.Builder(PhoenixTeslaNetwork.id("fiery_bronze")).ingot().fluid().color(0xff6d00)
                .secondaryColor(0xa0522d).iconSet(MaterialIconSet.DULL)
                .fluidPipeProperties(2000, 40, true, false, false, false)
                .flags(GENERATE_PLATE, GENERATE_RING, GENERATE_ROUND, GENERATE_GEAR, PHOSPHORESCENT, GENERATE_ROD,
                        GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_DENSE, GENERATE_ROTOR)
                .buildAndRegister();

        MAGMATIC_MANGANESE_LEAD = new Material.Builder(PhoenixTeslaNetwork.id("magmatic_manganese_lead")).ingot()
                .fluid()
                .color(0x8B4513).cableProperties(GTValues.V[LV], 2, 2).buildAndRegister();
        CRYOGENIC_ALUMINUM_STRAND = new Material.Builder(PhoenixTeslaNetwork.id("cryogenic_aluminum_strand")).ingot()
                .fluid()
                .color(0xADD8E6).cableProperties(GTValues.V[GTValues.MV], 4, 0, true).buildAndRegister();
        ICY_STEEL_MATRIX = new Material.Builder(PhoenixTeslaNetwork.id("icy_steel_matrix")).ingot().fluid()
                .color(0xE0FFFF)
                .secondaryColor(0x696969).element(PhoenixElements.ICY_STEEL_MATRIX)
                .cableProperties(GTValues.V[GTValues.HV], 8, 0, true).buildAndRegister();
        SOURCE_TITANIUM_FILAMENT = new Material.Builder(PhoenixTeslaNetwork.id("source_titanium_filament")).ingot()
                .fluid()
                .color(0x8B008B).secondaryColor(0x454545).cableProperties(GTValues.V[GTValues.EV], 16, 0, true)
                .buildAndRegister();
        BLAZING_DRILLING_FLUID = new Material.Builder(PhoenixTeslaNetwork.id("blazing_drilling_fluid"))
                .fluid()
                .color(0xFF6600)
                .secondaryColor(0xEE4400)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();
        VOIDIC_DRILLING_FLUID = new Material.Builder(PhoenixTeslaNetwork.id("voidic_drilling_fluid"))
                .fluid()
                .color(0x400080)
                .secondaryColor(0x7B68EE)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();
        CRYO_EMBER_FLUID = new Material.Builder(PhoenixTeslaNetwork.id("cryo_ember_fluid"))
                .liquid(6000)
                .color(0xFF4500)
                .secondaryColor(0xA020F0)
                .iconSet(MaterialIconSet.DULL)
                .buildAndRegister();
    }
}
