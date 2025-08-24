package aqa_hw_4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class Main3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String wordToFind = "Корм";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchButtonCatalog = driver.findElement(By.xpath("//div[@class='header-catalog-button']"));
            searchButtonCatalog.click();
            sleep(3000);

            WebElement searchButtonZoo = driver.findElement(By.xpath("//a[@data-id='2121']"));
            searchButtonZoo.click();
            sleep(3000);

            WebElement petsFood = driver.findElement(By.xpath("//img[@src='/img/uploads/clients/6721f9f6185374.87463891=konservu_dlya_kotiv-1.png']"));
            petsFood.click();
            sleep(3000);

            WebElement addProductToCompare = driver.findElement(By.xpath("(//button[@class='list-item-compare__icon'])[1]"));
            addProductToCompare.click();
            sleep(3000);

            WebElement productCompare = driver.findElement(By.xpath("//div[@class='popover product-compare']"));
            productCompare.click();
            sleep(3000);

            WebElement isWorks = driver.findElement(By.xpath("//div[@class='profile-sidebar__section-child-container']"));
            String wordForCompare = isWorks.getText();
            sleep(3000);

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", wordForCompare, wordToFind), wordForCompare.contains(wordToFind));

        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}