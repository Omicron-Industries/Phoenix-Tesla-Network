package net.phoenix_tesla_network.tesla;

import com.gregtechceu.gtceu.api.data.chemical.material.IMaterialRegistryManager;

import net.phoenix_tesla_network.tesla.api.machine.trait.ITeslaBattery;
import net.phoenix_tesla_network.tesla.common.block.TeslaBatteryBlock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PhoenixTeslaAPI {

    public static IMaterialRegistryManager materialManager;

    public static PhoenixTeslaAPI instance;

    public static final Logger LOGGER = LogManager.getLogger();

    public static final Map<ITeslaBattery, Supplier<TeslaBatteryBlock>> TESLA_BATTERIES = new HashMap<>();
}

