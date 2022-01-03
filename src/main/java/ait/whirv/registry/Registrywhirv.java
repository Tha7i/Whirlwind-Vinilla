package ait.whirv.registry;

import ait.whirv.WhirlwindVanilla;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static ait.whirv.core.whirvall.*;

public class Registrywhirv {

    public static void coreRegistry(){
        Registry.register(Registry.ITEM, new Identifier(WhirlwindVanilla.MOD_ID, "shady_heavy_diamond"), SHADY_HEAVY_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(WhirlwindVanilla.MOD_ID, "shady_emerald"), SHADY_EMERALD);
        Registry.register(Registry.ITEM, new Identifier(WhirlwindVanilla.MOD_ID, "shady_iron"), SHADY_IRON);
        Registry.register(Registry.ITEM, new Identifier(WhirlwindVanilla.MOD_ID, "shady_gold"), SHADY_GOLD);
        Registry.register(Registry.ITEM, new Identifier(WhirlwindVanilla.MOD_ID, "shady_lapis"), SHADY_LAPIS);
    }
}
