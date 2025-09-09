package aqa_hw_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    private WebDriverWait waiter;

    private static final By TITLE_ELEMENT = By.cssSelector("[type='text']");

    public HomePage(WebDriver driver){
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void fieldForWordToSearch(String wordForSearch){
        waiter.until(ExpectedConditions.visibilityOfElementLocated(TITLE_ELEMENT));
        WebElement fieldForText = driver.findElement(TITLE_ELEMENT);
        fieldForText.sendKeys(wordForSearch);
    }

    public void clickToButtonToSearch(){
        WebElement buttonToSearch = driver.findElement(By.cssSelector("button.search__btn"));
        buttonToSearch.click();
    }

    public void toUserPage(){
        WebElement userButton = driver.findElement(By.cssSelector("[class='user-button__image flex middle-xs center-xs']"));
        userButton.click();
    }

    public void toReviewPage(){
        WebElement redirectsToReviews = driver.findElement(By.cssSelector("[data-tracking-id='global-1']"));
        redirectsToReviews.click();
    }
}

