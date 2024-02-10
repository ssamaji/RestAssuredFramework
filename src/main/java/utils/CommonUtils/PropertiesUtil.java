package utils.CommonUtils;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Class to access properties files
 * @author ssamaji.
 * Created Feb 10, 2024.
 */
public class PropertiesUtil {
    private PropertiesUtil() {}
    private static final PropertiesUtil instance = new PropertiesUtil();
    public static PropertiesUtil getInstance() {
        return instance;
    }

    /**
     * Helper to read db properties
     * @return
     * @throws IOException
     */
    public Properties getDBProperties() throws IOException {
        return loadProperties("db.properties");
    }

    /**
     * Helper to read config properties
     * @return
     * @throws IOException
     */
    Properties getConfigProperties() throws IOException {
        return loadProperties("config.properties");
    }

    private Properties loadProperties(String configPropertyFileName) {
        Properties properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(configPropertyFileName)) {
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}
