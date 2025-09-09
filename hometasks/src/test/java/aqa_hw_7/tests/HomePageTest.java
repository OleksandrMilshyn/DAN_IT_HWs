package aqa_hw_7.tests;

import aqa_hw_7.listeners.Listener;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class HomePageTest extends BaseTest{

    @Test
    public void verifyHomePage() {

        WebElement userButton = getDriver().findElement(By.cssSelector("div.user-info"));
        userButton.click();

        WebElement registrationButton = getDriver().findElement(By.cssSelector("[class='template-page__link']"));
        registrationButton.click();

        WebElement imgHotLine = getDriver().findElement(By.cssSelector("a.template-page__logo img"));
        imgHotLine.click();

        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("Is not a home page", "https://hotline.ua/", currentUrl);
    }
}
