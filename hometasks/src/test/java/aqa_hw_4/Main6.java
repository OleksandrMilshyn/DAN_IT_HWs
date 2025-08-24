package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {
            String wordToFind = "0";
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

            WebElement closeButton = driver.findElement(By.cssSelector("[class='modal__close-icon btn-close']"));
            closeButton.click();
            sleep(3000);

            WebElement checkLikes = driver.findElement(By.cssSelector("[class='popover my-lists']"));
            checkLikes.click();
            sleep(3000);

            WebElement openCheckLikes = driver.findElement(By.cssSelector("[class='profile-sidebar__section-child-container']"));
            openCheckLikes.click();
            sleep(3000);

            WebElement putATick = driver.findElement(By.cssSelector("[class='checkbox__checkmark']"));
            putATick.click();
            sleep(3000);

            WebElement clickDelete = driver.findElement(By.cssSelector("[class='button-with-icon buttons__item buttons__item--trash']"));
            clickDelete.click();
            sleep(3000);

            WebElement isEmpty = driver.findElement(By.cssSelector("[class='profile-page-title']"));
            String isZero = isEmpty.getText();
            sleep(3000);

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", isZero, wordToFind), isZero.contains(wordToFind));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}