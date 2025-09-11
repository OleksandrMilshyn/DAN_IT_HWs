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

public class Main5 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2));
        try {
            String mainPhrase = "Популярні товари";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.button-menu-main")));
            WebElement catalogButton = driver.findElement(By.cssSelector("div.button-menu-main"));
            catalogButton.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='898']")));
            WebElement autoAndMotoList= driver.findElement(By.cssSelector("[data-id='898']"));
            autoAndMotoList.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.block-popular__header-text")));
            WebElement listOfPopularItems = driver.findElement(By.cssSelector("span.block-popular__header-text"));
            String isListLocated = listOfPopularItems.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", isListLocated, mainPhrase), isListLocated.contains(mainPhrase));

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.button-menu-main")));
            WebElement catalogButtonSecondTime = driver.findElement(By.cssSelector("div.button-menu-main"));
            catalogButtonSecondTime.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='193']")));
            WebElement computersList= driver.findElement(By.cssSelector("[data-id='193']"));
            computersList.click();

            fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.block-popular__header-text")));
            WebElement listOfPopularItemsSecondTime = driver.findElement(By.cssSelector("span.block-popular__header-text"));
            String isListLocatedSecondTime = listOfPopularItemsSecondTime.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", isListLocatedSecondTime, mainPhrase), isListLocatedSecondTime.contains(mainPhrase));

        }catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}