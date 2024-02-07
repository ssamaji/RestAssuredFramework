import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import helpers.Constants;
import helpers.EmployeeDataManager;
import helpers.EmployeeFactory;
import helpers.EmployeeValidator;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestEmployee {
    private static final EmployeeDataManager employeeDataManager = EmployeeDataManager.getInstance();
    private static final EmployeeFactory employeeFactory = EmployeeFactory.getInstance();
    private static final EmployeeValidator employeeValidator = EmployeeValidator.getInstance();

    @Test(description = "Test case to create employee and validate data")
    public static void createEmployeeTest() throws IOException {
        CreateEmployeeRequest requestPayload = employeeDataManager.createEmployeeRequest("test","123","23",25);
        CreateEmployeeResponse createEmployeeResponse = employeeFactory.createEmployee(requestPayload);
        employeeValidator.validateEmployeeAge(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_AGE));
        employeeValidator.validateEmployeeSalary(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_SALARY));
        employeeValidator.validateEmployeeName(createEmployeeResponse, Constants.DEFAULT_EMPLOYEE_NAME);
        employeeValidator.validateEmployeeId(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_ID));
    }

    @Test(description = "Test case to get employee details and validate data")
    public static void getEmployeeTest() throws IOException {
        GetEmployeeData getEmployeeData = employeeFactory.getEmployee(String.valueOf("1"));
        employeeValidator.validateEmployeeAge(getEmployeeData, Constants.DEFAULT_EMPLOYEE_AGE);
        employeeValidator.validateEmployeeSalary(getEmployeeData, Constants.DEFAULT_EMPLOYEE_SALARY);
        employeeValidator.validateEmployeeName(getEmployeeData, Constants.DEFAULT_EMPLOYEE_NAME);
        employeeValidator.validateEmployeeId(getEmployeeData, Constants.DEFAULT_EMPLOYEE_ID);
    }
}
