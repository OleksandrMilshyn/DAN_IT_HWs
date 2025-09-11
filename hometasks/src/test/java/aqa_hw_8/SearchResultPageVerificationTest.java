package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SearchResultPageVerificationTest extends BaseTest{

    @Test
    public void verifyProductPage() throws InterruptedException {

        String wordToFind = "Samsung";
        int expectedCountOfProducts = 81;

        HomePage homePage = new HomePage(getDriver());
        homePage.fieldForWordToSearch(wordToFind);
        sleep(3000);

        homePage.clickToButtonToSearch();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        int actualCountOfProducts = searchResultPage.countOfProducts();

        Assert.assertEquals(actualCountOfProducts, expectedCountOfProducts);
    }
}
