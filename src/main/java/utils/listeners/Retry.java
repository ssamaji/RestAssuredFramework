package utils.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @author ssamaji.
 * Created Feb 07, 2024.
 */
public class Retry implements IRetryAnalyzer {
    private        int count  = 0;
    private static int maxTry = 2; //Run the failed test 3 times
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {                     //Check if test not succeed
            if (count < maxTry) {                           //Check if maxTry count is reached
                count++;                                    //Increase the maxTry count by 1
                iTestResult.setStatus(ITestResult.FAILURE); //Mark test as failed and take base64Screenshot
                extendReportsFailOperations(iTestResult);   //ExtentReports fail operations
                return true;                                //Tells TestNG to re-run the test
            }
        } else {
            iTestResult.setStatus(ITestResult.SUCCESS);     //If test passes, TestNG marks it as passed
        }
        return false;
    }
    public void extendReportsFailOperations(ITestResult iTestResult) {
    }
}
