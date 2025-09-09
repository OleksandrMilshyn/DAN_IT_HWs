package aqa_hw_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReviewPage {
    private WebDriver driver;

    private WebDriverWait waiter;

    private static final By TITLE_ELEMENT = By.cssSelector("[class='tabs-item flex center-xs middle-xs']");

    public ReviewPage(WebDriver driver){
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void toReviewOfStories(){
        waiter.until(ExpectedConditions.elementToBeClickable(TITLE_ELEMENT));
        WebElement buttonToReviewOfStories = driver.findElement(TITLE_ELEMENT);
        buttonToReviewOfStories.click();
    }

    public String getFieldContent(String cssSelector){
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        WebElement fieldContent = driver.findElement(By.cssSelector(cssSelector));
        return fieldContent.getText();
    }
}

