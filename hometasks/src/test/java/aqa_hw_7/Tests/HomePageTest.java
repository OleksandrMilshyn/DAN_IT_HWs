package aqa_hw_7.Tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test
    public void verifyLoginField() {

        WebElement userButton = getDriver().findElement(By.cssSelector("div.user-info"));
        userButton.click();

        WebElement registrationButton = getDriver().findElement(By.cssSelector("[class='template-page__link']"));
        registrationButton.click();

        WebElement imgHotLine = getDriver().findElement(By.cssSelector("[src='/frontend/_nuxt/img/logo-smart-shopping.b026975.svg']"));
        imgHotLine.click();

        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("Is not a home page", "https://hotline.ua/", currentUrl);
    }
}
