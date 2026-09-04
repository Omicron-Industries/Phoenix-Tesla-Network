package net.phoenix_tesla_network.tesla.client.renderer.machine.multiblock;

import com.gregtechceu.gtceu.client.renderer.machine.DynamicRender;

import net.phoenix_tesla_network.tesla.client.renderer.machine.TeslaTowerRenderer;

public class PhoenixDynamicRenderHelpers {

    public static DynamicRender<?, ?> getTeslaTowerRenderer() {
        return TeslaTowerRenderer.INSTANCE;
    }
}

