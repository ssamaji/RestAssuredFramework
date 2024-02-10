package utils.CommonUtils;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 * Class to add the logs
 * @author ssamaji.
 * Created Feb 10, 2024.
 */
public class TestLogger {
    private static Logger logger;

    static {
        // Initialize the logger
        logger = Logger.getLogger(TestLogger.class.getName());

        // Set the default log level to INFO
        logger.setLevel(Level.INFO);

        // Create console handler and set formatter
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());

        // Add console handler to logger
        logger.addHandler(consoleHandler);
    }

    public static void setLogLevel(Level level) {
        // Set the log level for the logger
        logger.setLevel(level);
    }

    public static void logInfo(String message) {
        // Log an INFO message
        logger.info(message);
    }

    public static void logWarning(String message) {
        // Log a WARNING message
        logger.warning(message);
    }

    public static void logError(String message, Throwable throwable) {
        // Log an ERROR message with an optional throwable
        logger.log(Level.SEVERE, message, throwable);
    }

}
