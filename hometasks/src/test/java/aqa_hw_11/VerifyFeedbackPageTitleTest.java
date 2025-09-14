package aqa_hw_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyFeedbackPageTitleTest extends BaseTest{

    @Test
    public void verifyFeedbackPageTitle() {

        String expectedTitle = "Зворотній зв′язок";

        HomePage homePage = new HomePage();
        homePage.feedbackButton();

        FeedbackPage feedbackPage = new FeedbackPage();

        Assert.assertTrue(feedbackPage.getTitle().contains(expectedTitle));
    }
}
