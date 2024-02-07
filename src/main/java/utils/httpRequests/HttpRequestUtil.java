package utils.httpRequests;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Http client to make http requests
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class HttpRequestUtil {
    /**
     * Factory to make http request
     * @param baseUri
     * @param method
     * @return
     * @throws IOException
     */
    public static String makeRequest(String baseUri, Method method) throws IOException {
        RestAssured.baseURI = baseUri;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }

    /**
     *
     * @param baseUri
     * @param method
     * @param requestBody
     * @return
     * @throws IOException
     */
    public static String makeRequest(String baseUri, Method method,String requestBody) throws IOException {
        RestAssured.baseURI = baseUri;
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.body(requestBody);
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }
}
