package helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.protos.CreateEmployeeRequest;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import pojo.CustomerInfo;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Data Manager class which will have helpers (retrieval of data)
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class EmployeeDataManager {
    private static final EmployeeDataManager instance = new EmployeeDataManager();

    // private constructor to avoid client applications using the constructor
    private EmployeeDataManager(){}

    public static EmployeeDataManager getInstance() {
        return instance;
    }

    private EmployeeEntity entity = new EmployeeEntity();


    /**
     *
     * @param name
     * @param salary
     * @param age
     * @param id
     * @return
     */
    public CreateEmployeeRequest createEmployeeRequest(String name, String salary, String age, int id) {
        return entity.createEmployeeRequest(name,salary,age,id);
    }

    /**
     *
     * @return
     */
    public CreateEmployeeRequest createEmployeeRequest(){
        return entity.createEmployeeRequest();
    }

    /**
     * Helper to convert resultSet to java object
     * @param resultSet
     * @return
     * @throws SQLException
     * @throws IOException
     */
    public ArrayList<CustomerInfo> setSqlData(ResultSet resultSet) throws SQLException, IOException {
        CustomerInfo customerInfo = new CustomerInfo();
        CustomerInfo customerInfo1 = null;
        ArrayList<CustomerInfo> arrayList = new ArrayList<CustomerInfo>();
        int i=0;
        while(resultSet.next()){
            customerInfo.setAmount(resultSet.getInt("Amount"));
            customerInfo.setCourseName(resultSet.getString("CourseName"));
            customerInfo.setLocation(resultSet.getString("Location"));
            customerInfo.setPurchaseDate(resultSet.getString("PurchaseDate"));
            arrayList.add(customerInfo);
            //Code to convert sql data into json file
            String fileName = i+"customerInfo.json";
            //convert pojo to json file
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("src/main/resources/jsonFiles/"+fileName), customerInfo);
            i++;
            customerInfo1 = objectMapper.readValue(new File("src/main/resources/jsonFiles/"+fileName),CustomerInfo.class);
        }
        System.out.println("customerInfo1 "+customerInfo1.getCourseName());
        return  arrayList;
    }

    /**
     * Helper to convert javaObject to Json and then to String
     * @param arrayList
     * @return
     */
    public String convertDataInJson( ArrayList<CustomerInfo> arrayList){
        JSONArray jsonArray = new JSONArray();
        for(CustomerInfo customerInfo:arrayList){
            Gson gson = new Gson();
            String jsonString = gson.toJson(customerInfo);
            jsonArray.add(jsonString);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",jsonArray);

        return  StringEscapeUtils.unescapeJson(jsonObject.toJSONString()).replace("\"{","{").replace("}\"","}");
    }
}
