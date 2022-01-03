package ait.whirv;

//Classes
import ait.whirv.core.whirvall;
import ait.whirv.registry.Registrywhirv;

//Imported
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WhirlwindVanilla implements ModInitializer {
    public static Logger LOGGER = LogManager.getLogger();
        public static final String MOD_ID = "whirv";
        public static final String MOD_NAME = "Whirlwind Vanilla";
            public static Identifier id(String path) {
                return new Identifier(MOD_ID, path);}


    @SuppressWarnings("unused")
    @Override
    public void onInitialize() {

        Registrywhirv.coreRegistry();
    }
}
