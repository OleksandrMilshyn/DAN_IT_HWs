package aqa_hw_10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySearchResultTest extends BaseTest{

    @Test
    public void verifySearchTitle() {

        String wordToFind = "Nobody";

        HomePage homePage = new HomePage();
        homePage.searchField(wordToFind);
        homePage.searchButton();
        homePage.filmIcon();

        FilmPage filmPage = new FilmPage();
        String actualResult = filmPage.filmTitle();

        Assert.assertTrue(actualResult.contains(wordToFind));
    }
}
