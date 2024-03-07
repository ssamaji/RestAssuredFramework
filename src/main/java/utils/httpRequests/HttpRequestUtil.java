package utils.httpRequests;


import com.protos.CreateBookingResponse;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.asynchttpclient.Dsl;
import utils.CommonUtils.CommonConstants;
import utils.CommonUtils.TestLogger;
import utils.CommonUtils.XMLConfigReader;
import io.restassured.path.xml.XmlPath;
import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.restassured.path.xml.XmlPath.CompatibilityMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Http client to make http requests
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class HttpRequestUtil extends TestLogger implements HttpRequests{
    private static final HttpRequestUtil instance = new HttpRequestUtil();

    // private constructor to avoid client applications using the constructor
    private HttpRequestUtil(){}

    public static HttpRequestUtil getInstance() {
        return instance;
    }

    private XMLConfigReader xmlConfigReader = XMLConfigReader.getInstance();

    /**
     * Factory to make http request
//     * @param baseUri
     * @param method
     * @return
     */
    public String makeRequest(String baseUri, Method method,String endpoint) {
        return makeHttpRequest(baseUri,method,endpoint);
    }

    @Override
    public String makeRequest(String serviceName, Method method, String endpoint,
                              Map<String, Object> pathParams, Map<String, Object> queryParams, String body,
                              Map<String, Object> headers) {

        Map<String, String> serviceDetails = xmlConfigReader.fetchServiceDetails(serviceName);
        RestAssured.baseURI = serviceDetails.get(String.valueOf(CommonConstants.CONFIGS.URL))+endpoint;
        RequestSpecification httpRequest1 = RestAssured.given()
                .auth().oauth("consumerKey", "consumerSecret", "accessToken","secretToken")
                .headers(headers)
                .body(body)
                .pathParams(pathParams)
                .queryParams(queryParams).log().all();
        //code to validate schema validation
        httpRequest1.request(method).then().assertThat().body(matchesJsonSchemaInClasspath(""));
        //Code to convert json response to CreateBookingResponse object
        httpRequest1.request(method).as(CreateBookingResponse.class);
        return httpRequest1.request(method).getBody().asString();
    }

    /**
     *
//     * @param baseUri
//     * @param method
//     * @param requestBody
//     * @return
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
    private void dummyHelper(Method method,Map<String, Object> pathParams,Map<String, Object> queryParams){
        Header authorization = new Header("Authorization", "your token");
        List<Header> headerList = new ArrayList<Header>();
        headerList.add(authorization);
        Headers header = new Headers(headerList);
        RestAssured.baseURI ="";
        RequestSpecification httpRequest1 = RestAssured.given()
                .auth().oauth("consumerKey", "consumerSecret", "accessToken","secretToken")
                .headers(header)
                .body("")
                .pathParams(pathParams)
                .queryParams(queryParams);
        Response response1 = httpRequest1.request(method);
    }

    public String makeHttpRequest(String serviceName, Method method,String requestBody,String endpoint) throws IOException {
        Map<String, String> serviceDetails = xmlConfigReader.fetchServiceDetails(serviceName);
        RestAssured.baseURI = serviceDetails.get(String.valueOf(CommonConstants.CONFIGS.URL))+endpoint;
        RequestSpecification httpRequest = RestAssured.given().log().all();
        httpRequest.body(requestBody).log().all();
        Response response = httpRequest.request(method);
        return response.getBody().asString();
    }

    private static String convertJsonToXml(String jsonResponse) {
        // Use XmlPath to convert JSON to XML
        XmlPath xmlPath = new XmlPath(CompatibilityMode.HTML, jsonResponse);
        JsonPath jsonPath = new JsonPath(xmlPath.toString());
        return xmlPath.prettify();
    }
}
