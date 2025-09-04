package aqa_hw_7.Tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FeedBackTest extends BaseTest{

    @Test
    public void verifyFeedback() {
        String expectedResultTitleFeedback = "Зворотний зв'язок для користувачів";

        WebElement feedbackButton = getDriver().findElement(By.cssSelector("[href='/ua/feedback/']"));
        feedbackButton.click();

        WebElement isTitleCorrect = getDriver().findElement(By.cssSelector("h1.feedback__title"));
        String actualResultTitleFeedback = isTitleCorrect.getText();

        Assert.assertEquals(expectedResultTitleFeedback, actualResultTitleFeedback);
    }

    @Test
    public void verifyFeedbackForStories(){
        String expectedResultForOldClients = "Магазин";
        String expectedResultForNewClients = "Веб-адреса";

        WebElement feedbackButton = getDriver().findElement(By.cssSelector("[href='/ua/feedback/shop/']"));
        feedbackButton.click();

        WebElement storeButtonOldClients = getDriver().findElement(By.cssSelector("#store-existing"));
        storeButtonOldClients.click();

        WebElement checkFirstTitle = getDriver().findElement(By.cssSelector("[for='store']"));
        String titleFieldForOldClients = checkFirstTitle.getText();

        WebElement storeButtonNewClients = getDriver().findElement(By.cssSelector("#store-planned"));
        storeButtonNewClients.click();

        WebElement checkSecondTitle = getDriver().findElement(By.cssSelector("[for='store-url']"));
        String titleFieldForNewClients = checkSecondTitle.getText();

        Assert.assertEquals(expectedResultForOldClients, titleFieldForOldClients);
        Assert.assertEquals(expectedResultForNewClients, titleFieldForNewClients);
    }
}
