package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String wordToFind = "Зоотовари";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchButton = driver.findElement(By.xpath("//div[@class='header-catalog-button']"));
            searchButton.click();
            sleep(3000);

            WebElement searchButtonZoo = driver.findElement(By.xpath("//a[@data-id='2121']"));
            searchButtonZoo.click();
            sleep(3000);

            WebElement isZoo = driver.findElement(By.xpath("//h1[@class='title-page flex middle-xs section-title']"));
            String wordForCompare = isZoo.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", wordForCompare, wordToFind), wordForCompare.contains(wordToFind));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
