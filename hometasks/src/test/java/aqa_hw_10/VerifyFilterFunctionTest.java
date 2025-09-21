package aqa_hw_10;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import org.junit.Assert;
import org.testng.annotations.Test;

public class VerifyFilterFunctionTest extends BaseTest{

    @Test
    @Description("This test is verifies filter function")
    @Feature("Filter Function")
    @Link(name = "documentation", url = "https://www.olx.ua/uk/")
    @Issue("Jira-5678")
    public void verifyFilterFunction(){

        String expectedTitle = "Netflix";

        HomePage homePage = new HomePage();
        homePage.toFilterPage();

        FilterPage filterPage = new FilterPage();
        filterPage.fieldOfTVOptions();
        filterPage.listOfTVCannels();
        filterPage.searchButton();
        filterPage.toMoviePage();

        MoviePage moviePage = new MoviePage();
        String actualTitle = moviePage.checkTVTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
