package helpers;

import com.protos.CreateEmployeeRequest;

/**
 * Entity class to create request payloads
 */
class EmployeeEntity {

    /**
     * Helper to generate create employee request payloads
     * @param name - name of the employee
     * @param salary - salary of the employee
     * @param age - age of the employee
     * @param id - employeeId
     * @return
     */
    CreateEmployeeRequest createEmployeeRequest(String name,String salary, String age,int id) {
        return CreateEmployeeRequest.newBuilder()
                .setData(CreateEmployeeRequest.CreateEmployeeRequestData.newBuilder()
                        .setAge(age)
                        .setName(name)
                        .setSalary(salary)
                        .setId(id).build())
                .build();
    }

    /**
     * Helper to generate create employee request payloads with default values
     * @return
     */
    CreateEmployeeRequest createEmployeeRequest(){
        return CreateEmployeeRequest.newBuilder()
                .setData(CreateEmployeeRequest.CreateEmployeeRequestData.newBuilder()
                        .setAge(String.valueOf(Constants.DEFAULT_EMPLOYEE_AGE))
                        .setName(Constants.DEFAULT_EMPLOYEE_NAME)
                        .setSalary(String.valueOf(Constants.DEFAULT_EMPLOYEE_SALARY))
                        .setId(Constants.DEFAULT_EMPLOYEE_ID).build())
                .build();
    }
}
