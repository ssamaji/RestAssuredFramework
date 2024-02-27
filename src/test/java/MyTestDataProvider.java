import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import helpers.DataProviderClass;

import java.util.*;

public class MyTestDataProvider {
    @DataProvider(name = "myDataProvider")
    public Object[][] testData() {
        List<String> nameList = Arrays.asList("Swati","Myra","testUser");
        List<String> password = Arrays.asList("Swati123","Myra123","testUser123");
        List<String> jsonField = Arrays.asList("id","data.id","data.users.id");
        Object[][] dataProvider = new Object[nameList.size()][1];
        for(int i=0;i<nameList.size();i++){
            for(int j=0;j<password.size();j++){
                for(int k=0;k<jsonField.size();k++){
                    Map<String, String> testDataMap = new HashMap<>();
                    testDataMap.put("Name", nameList.get(i));
                    testDataMap.put("Password", password.get(j));
                    testDataMap.put("JsonField", jsonField.get(k));

                    dataProvider[i][0] = testDataMap;
                }
            }
        }
        // You can return a 2D array where each element is a HashMap
        return dataProvider;
    }

    @Test(dataProvider = "orderStatusFlow", dataProviderClass = DataProviderClass.class)
    public void myTest(HashMap<String, String> testData) {
        // Access your test data within the test method
        System.out.println("orderWiseDelay: "+testData.get("deliveryStatus"));
        System.out.println("orderWiseDelay: "+testData.get("flow"));
//        System.out.println("orderWiseDelay: "+testData.get("orderWiseDelay"));
//        System.out.println("DP "+testData);

    }
}
