package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String wordToFind = "RU";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement switchLanguage = driver.findElement(By.cssSelector("[class*='v-popper hidden-below-xl']"));
            switchLanguage.click();
            sleep(3000);

            WebElement buttonRuLanguage = driver.findElement(By.cssSelector("div.lang-item:nth-child(2)")); // three years ago, I studied this on Phyton
            buttonRuLanguage.click();
            sleep(3000);

            WebElement isSwitchOn = driver.findElement(By.cssSelector("[class*='v-popper hidden-below-xl']"));
            String buttonLanguage = isSwitchOn.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", buttonLanguage, wordToFind), buttonLanguage.contains(wordToFind));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}