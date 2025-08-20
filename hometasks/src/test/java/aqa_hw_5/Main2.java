package aqa_hw_5;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        int indexOfTheSecondLanguage = 1;
        String wordToFind = "RU";

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        try {
            driver.get("https://hotline.ua/");
            WebElement buttonLanguage = driver.findElement(By.cssSelector("div.lang-button"));
            buttonLanguage.click();

            List<WebElement> languages = driver.findElements(By.cssSelector("div.lang-item"));

            WebElement secondLanguage = languages.get(indexOfTheSecondLanguage);
            secondLanguage.click();

            buttonLanguage = driver.findElement(By.cssSelector("div.lang-button"));
            Assert.assertTrue(buttonLanguage.getText().contains(wordToFind));
        } finally {
            driver.quit();
        }
    }
}
