package helpers;

import com.google.protobuf.util.JsonFormat;
import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import io.restassured.http.Method;
import org.example.utils.httpRequests.HttpRequestUtil;

import java.io.IOException;

/**
 *
 */
class EmployeeHelper {
    HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

    /**
     *
     * @param requestPayload
     * @return
     * @throws IOException
     */
    CreateEmployeeResponse createEmployee(CreateEmployeeRequest requestPayload) throws IOException {
        String request = JsonFormat.printer().print(requestPayload);
        String responseString = httpRequestUtil.makeRequest(ServiceName.EMPLOYEE_SERVICE.value+EmployeeEndpoints.CREATE_EMPLOYEE,
                Method.POST,request);
        System.out.println(" response "+responseString);
        CreateEmployeeResponse.Builder employeeResponse = CreateEmployeeResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, employeeResponse);
        return  employeeResponse.build();
    }

    /**
     *
     * @param employeeId
     * @return
     * @throws IOException
     */
    GetEmployeeData getEmployee(String employeeId) throws IOException {
        String responseString = HttpRequestUtil.makeRequest(
                ServiceName.EMPLOYEE_SERVICE.value+EmployeeEndpoints.GET_EMPLOYEE.replace("{employeeId}",employeeId),Method.GET);
        GetEmployeeData.Builder getEmployeeDataResponse = GetEmployeeData.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, getEmployeeDataResponse);
        return getEmployeeDataResponse.build();
    }
}
