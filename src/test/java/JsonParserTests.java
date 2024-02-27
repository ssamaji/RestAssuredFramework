import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;
import pojo.CustomerInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonParserTests {

    @Test
    public void fetchIdFromJsonUsingObjectMapper(){
        String jsonString = "{\"person\":[{\"id\":1,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}},{\"id\":2,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}},{\"id\":31,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}},{\"id\":13,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}}]}";
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            //convert string to json
            JsonNode jsonNode = objectMapper.readTree(jsonString);
            //Convert String jsonString to map
            HashMap<String, String> resultMap = objectMapper.readValue(jsonString, HashMap.class);
            //convert json to string
            String stringJson = objectMapper.writeValueAsString(resultMap);
            //convert json to pojo
            CustomerInfo myPojo = objectMapper.readValue(jsonString, CustomerInfo.class);


            // Fetch data from the JSON
            System.out.println("size: " + jsonNode.get("person"));
            List<Integer> ids = new ArrayList<>();
            List<String> names = new ArrayList<>();
            List<String> city = new ArrayList<>();
            for(int i=0;i<jsonNode.get("person").size();i++){
                JsonNode node = jsonNode.get("person").get(i);
                ids.add(node.get("id").asInt());
                names.add(node.get("name").asText());
                city.add(node.get("address").get("city").asText());
            }
            // Print fetched data
            System.out.println("ID: " + ids);
            System.out.println("Name: " + names);
            System.out.println("City: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void fetchIdFromJsonUsingSimleJson(){
        public static void main(String[] args){
        String jsonString = "{\"person\":[{\"id\":1,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}},{\"id\":2,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}},{\"id\":31,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}},{\"id\":13,\"name\":\"John Doe\",\"age\":30,\"address\":{\"city\":\"Example City\",\"zipCode\":\"12345\"}}]}";

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonRoot = (JSONObject) parser.parse(jsonString);
            JSONArray personArray = (JSONArray) jsonRoot.get("person");

            List<Long> ids = new ArrayList<>();
            List<String> names = new ArrayList<>();
            List<String> city = new ArrayList<>();
            for (Object personObject : personArray) {
                JSONObject person = (JSONObject) personObject;
                ids.add((Long) person.get("id"));
                names.add((String) person.get("name"));

                JSONObject addressObject = (JSONObject) person.get("address");
                city.add((String) addressObject.get("city"));
            }
            System.out.println("size "+personArray.get(0));
            System.out.println("ID: " + ids);
            System.out.println("Name: " + names);
            System.out.println("City: " + city);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
