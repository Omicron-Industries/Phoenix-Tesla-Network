package net.phoenix_tesla_network.tesla;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

import net.minecraft.data.recipes.FinishedRecipe;
import net.phoenix_tesla_network.tesla.common.data.materials.PhoenixElements;

import java.util.function.Consumer;

@SuppressWarnings("unused")
@GTAddon
public class PhoenixTeslaGTAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return PhoenixTeslaNetwork.PHOENIX_TESLA_REGISTRATE;
    }

    @Override
    public void initializeAddon() {}

    @Override
    public String addonModId() {
        return PhoenixTeslaNetwork.MOD_ID;
    }

    @Override
    public void registerTagPrefixes() {}

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {}

    @Override
    public void registerElements() {
        PhoenixElements.init();
    }
}
