package helpers;

import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;

import java.io.IOException;

/**
 * factory which will http requests helpers
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class EmployeeFactory {
    private static final EmployeeFactory instance = new EmployeeFactory();

    // private constructor to avoid client applications using the constructor
    private EmployeeFactory(){}

    public static EmployeeFactory getInstance() {
        return instance;
    }
    private final EmployeeHelper employeeHelper = new EmployeeHelper();

    /**
     * helper to create employee
     */

    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest requestPayload) throws IOException {
       return employeeHelper.createEmployee(requestPayload);
    }

    /**
     * Helper to get employee data
     * @param employeeId - employee id
     * @return
     * @throws IOException
     */
    public GetEmployeeData getEmployee(String employeeId) throws IOException {
       return employeeHelper.getEmployee(employeeId);
    }
}
