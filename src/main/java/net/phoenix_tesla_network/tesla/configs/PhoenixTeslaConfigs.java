package net.phoenix_tesla_network.tesla.configs;

import net.phoenix_tesla_network.tesla.PhoenixTeslaNetwork;

import dev.toma.configuration.Configuration;
import dev.toma.configuration.config.Config;
import dev.toma.configuration.config.ConfigHolder;
import dev.toma.configuration.config.Configurable;
import dev.toma.configuration.config.format.ConfigFormats;

@Config(id = PhoenixTeslaNetwork.MOD_ID)
public class PhoenixTeslaConfigs {

    public static PhoenixTeslaConfigs INSTANCE;
    public static ConfigHolder<PhoenixTeslaConfigs> CONFIG_HOLDER;

    public static void init() {
        CONFIG_HOLDER = Configuration.registerConfig(PhoenixTeslaConfigs.class, ConfigFormats.yaml());
        INSTANCE = CONFIG_HOLDER.getConfigInstance();
    }

    @Configurable
    public FeatureConfigs features = new FeatureConfigs();

    @Configurable
    public static WingFlightConfigs wingFlight = new WingFlightConfigs();

    public static class FeatureConfigs {

        @Configurable
        @Configurable.Comment({
                "The connection mode for Tesla Towers.",
                "TEAM_AUTO: All towers under a team/player share the same cloud automatically.",
                "DATA_STICK: Towers must be manually linked to hatches using a Data Stick."
        })
        public TeslaConnectionMode teslaConnectionMode = TeslaConnectionMode.DATA_STICK;

        public enum TeslaConnectionMode {
            TEAM_AUTO,
            DATA_STICK
        }
    }

    public static class WingFlightConfigs {

        @Configurable
        @Configurable.Comment({
                "EU/t drained from the Tesla network during powered elytra/sonic flight.",
                "Speed and boost scale proportionally with this value.",
                "Default: 5000"
        })
        public long poweredFlightEUt = 5_000L;

        @Configurable
        @Configurable.Comment({
                "EU/t drained from the Tesla network during creative flight mode.",
                "Set to 0 for truly free creative flight.",
                "Fly speed scales proportionally with this value.",
                "Default: 1000"
        })
        public long creativeFlightEUt = 1_000L;

        @Configurable
        @Configurable.Comment({
                "Base boost scale for powered elytra flight at minimum speed setting.",
                "The actual boost = boostMin + (speedSlider * (boostMax - boostMin))",
                "Default: 0.01"
        })
        public double poweredBoostMin = 0.01;

        @Configurable
        @Configurable.Comment({
                "Max boost scale for powered elytra flight at maximum speed setting.",
                "Scales further with poweredFlightEUt so higher drain = faster top speed.",
                "Default: 0.09"
        })
        public double poweredBoostMax = 0.09;

        @Configurable
        @Configurable.Comment({
                "Min creative fly speed (at speed slider = 0).",
                "Default: 0.05"
        })
        public double creativeSpeedMin = 0.05;

        @Configurable
        @Configurable.Comment({
                "Max creative fly speed (at speed slider = 10).",
                "Scales further with creativeFlightEUt so higher drain = faster top speed.",
                "Default: 0.2"
        })
        public double creativeSpeedMax = 0.20;

        @Configurable
        @Configurable.Comment({
                "Min horizontal speed, in blocks/tick, for plain \"Creative\" mode's free-strafing",
                "flight (at speed slider = 0). This is a direct velocity, not creativeSpeedMin/Max's",
                "vanilla Abilities.flyingSpeed units - vanilla's own flight accumulates well beyond",
                "that value tick over tick via friction, but free-strafing sets velocity directly with",
                "no such buildup, so it needed its own, much larger-looking range to feel equivalent.",
                "Default: 1.0"
        })
        public double creativeFreeSpeedMin = 1.0;

        @Configurable
        @Configurable.Comment({
                "Max horizontal speed, in blocks/tick, for plain \"Creative\" mode's free-strafing",
                "flight (at speed slider = 20). See creativeFreeSpeedMin.",
                "Default: 8.0"
        })
        public double creativeFreeSpeedMax = 8.0;

        @Configurable
        @Configurable.Comment({
                "Min speed clamp for powered flight (at drift slider = 0, tightest handling).",
                "Default: 0.6"
        })
        public double poweredDriftMin = 0.6;

        @Configurable
        @Configurable.Comment({
                "Max speed clamp for powered flight (at drift slider = 10, loosest/floatiest).",
                "Default: 1.8"
        })
        public double poweredDriftMax = 1.8;

        @Configurable
        @Configurable.Comment({
                "Horizontal velocity retention per tick while airborne but not thrusting, at drift",
                "slider = 0 (full inertia canceling). 0.0 = stop instantly, 1.0 = never decay.",
                "Default: 0.0"
        })
        public double coastRetentionMin = 0.0;

        @Configurable
        @Configurable.Comment({
                "See coastRetentionMin - the retention fraction at drift slider = 10.",
                "Default: 1.0"
        })
        public double coastRetentionMax = 1.0;

        @Configurable
        @Configurable.Comment({
                "Climb-speed multiplier for powered/sonic flight at vertical-speed slider = 5",
                "(the slider's \"normal\" midpoint, range 0-20) - matches the flat 8x climb boost",
                "this used to be hardcoded to, before the slider existed. Scales proportionally",
                "with the slider on both sides: 0 = none, 10 = double this, 20 = quadruple this.",
                "Default: 8.0"
        })
        public double poweredVerticalBase = 8.0;
    }

}

