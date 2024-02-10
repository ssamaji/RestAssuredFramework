package utils.sql;

import utils.CommonUtils.CommonConstants;
import utils.CommonUtils.XMLConfigReader;

import java.sql.*;
import java.util.Map;

/**
 * Class to perform sql operations
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class SqlEntity {
    private SqlEntity() {}
    private static final SqlEntity instance = new SqlEntity();
    public static SqlEntity getInstance() {
        return instance;
    }

    private XMLConfigReader xmlConfigReader = XMLConfigReader.getInstance();

    /**
     * helper to execute sql query
     * @param dbName
     * @param query
     */
    public ResultSet executeQuery(String dbName, String query) {
        Map<String, String> dbDetails = xmlConfigReader.fetchDBDetails(dbName);
        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection(dbDetails.get(CommonConstants.CONFIGS.DB_URL),
                    dbDetails.get(CommonConstants.CONFIGS.DB_USERNAME), dbDetails.get(CommonConstants.CONFIGS.DB_PASSWORD));

            Statement statement = connection.createStatement();

            // Execute a query
            resultSet = statement.executeQuery(query);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
