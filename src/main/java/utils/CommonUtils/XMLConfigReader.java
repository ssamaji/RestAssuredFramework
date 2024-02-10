package utils.CommonUtils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Class to read xml configs
 * @author ssamaji.
 * Created Feb 10, 2024.
 */
public class XMLConfigReader {
    private XMLConfigReader() {}
    private static XMLConfigReader instance = new XMLConfigReader();
    public static XMLConfigReader getInstance() {
        return instance;
    }
    static PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();

    /**
     * Helper to read DB xml file config and return db details
     * @param dbName
     * @return
     */
    public Map<String, String> fetchDBDetails(String dbName){
        return getDatabaseConfig(getXmlElements(CommonConstants.CONFIGS.DB_CONFIG), dbName);
    }

    /**
     * helper to read service config and return the values
     * @param serviceName
     * @return
     */
    public Map<String, String> fetchServiceDetails(String serviceName) {
        return getServiceConfig(getXmlElements(CommonConstants.CONFIGS.SERVICE_CONFIG), serviceName);
    }
    private static Map<String, String> getDatabaseConfig(Element rootElement, String dbnameToSearch) {
        // Store all elements in a HashMap
        Map<String, String> databaseConfig = new HashMap<>();
        // Iterate over child elements
        NodeList nodeList = rootElement.getElementsByTagName("database");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                // Check if the current element has the specified dbname
                if (dbnameToSearch.equals(element.getElementsByTagName("database-name").item(0).getTextContent())) {
                    // Store element and its value in the map
                    databaseConfig.put(String.valueOf(CommonConstants.CONFIGS.DB_URL), element.getElementsByTagName("database-url")
                            .item(0).getTextContent());
                    databaseConfig.put(String.valueOf(CommonConstants.CONFIGS.DB_USERNAME), element.getElementsByTagName("username")
                            .item(0).getTextContent());
                    databaseConfig.put(String.valueOf(CommonConstants.CONFIGS.DB_PASSWORD), element.getElementsByTagName("password")
                            .item(0).getTextContent());
                    return databaseConfig;
                }
            }
        }
        // Return null if the dbname is not found
        return null;
    }

    private Map<String, String> getServiceConfig(Element rootElement, String serviceName) {
        // Store all elements in a HashMap
        Map<String, String> databaseConfig = new HashMap<>();
        // Iterate over child elements
        NodeList nodeList = rootElement.getElementsByTagName("service");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                // Check if the current element has the specified dbname
                if (serviceName.equals(element.getElementsByTagName("service-name").item(0).getTextContent())) {
                    // Store element and its value in the map
                    databaseConfig.put(String.valueOf(CommonConstants.CONFIGS.URL), element.getElementsByTagName("url")
                            .item(0).getTextContent());
                    databaseConfig.put(String.valueOf(CommonConstants.CONFIGS.PORT), element.getElementsByTagName("port")
                            .item(0).getTextContent());
                    databaseConfig.put(String.valueOf(CommonConstants.CONFIGS.HTTP_TYPE), element.getElementsByTagName("http-type")
                            .item(0).getTextContent());
                    return databaseConfig;
                }
            }
        }
        // Return null if the dbname is not found
        return null;
    }

    private static Element getXmlElements(CommonConstants.CONFIGS configs){
        Element rootElement =null;
        try {
            InputStream inputStream = XMLConfigReader.class.getClassLoader().getResourceAsStream(propertiesUtil.getConfigProperties().getProperty(String.valueOf(configs)));
            // Handle null InputStream
            if (inputStream == null) {
                throw new FileNotFoundException("Resource not found");
            }
            // Create a DocumentBuilder
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            // Parse the XML from the InputStream
            Document doc = dBuilder.parse(inputStream);

            // Normalize the document
            doc.getDocumentElement().normalize();

            // Get the root element
            rootElement = doc.getDocumentElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rootElement;
    }
    public static void main(String[] args){
        XMLConfigReader xmlConfigReader = XMLConfigReader.getInstance();
        xmlConfigReader.getServiceConfig(getXmlElements(CommonConstants.CONFIGS.SERVICE_CONFIG), "dummyService");
    }
}
