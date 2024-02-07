package helpers;

import com.protos.CreateEmployeeResponse;
import com.protos.GetEmployeeData;
import lombok.Getter;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class EmployeeValidator {
    private static final EmployeeValidator instance = new EmployeeValidator();

    // private constructor to avoid client applications using the constructor
    private EmployeeValidator(){}

    public static EmployeeValidator getInstance() {
        return instance;
    }

    public static void validateEmployeeName(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getName(),expectedValue);
        softAssert.assertAll();
    }
    public static void validateEmployeeAge(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getAge(),expectedValue);
        softAssert.assertAll();
    }
    public static void validateEmployeeSalary(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getAge(),expectedValue);
        softAssert.assertAll();
    }
    public static void validateEmployeeId(CreateEmployeeResponse response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getData().getId(),expectedValue);
        softAssert.assertAll();
    }

    public static void validateEmployeeName(GetEmployeeData response,String expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getEmployeeName(),expectedValue);
        softAssert.assertAll();
    }
    public static void validateEmployeeAge(GetEmployeeData response,int expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getEmployeeAge(),expectedValue);
        softAssert.assertAll();
    }
    public static void validateEmployeeSalary(GetEmployeeData response,int expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getEmployeeSalary(),expectedValue);
        softAssert.assertAll();
    }
    public static void validateEmployeeId(GetEmployeeData response, int expectedValue){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getData().getId(),expectedValue);
        softAssert.assertAll();
    }
}
