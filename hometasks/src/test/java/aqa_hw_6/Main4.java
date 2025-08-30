package aqa_hw_6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static java.lang.String.format;

public class Main4 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2));
        try {
            String mainPhrase = "порожній";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement buttonOfComparison = driver.findElement(By.cssSelector("div.full-width"));
            buttonOfComparison.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.profile-sidebar__section-content")));
            WebElement windowOfComparison = driver.findElement(By.cssSelector("div.profile-sidebar__section-content"));
            String isEmpty = windowOfComparison.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", isEmpty, mainPhrase), isEmpty.contains(mainPhrase));
        }catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
