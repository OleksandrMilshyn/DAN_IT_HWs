package aqa_hw_10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyFavoritesFunctionTest extends BaseTest{

    @Test
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
