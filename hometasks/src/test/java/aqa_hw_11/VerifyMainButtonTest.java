package aqa_hw_11;

import org.junit.Assert;
import org.testng.annotations.Test;

public class VerifyMainButtonTest extends BaseTest{

    @Test
    public void verifyMainButton(){
        testCaseId = 3;
        System.out.println("Third test execution");

        String expectedURL = "https://uaserials.my/";

        HomePage homePage = new HomePage();
        homePage.toFilterPage();

        FilterPage filterPage = new FilterPage();
        filterPage.mainButton();

        Assert.assertTrue(homePage.currentURL().contains(expectedURL));
    }
}
