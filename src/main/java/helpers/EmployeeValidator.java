package helpers;

import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import org.testng.asserts.SoftAssert;

/**
 * Validator class to validate api responses
 */
public class EmployeeValidator {
    private static final EmployeeValidator instance = new EmployeeValidator();

    // private constructor to avoid client applications using the constructor
    private EmployeeValidator(){}

    public static EmployeeValidator getInstance() {
        return instance;
    }

    /**
     * Validator to validate employee name in create employee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeName(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getName(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate employee age in create employee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeAge(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getAge(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate salary in create employee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeSalary(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getAge(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate employee id in create employee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeId(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getId(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate employee name in getEmployee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeName(GetEmployeeData response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getEmployeeName(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate employee age in getEmployee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeAge(GetEmployeeData response,int expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getEmployeeAge(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate salary in getEmployee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeSalary(GetEmployeeData response,int expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getEmployeeSalary(),expectedValue);
        softAssert.assertAll();
    }

    /**
     * Validator to validate employee id in getEmployee request
     * @param response
     * @param expectedValue
     */
    public static void validateEmployeeId(GetEmployeeData response, int expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getId(),expectedValue);
        softAssert.assertAll();
    }
}
