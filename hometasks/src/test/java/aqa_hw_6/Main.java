package aqa_hw_6;

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
            String wordForFind = "Samsung";
            String expectedNumber = "1";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchButtonToFind = driver.findElement(By.cssSelector("[type='text']"));
            searchButtonToFind.sendKeys(wordForFind);

            WebElement searchButton = driver.findElement(By.cssSelector("button.search__btn"));
            searchButton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.list-item")));
            WebElement phoneItems = driver.findElement(By.cssSelector("div.list-item"));
            phoneItems.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.action__wrapper")));
            WebElement likeButton = driver.findElement(By.cssSelector("div.action__wrapper"));
            likeButton.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.action__title")));
            WebElement isLikeChecking = driver.findElement(By.cssSelector("div.action__title"));
            String actualNumber = isLikeChecking.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> number", actualNumber, expectedNumber), actualNumber.contains(expectedNumber));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}