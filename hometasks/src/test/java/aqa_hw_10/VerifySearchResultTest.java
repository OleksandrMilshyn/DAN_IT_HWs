package aqa_hw_10;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySearchResultTest extends BaseTest{

    @Test
    @Description("This test is verifies search function")
    @Epic("Search")
    @Feature("Searching function")
    @Link(name = "documentation", url = "https://hotline.ua/")
    public void verifySearchTitle() {

        String wordToFind = "Nobody";

        HomePage homePage = new HomePage();
        homePage.searchField(wordToFind);
        homePage.searchButton();
        homePage.filmIcon();

        MoviePage moviePage = new MoviePage();
        String actualResult = moviePage.filmTitle();

        Assert.assertTrue(actualResult.contains(wordToFind));
    }
}
