package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReviewVerificationTest extends BaseTest{

    @Test
    public void verifySearchReview(){

        String expectedReviewField1 = "Відгуки покупців";
        String expectedReviewField2 = "Відгуки про інтернет-магазини";

        HomePage homePage = new HomePage();
        homePage.toReviewPage();

        ReviewPage reviewPage = new ReviewPage();

        String actualReviewField1 = reviewPage.getTextOnReviewPage(0);
        Assert.assertEquals(actualReviewField1, expectedReviewField1);

        reviewPage.toReviewOfStories();

        String actualReviewField2 = reviewPage.getTextOnReviewPage(1);
        Assert.assertTrue(actualReviewField2.contains(expectedReviewField2));
    }
}