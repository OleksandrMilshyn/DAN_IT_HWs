package aqa_hw_7;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {

    @Test
    public void verifyLoginField() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        try {
            WebElement userButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.user-info")));
            userButton.click();

            WebElement imgHotLine = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[src='/frontend/_nuxt/img/logo-smart-shopping.b026975.svg']")));
            imgHotLine.click();

            String currentUrl = driver.getCurrentUrl();
            Assert.assertEquals("Is not a home page", "https://hotline.ua/", currentUrl);
        }
        finally {
            driver.quit();
        }
    }
}
