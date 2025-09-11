package aqa_hw_9;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultPageVerificationTest extends BaseTest{

    @Test
    public void verifyProductPage() {

        String wordToFind = "Samsung";
        int expectedCountOfProducts = 81;

        HomePage homePage = new HomePage();
        homePage.enterTextIntoSearchField(wordToFind);

        homePage.clickOnButtonToSearch();

        SearchResultPage searchResultPage = new SearchResultPage();
        int actualCountOfProducts = searchResultPage.countOfProducts();

        Assert.assertEquals(actualCountOfProducts, expectedCountOfProducts);
    }
}

