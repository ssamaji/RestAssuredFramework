package helpers.employees;

import com.google.protobuf.util.JsonFormat;
import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import helpers.ServiceName;
import io.restassured.http.Method;
import utils.CommonUtils.TestLogger;
import utils.httpRequests.HttpRequestUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Helper class which will have actual http request implementation
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
class EmployeeHelper extends TestLogger {
    private HttpRequestUtil httpRequestUtil = HttpRequestUtil.getInstance();

    /**
     * Helper to make create employee request
     * @param requestPayload
     * @return
     * @throws IOException
     */
    CreateEmployeeResponse createEmployee(CreateEmployeeRequest requestPayload) throws IOException {
        String request = JsonFormat.printer().print(requestPayload);

//        (String serviceName, Method method, String endpoint,
//                Map<String, Object> pathParams, Map<String, Object> queryParams, String body,
//                Map<String, Object> headers)

        String responseString = httpRequestUtil.makeRequest(ServiceName.DUMMY_SERVICE.value,
                Method.POST,EmployeeEndpoints.CREATE_EMPLOYEE,new HashMap<>(),new HashMap<>(),request,new HashMap<>());
//        String responseString = httpRequestUtil.makeRequest(ServiceName.DUMMY_SERVICE.value,
//                Method.POST,request,EmployeeEndpoints.CREATE_EMPLOYEE);
        logInfo(" response "+responseString);
        CreateEmployeeResponse.Builder employeeResponse = CreateEmployeeResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, employeeResponse);

        return  employeeResponse.build();
    }

    /**
     * Helper to get employee data
     * @param employeeId
     * @return
     * @throws IOException
     */
    GetEmployeeData getEmployee(String employeeId) throws IOException {
        Map<String,Object> pathParam = new HashMap<>();
        pathParam.put("{employeeId}",employeeId);
//        String responseString = httpRequestUtil.makeRequest(String.valueOf(ServiceName.DUMMY_SERVICE.value),
//                Method.GET,EmployeeEndpoints.GET_EMPLOYEE.replace("{employeeId}",employeeId)
//                ,pathParam,new HashMap<>(),null,new HashMap<>());

        String responseString = httpRequestUtil.makeRequest(ServiceName.DUMMY_SERVICE.value,
                Method.GET,EmployeeEndpoints.GET_EMPLOYEE,pathParam,new HashMap<>(),null,new HashMap<>());

        GetEmployeeData.Builder getEmployeeDataResponse = GetEmployeeData.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, getEmployeeDataResponse);
        return getEmployeeDataResponse.build();
    }
}
