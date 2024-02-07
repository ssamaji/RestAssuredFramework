package helpers;

import com.protos.CreateEmployeeRequest;
import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import lombok.Getter;

import java.io.IOException;

/**
 *
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
     *
     */

    public CreateEmployeeResponse createEmployee(CreateEmployeeRequest requestPayload) throws IOException {
       return employeeHelper.createEmployee(requestPayload);
    }

    /**
     *
     * @param employeeId
     * @return
     * @throws IOException
     */
    public GetEmployeeData getEmployee(String employeeId) throws IOException {
       return employeeHelper.getEmployee(employeeId);
    }
}
