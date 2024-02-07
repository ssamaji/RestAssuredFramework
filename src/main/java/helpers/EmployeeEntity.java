package helpers;

import com.protos.CreateEmployeeRequest;

/**
 *
 */
class EmployeeEntity {
    /**
     *
     * @param name
     * @param salary
     * @param age
     * @param id
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
     *
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
