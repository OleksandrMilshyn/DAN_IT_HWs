package aqa_hw_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ReviewPage {

    private WebDriver driver;

    private WebDriverWait waiter;

    public ReviewPage(WebDriver driver){
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void toReviewPage(){
        WebElement redirectsToReviews = driver.findElement(By.cssSelector("[data-tracking-id='global-1']"));
        redirectsToReviews.click();
    }

    public void toReviewOfStories(){
        waiter.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='tabs-item flex center-xs middle-xs']")));
        WebElement buttonToReviewOfStories = driver.findElement(By.cssSelector("[class='tabs-item flex center-xs middle-xs']"));
        buttonToReviewOfStories.click();
    }

    public String getFieldContent(String cssSelector){
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        WebElement fieldContent = driver.findElement(By.cssSelector(cssSelector));
        return fieldContent.getText();
    }
}
