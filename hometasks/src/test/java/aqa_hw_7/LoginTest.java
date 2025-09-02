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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            String incorrectLogin = "fuu";

            WebElement userButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.user-info")));
            userButton.click();

            WebElement loginField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
            loginField.sendKeys(incorrectLogin);

            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
            submitButton.click();

            WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.error")));
            Assert.assertTrue("The Error is not appear", error.isDisplayed());
        }
        finally {
            driver.quit();
        }
    }
}
