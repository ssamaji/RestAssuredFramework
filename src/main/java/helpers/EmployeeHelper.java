package helpers;

import com.google.protobuf.util.JsonFormat;
import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import io.restassured.http.Method;
import utils.CommonUtils.TestLogger;
import utils.httpRequests.HttpRequestUtil;

import java.io.IOException;

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
        String responseString = httpRequestUtil.makeRequest(ServiceName.DUMMY_SERVICE.value,
                Method.POST,request,EmployeeEndpoints.CREATE_EMPLOYEE);
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
        String responseString = httpRequestUtil.makeRequest(
                ServiceName.DUMMY_SERVICE.value,Method.GET,EmployeeEndpoints.GET_EMPLOYEE.replace("{employeeId}",employeeId));
        GetEmployeeData.Builder getEmployeeDataResponse = GetEmployeeData.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(responseString, getEmployeeDataResponse);
        return getEmployeeDataResponse.build();
    }
}
