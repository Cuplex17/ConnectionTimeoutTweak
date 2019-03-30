package cuplex.ctot;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final General GENERAL = new General(BUILDER);

    public static class General{
        public ForgeConfigSpec.IntValue loginTimeOut;

        General(ForgeConfigSpec.Builder builder){
            builder.push("general");
            loginTimeOut = builder
                    .defineInRange("loginTimeout", 10000, 0, 900000);
            builder.pop();
        }
    }

    public static final ForgeConfigSpec spec = BUILDER.build();

}
