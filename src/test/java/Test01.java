import com.google.protobuf.util.JsonFormat;
import com.protos.BookingApiResponse;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.utility.HttpRequestUtil;
import org.testng.annotations.Test;

import java.io.IOException;

public class Test01 {

    public static void main(String[] args) throws IOException {
        test();
    }

    @Test
    public static void test() throws IOException {
        String baseurl = "https://dummy.restapiexample.com/api/v1/employee/1";
        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();
        RequestSpecification httpRequest = RestAssured.given();
        String response = httpRequestUtil.makeRequest(baseurl,Method.GET,httpRequest);
        BookingApiResponse.Builder structBuilder = BookingApiResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(response, structBuilder);
        System.out.println(" structBuilder "+structBuilder);
//        BookingApiResponse bookingApiResponse = BookingApiResponse().toBuilder().build();
//        bookingApiResponse.getItems(0);
//        executeHttpRequest("https://restful-booker.herokuapp.com/booking");

    }
}
