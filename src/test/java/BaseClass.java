import org.testng.annotations.*;

public class BaseClass {

    @BeforeTest
    public void test(){
        System.out.println("BeforeTest base class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest base class");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass base class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass base class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite base class");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite base class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod base class");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod base class");
    }
}
