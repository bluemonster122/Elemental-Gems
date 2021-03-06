package me.bluemonster.elgems.utility;


import me.bluemonster.elgems.reference.Refs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author bluemonster122 <boo122333@gmail.com>
 */
public class LogHelper {

    public static final Logger LOGGER = LogManager.getLogger(Refs.ModInfo.MOD_ID);

    public static void warn(String msg) {
        LOGGER.warn(msg);
    }

    public static void error(String msg) {
        LOGGER.error(msg);
    }

    public static void info(String msg) {
        LOGGER.info(msg);
    }

    public static void debug(String msg) {
        LOGGER.debug(msg);
    }

    private LogHelper()
    {
    }

}
