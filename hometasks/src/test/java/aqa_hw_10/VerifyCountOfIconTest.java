package aqa_hw_10;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCountOfIconTest extends BaseTest{

    @Test
    public void verifyCountOfFilm(){
        int expectedResult = 18;

        HomePage homePage = new HomePage();
        homePage.toFilterPage();

        FilterPage filterPage = new FilterPage();
        int actualResult = filterPage.countOfIcon();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
