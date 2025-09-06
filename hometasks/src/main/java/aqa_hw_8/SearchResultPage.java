package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {

    private WebDriver driver;

    private WebDriverWait waiter;

    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public int countOfProducts(){
        waiter.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.list-item")));
        List<WebElement> listOfAllProducts = driver.findElements(By.cssSelector("div.list-item"));
        return listOfAllProducts.size();
    }
}
