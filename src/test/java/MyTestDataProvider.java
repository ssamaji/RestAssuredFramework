import helpers.employees.EmployeeDataManager;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import helpers.employees.DataProviderClass;
import pojo.CustomerInfo;
import utils.sql.SqlEntity;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class MyTestDataProvider {
    EmployeeDataManager employeeDataManager = EmployeeDataManager.getInstance();
    SqlEntity sqlEntity = SqlEntity.getInstance();

//    @Test(dataProvider = "orderStatusFlow", dataProviderClass = DataProviderClass.class)
    public void myTest(HashMap<String, String> testData) throws InterruptedException {
        // Access your test data within the test method
        System.out.println("orderWiseDelay: "+testData.get("deliveryStatus"));
        System.out.println("orderWiseDelay: "+testData.get("flow"));
        Thread.sleep(30000);
//        System.out.println("orderWiseDelay: "+testData.get("orderWiseDelay"));
//        System.out.println("DP "+testData);

    }

//    @Parameters("browser")
//    @Test(description = "dataParameter",groups = "sanity")
    public void dataParameter() throws IOException, ClassNotFoundException, SQLException {
        Assert.assertEquals("chrome","chrome");
//        ArrayList<CustomerInfo> list =  employeeDataManager.setSqlData(sqlEntity.executeQuery("Business","select * from CustomerInfo;"));
//        String data= employeeDataManager.convertDataInJson(list);
//        System.out.println(" customerInfo "+ data);
    }

    //    @Test(description = "dataParameter" ,dataProvider = "getData", dataProviderClass = DataProviderClass.class)
//    @Test(description = "dataParameter",groups = "sanity")
    public void dataProviderTests() throws IOException {
        int actual = 10;
        int actualValue = actual+20;
        Assert.assertEquals(actualValue,30);
    }
    @Test(dataProvider = "readTestDataFromSheet",groups = "sanity",dataProviderClass = DataProviderClass.class)
    public void dataProviderExcelTests(String userName,String password) throws IOException {
        int actual = 10;
        int actualValue = actual+20;
        Assert.assertEquals(actualValue,30);
        System.out.println(" username "+userName+" password "+password);
    }
}
