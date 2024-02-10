package utils.httpRequests;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.CommonUtils.CommonConstants;
import utils.CommonUtils.TestLogger;
import utils.CommonUtils.XMLConfigReader;

import java.io.IOException;
import java.util.Map;

/**
 * Http client to make http requests
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class HttpRequestUtil extends TestLogger {
    private static final HttpRequestUtil instance = new HttpRequestUtil();

    // private constructor to avoid client applications using the constructor
    private HttpRequestUtil(){}

    public static HttpRequestUtil getInstance() {
        return instance;
    }

    private XMLConfigReader xmlConfigReader = XMLConfigReader.getInstance();

    /**
     * Factory to make http request
     * @param baseUri
     * @param method
     * @return
     */
    public String makeRequest(String baseUri, Method method,String endpoint) {
        return makeHttpRequest(baseUri,method,endpoint);
    }

    /**
     *
     * @param baseUri
     * @param method
     * @param requestBody
     * @return
     * @throws IOException
     */
    public String makeRequest(String baseUri, Method method,String requestBody,String endpoint) throws IOException {
        return makeHttpRequest(baseUri,method,requestBody,endpoint);
    }

    private String makeHttpRequest(String serviceName, Method method,String endpoint){
        Map<String, String> serviceDetails = xmlConfigReader.fetchServiceDetails(serviceName);
        RestAssured.baseURI = serviceDetails.get(String.valueOf(CommonConstants.CONFIGS.URL))+endpoint;
        RequestSpecification httpRequest = RestAssured.given().log().all();
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }

    public String makeHttpRequest(String serviceName, Method method,String requestBody,String endpoint) throws IOException {
        Map<String, String> serviceDetails = xmlConfigReader.fetchServiceDetails(serviceName);
        RestAssured.baseURI = serviceDetails.get(String.valueOf(CommonConstants.CONFIGS.URL))+endpoint;
        RequestSpecification httpRequest = RestAssured.given().log().all();
        httpRequest.body(requestBody).log().all();
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }
}
