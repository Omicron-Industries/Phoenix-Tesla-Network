package net.phoenix_tesla_network.tesla.client.keybind;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import com.mojang.blaze3d.platform.InputConstants;
import org.lwjgl.glfw.GLFW;

public class PhoenixKeybinds {

    public static final KeyMapping OPEN_WING_GUI = new KeyMapping(
            "key.phoenix_tesla_network.wing_flight_gui",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_KP_9,
            "key.categories.phoenix_tesla_network");

    public static final KeyMapping TESLA_MODE = new KeyMapping(
            "key.phoenix_tesla_network.tesla_mode",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_M,
            "key.categories.phoenix_tesla_network");

    public static final KeyMapping TESLA_DISCHARGE = new KeyMapping(
            "key.phoenix_tesla_network.tesla_discharge",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_KP_7,
            "key.categories.phoenix_tesla_network");

    @SubscribeEvent
    public static void register(RegisterKeyMappingsEvent event) {
        event.register(OPEN_WING_GUI);
        event.register(TESLA_MODE);
        event.register(TESLA_DISCHARGE);
    }
}

