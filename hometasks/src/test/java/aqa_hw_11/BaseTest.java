package aqa_hw_11;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static aqa_hw_11.TestRailController.publishResults;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected int testCaseId;

    @BeforeMethod
    public void openSite(){open("https://uaserials.my/");}

    @AfterMethod
    public void publishTestResultsToTestRail(ITestResult testResult) {
        if(testResult.getStatus() == ITestResult.SUCCESS){
            publishResults(1, testCaseId);
        } else {
            publishResults(5, testCaseId);
        }
    }
}
