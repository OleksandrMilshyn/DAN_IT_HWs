package aqa_hw_5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.String.format;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        try {
            String wordToFind = "Samsung";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchButtonToFind = driver.findElement(By.cssSelector("[type='text']"));
            searchButtonToFind.sendKeys(wordToFind);

            WebElement searchButton = driver.findElement(By.cssSelector("button.search__btn"));
            searchButton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.search__title")));
            WebElement searchNewFindElement = driver.findElement(By.cssSelector("div.search__title"));
            String samsungText = searchNewFindElement.getText();


            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", samsungText, wordToFind), samsungText.contains(wordToFind));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}