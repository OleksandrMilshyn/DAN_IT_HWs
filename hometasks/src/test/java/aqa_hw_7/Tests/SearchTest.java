package aqa_hw_7.Tests;

import aqa_hw_7.dataProvider.ProviderData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class SearchTest extends BaseTest {

    @Test (dataProvider = "getSearchData", dataProviderClass = ProviderData.class)
    public void verifySearching(String searchWord, String expectedTitle) throws InterruptedException {

        WebElement searchField = getDriver().findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(searchWord);

        sleep(3000);

        WebElement enterButton = getDriver().findElement(By.cssSelector("button.search__btn"));
        enterButton.click();

        WebElement titleElement = getDriver().findElement(By.cssSelector("[class='brand__products-title text-xx-lg']"));
        String actualSearchingResult = titleElement.getText();

        Assert.assertEquals(expectedTitle, actualSearchingResult);
    }

    @Test (dataProvider = "getIncorrectSearching", dataProviderClass = ProviderData.class)
    public void verifySearchingIncorrectData(String searchWord, String expectedTitle) throws InterruptedException {

        WebElement searchField = getDriver().findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(searchWord);

        sleep(3000);

        WebElement enterButton = getDriver().findElement(By.cssSelector("button.search__btn"));
        enterButton.click();

        WebElement titleElement = getDriver().findElement(By.cssSelector("[class='brand__products-title text-xx-lg']"));
        String actualSearchingResult = titleElement.getText();

        Assert.assertEquals(expectedTitle, actualSearchingResult);
    }
}
