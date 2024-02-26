import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import helpers.*;
import org.apache.commons.text.StringEscapeUtils;
import org.testng.Assert;
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

/**
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class TestEmployee extends TestLogger {
    private EmployeeDataManager employeeDataManager = EmployeeDataManager.getInstance();
    EmployeeFactory employeeFactory = EmployeeFactory.getInstance();
    EmployeeValidator employeeValidator = EmployeeValidator.getInstance();
    SqlEntity sqlEntity = SqlEntity.getInstance();

//    @Test(description = "Test case to create employee and validate data")
    public void createEmployeeTest() throws IOException {
        CreateEmployeeRequest requestPayload = employeeDataManager.createEmployeeRequest("test","123","23",25);
        CreateEmployeeResponse createEmployeeResponse = employeeFactory.createEmployee(requestPayload);
        CreateEmployeeResponse expectedResponse = CreateEmployeeResponse.newBuilder().setStatus("success")
                .setData(CreateEmployeeResponse.CreateEmployeeResponseData.newBuilder()).setMessage("Successfully! Record has been added.").build();
        assertThat(createEmployeeResponse, equalTo(expectedResponse));
        employeeValidator.validateEmployeeAge(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_AGE));
        employeeValidator.validateEmployeeSalary(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_SALARY));
        employeeValidator.validateEmployeeName(createEmployeeResponse, Constants.DEFAULT_EMPLOYEE_NAME);
        employeeValidator.validateEmployeeId(createEmployeeResponse, String.valueOf(Constants.DEFAULT_EMPLOYEE_ID));
    }

//    @Test(description = "Test case to get employee details and validate data")
    public void getEmployeeTest() throws IOException {
        GetEmployeeData getEmployeeData = employeeFactory.getEmployee(String.valueOf("1"));
        employeeValidator.validateEmployeeAge(getEmployeeData, Constants.DEFAULT_EMPLOYEE_AGE);
        employeeValidator.validateEmployeeSalary(getEmployeeData, Constants.DEFAULT_EMPLOYEE_SALARY);
        employeeValidator.validateEmployeeName(getEmployeeData, Constants.DEFAULT_EMPLOYEE_NAME);
        employeeValidator.validateEmployeeId(getEmployeeData, Constants.DEFAULT_EMPLOYEE_ID);
    }


//    @Parameters("browser")
//    @Test(description = "dataParameter")
    public void dataParameter() throws IOException, ClassNotFoundException, SQLException {
        Assert.assertEquals("chrome","chrome");
        ArrayList<CustomerInfo> list =  employeeDataManager.setSqlData(sqlEntity.executeQuery("Business","select * from CustomerInfo;"));
        String data= employeeDataManager.convertDataInJson(list);
        System.out.println(" customerInfo "+ data);
    }

//    @Test(description = "dataParameter" ,dataProvider = "getData", dataProviderClass = DataProviderClass.class)
    @Test(description = "dataParameter")
            public void dataProviderTests() throws IOException {
        int actual = 10;
        int actualValue = actual+20;
        Assert.assertEquals(actualValue,30);
    }
}
