package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main5 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement catalogButton = driver.findElement(By.cssSelector("[class='header-catalog-button']"));
            catalogButton.click();
            sleep(3000);

            WebElement buttonComputerProducts = driver.findElement(By.cssSelector("[data-id='193']"));
            buttonComputerProducts.click();
            sleep(3000);

            WebElement buttonLaptopsProducts = driver.findElement(By.cssSelector("[src='/img/uploads/clients/12=5e6b9c1650bf1.jpg']"));
            buttonLaptopsProducts.click();
            sleep(3000);

            WebElement clickTheFirstLaptop = driver.findElement(By.cssSelector("a[href*=apple-macbook-air-136-2025-sky-blue-mc6t4]>img.rounded-border--sm"));
            clickTheFirstLaptop.click();
            sleep(3000);

            WebElement toLikeProduct = driver.findElement(By.cssSelector("[data-tracking-id='product-25']"));
            toLikeProduct.click();
            sleep(3000);

            WebElement isAdd = driver.findElement(By.cssSelector("[class='modal modal--center']"));

            Assert.assertTrue(isAdd.isDisplayed());



        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}