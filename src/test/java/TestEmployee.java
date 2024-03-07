import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import helpers.employees.Constants;
import helpers.employees.EmployeeDataManager;
import helpers.employees.EmployeeFactory;
import helpers.employees.EmployeeValidator;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Response;
import org.testng.Assert;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pojo.CustomerInfo;
import utils.CommonUtils.TestLogger;
import utils.sql.SqlEntity;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class TestEmployee extends TestLogger {
    private EmployeeDataManager employeeDataManager = EmployeeDataManager.getInstance();
    EmployeeFactory employeeFactory = EmployeeFactory.getInstance();
    EmployeeValidator employeeValidator = EmployeeValidator.getInstance();
    SqlEntity sqlEntity = SqlEntity.getInstance();

//    @Test(description = "Test case to create employee and validate data", groups = "regression")
    public void createEmployeeTest() throws IOException {
        CreateEmployeeRequest requestPayload = employeeDataManager.createEmployeeRequest("test","123","23",25);
        CreateEmployeeResponse createEmployeeResponse = employeeFactory.createEmployee(requestPayload);
        CreateEmployeeResponse expectedResponse = CreateEmployeeResponse.newBuilder().setStatus("success")
                .setData(CreateEmployeeResponse.CreateEmployeeResponseData.newBuilder()).setMessage("Successfully! Record has been added.").build();
        assertThat("createEmployeeResponse", matchesJsonSchemaInClasspath("1customerInfo.json"));
        employeeValidator.validateEmployeeAge(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_AGE));
        employeeValidator.validateEmployeeSalary(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_SALARY));
        employeeValidator.validateEmployeeName(createEmployeeResponse, Constants.DEFAULT_EMPLOYEE_NAME);
        employeeValidator.validateEmployeeId(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_ID));
    }

//    @Test(description = "Test case to get employee details and validate data",groups = "regression")
    public void getEmployeeTest() throws IOException {
        GetEmployeeData getEmployeeData = employeeFactory.getEmployee(String.valueOf("1"));
        employeeValidator.validateEmployeeAge(getEmployeeData, Constants.DEFAULT_EMPLOYEE_AGE);
        employeeValidator.validateEmployeeSalary(getEmployeeData, Constants.DEFAULT_EMPLOYEE_SALARY);
        employeeValidator.validateEmployeeName(getEmployeeData, Constants.DEFAULT_EMPLOYEE_NAME);
        employeeValidator.validateEmployeeId(getEmployeeData, Constants.DEFAULT_EMPLOYEE_ID);
    }

    @Test(description = "Test case to get employee details and validate data",groups = "regression")
    public void getEmployeeTest1() throws IOException, ExecutionException, InterruptedException {
//        Dsl.asyncHttpClient().preparePost("").addBodyPart("").execute();
        Future<Response> responseFuture = Dsl.asyncHttpClient().prepareGet("https://reqres.in/api/users?delay=10").execute();
        Response response = responseFuture.get();
        System.out.println("response "+response);
        System.out.println("response "+response.getStatusCode());
    }
}
