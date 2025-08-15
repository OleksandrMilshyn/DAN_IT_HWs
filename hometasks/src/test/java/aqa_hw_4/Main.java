package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String wordToFind = "Харків";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchButtonLocation = driver.findElement(By.xpath("//div[@class='location flex middle-xs']"));
            searchButtonLocation.click();
            sleep(3000);

            WebElement searchNewLocation = driver.findElement(By.xpath("//span[text()='Харків']"));
            searchNewLocation.click();
            sleep(3000);

            WebElement isKharkivLocation = driver.findElement(By.xpath("//div[@title='Харків']"));
            String pageTitleString = isKharkivLocation.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", pageTitleString, wordToFind), pageTitleString.contains(wordToFind));

        } catch (AssertionError ex) {
        ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

