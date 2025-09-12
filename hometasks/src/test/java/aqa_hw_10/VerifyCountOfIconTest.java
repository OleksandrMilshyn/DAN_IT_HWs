package aqa_hw_10;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCountOfIconTest extends BaseTest{

    @Test
    @Description("This test verify count of icon on Filter Page")
    @Epic("Comparing")
    public void verifyCountOfFilm(){
        int expectedResult = 18;

        HomePage homePage = new HomePage();
        homePage.toFilterPage();

        FilterPage filterPage = new FilterPage();
        int actualResult = filterPage.countOfIcon();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
