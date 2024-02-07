package helpers;

import com.protos.CreateEmployeeRequest;

/**
 * Data Manager class which will have helpers (retrieval of data)
 */
public class EmployeeDataManager {
    private static final EmployeeDataManager instance = new EmployeeDataManager();

    // private constructor to avoid client applications using the constructor
    private EmployeeDataManager(){}

    public static EmployeeDataManager getInstance() {
        return instance;
    }

    private EmployeeEntity entity = new EmployeeEntity();


    /**
     *
     * @param name
     * @param salary
     * @param age
     * @param id
     * @return
     */
    public CreateEmployeeRequest createEmployeeRequest(String name, String salary, String age, int id) {
        return entity.createEmployeeRequest(name,salary,age,id);
    }

    /**
     *
     * @return
     */
    public CreateEmployeeRequest createEmployeeRequest(){
        return entity.createEmployeeRequest();
    }
}
