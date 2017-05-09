package com.albers.furnaceme.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File config) {
        Configuration configuration = new Configuration(config);
        boolean configValue = false;

        try {
            configuration.load();
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue",true, "Example config value").getBoolean(true);

        }
        catch (Exception e) {

        }
        finally {
            configuration.save();
        }

        System.out.println(configValue);
    }
}
