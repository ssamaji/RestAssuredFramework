package utils.CommonUtils;

import java.io.FileReader;
import java.io.IOException;
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
        FileReader reader=new FileReader("/Users/swatisamaji/RestAssuredFramework/src/main/resources/db.properties");
        Properties properties = new Properties();
        properties.load(reader);
        return properties;
    }

    /**
     * Helper to read config properties
     * @return
     * @throws IOException
     */
    Properties getConfigProperties() throws IOException {
        FileReader reader=new FileReader("/Users/swatisamaji/RestAssuredFramework/src/main/resources/config.properties");
        Properties properties = new Properties();
        properties.load(reader);
        return properties;
    }
}
