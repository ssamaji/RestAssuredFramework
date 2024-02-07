package org.example.utility;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class HttpRequestUtil {
    /**
     * Factory to make http request
     * @param baseUri
     * @param method
     * @param request
     * @return
     * @throws IOException
     */
    public static String makeRequest(String baseUri, Method method, RequestSpecification request) throws IOException {
        RestAssured.baseURI = baseUri;
        Response response = request.request(method);
        return response.getBody().asString();
    }
}
