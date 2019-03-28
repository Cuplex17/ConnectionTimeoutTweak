package cuplex.ctot;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ctot")
public class CTOTMain {
    public static CTOTMain instance;
    public static final String modid = "ctot";
    public static final Logger logger = LogManager.getLogger(modid);
    public static final boolean IS_DEOBFUSCATED =
            (boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");


    public CTOTMain() {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        logger.info("Connection Timeout Tweak Loaded!");
    }

    private void clientRegistries(final FMLClientSetupEvent event) {

    }
}
