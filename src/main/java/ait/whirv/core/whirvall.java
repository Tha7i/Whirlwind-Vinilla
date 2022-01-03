package ait.whirv.core;

import ait.whirv.constructor.ShadyHeavyDiamond;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class whirvall {

    //SHADY HEAVY ITEMS
    public static final ShadyHeavyDiamond SHADY_HEAVY_DIAMOND = new ShadyHeavyDiamond(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(2));
    //SHADY ITEMS
    public static final Item SHADY_GOLD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(32));
    public static final Item SHADY_EMERALD = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(32));
    public static final Item SHADY_IRON = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(32));
    public static final Item SHADY_LAPIS = new Item(new FabricItemSettings().group(ItemGroup.MATERIALS).maxCount(32));

    //SHADY ARMOR VAR's


}
