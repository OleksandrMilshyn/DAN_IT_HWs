package aqa_hw_10;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyFavoritesFunctionTest extends BaseTest{

    @Test
    @Description("This test is verifies favorites function")
    @Epic("Comparing")
    @Feature("Favorites Function")
    @Issue("Jira-5678")
    public void verifyAddToFavorites(){
        String expectedTitle = "Додано";

        HomePage homePage = new HomePage();
        homePage.filmIcon();

        MoviePage moviePage = new MoviePage();
        moviePage.addToFavoritesButton();

        String actualTitle = moviePage.favoritesTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }
}
