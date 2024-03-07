package utils.httpRequests;

import io.restassured.http.Method;

import java.util.Map;

public interface HttpRequests {
//   abstract String makeRequest(String serviceName, Method method, String endpoint, Map<String, Object> pathParams,
//                               Map<String, Object> queryParams,String body,String headers);

    abstract String makeRequest(String serviceName, Method method, String endpoint,
                       Map<String, Object> pathParams, Map<String, Object> queryParams, String body,
                       Map<String, Object> headers);

//    abstract String makeRequest(String serviceName, Method method, String endpoint, String body);

}
