package aqa_hw_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    private WebDriverWait waiter;

    private static final By TITLE_ELEMENT = By.cssSelector("[href='/ua/reminder/']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void toForgetPassword(){
        waiter.until(ExpectedConditions.elementToBeClickable(TITLE_ELEMENT));
        WebElement forgetPasswordButton = driver.findElement(TITLE_ELEMENT);
        forgetPasswordButton.click();
    }

    public String verifyTitle(){
        waiter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.h3")));
        WebElement titleToVerify = driver.findElement(By.cssSelector("div.h3"));
        return titleToVerify.getText();
    }
}
