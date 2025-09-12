package aqa_hw_10;

import org.junit.Assert;
import org.testng.annotations.Test;

public class VerifyFilterFunctionTest extends BaseTest{

    @Test
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
