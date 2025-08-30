package aqa_hw_6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main3 {

    public static void main(String[] args) throws InterruptedException {
        int expectedCountOfItemsOnPage = 48;

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.button-menu-main")));
        WebElement catalogButton = driver.findElement(By.cssSelector("div.button-menu-main"));
        catalogButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-id='548']")));
        WebElement householdAppliances = driver.findElement(By.cssSelector("[data-id='548']"));
        householdAppliances.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.section-navigation__item")));
        WebElement washingMachines = driver.findElement(By.cssSelector("div.section-navigation__item"));
        washingMachines.click();

        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("div.list-item"),48));
        List<WebElement> itemsOnPage = driver.findElements(By.cssSelector("div.list-item"));
        Assert.assertEquals(itemsOnPage.size(), expectedCountOfItemsOnPage);

        driver.quit();
    }
}
