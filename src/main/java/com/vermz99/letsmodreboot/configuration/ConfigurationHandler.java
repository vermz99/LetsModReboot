package com.vermz99.letsmodreboot.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler //config file
{
    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            // Load the configuration file
            configuration.load();

            // Read in the value of configValue properties from configuration file. Something other than a boolean can be chosen (see configuration.java)
            // get return a properties type, getBoolean return the actual value of the properties, true is the default value.
            // Configuration.CATEGORY_GENERAL can be renamed anything.
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is a configuration test").getBoolean(true);
        }
        catch (Exception e)
        {

            // Log the exception
        }
        finally // will always go whatever happens in try or catch
        {
            configuration.save();
            // Saved the configuration file
        }
    }
}
