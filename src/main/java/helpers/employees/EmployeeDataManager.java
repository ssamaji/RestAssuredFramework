package helpers.employees;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.protos.CreateEmployeeRequest;
import org.apache.commons.text.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import pojo.CustomerInfo;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

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

    public String await() {
        AtomicReference<String> apiResponse = null;
        String apiUrl = "https://api.example.com/data";

        // Set the interval for API calls (e.g., every 2 seconds)
        long apiCallIntervalSeconds = 2;

        // Create a scheduled executor service
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Create a CompletableFuture that completes with the API response
        CompletableFuture<Void> apiCallFuture = CompletableFuture.supplyAsync(() -> {
            while (true) {
                try {
                    // Make the API call
                    apiResponse.set(makeApiCall(apiUrl));

                    // Sleep for the specified interval
                    TimeUnit.SECONDS.sleep(apiCallIntervalSeconds);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, scheduler);

        // Use the join() method to wait for the completion (optional)
        apiCallFuture.join();

        // Shutdown the scheduler when done (optional)
        scheduler.shutdown();
        return apiResponse.get();
    }
    private static String makeApiCall(String apiUrl) throws Exception {
        // Create an asynchronous HTTP client
        HttpClient httpClient = HttpClient.newHttpClient();

        // Make the API call
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Check if the response meets your expected criteria
        if (response.statusCode() == 200 && response.body().contains("expectedValue")) {
            System.out.println("API Response: " + response.body());
            return response.body();
        } else {
            throw new RuntimeException("Unexpected response");
        }
    }
}
