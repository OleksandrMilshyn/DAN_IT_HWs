package aqa_hw_3.task2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchElementLike = driver.findElement(By.cssSelector(".popover.my-lists"));
            searchElementLike.click();
            sleep(3000);

            WebElement isVisible = driver.findElement(By.cssSelector("[class='profile-sidebar__section-content flex-column']"));
            sleep(3000);

            Assert.assertTrue(isVisible.isDisplayed());

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}