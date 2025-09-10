package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ReviewVerificationTest extends BaseTest{

    @Test
    public void verifySearchReview() throws InterruptedException {

        String expectedReviewField1 = "Відгуки покупців";
        String expectedReviewField2 = "Відгуки про інтернет-магазини";

        HomePage homePage = new HomePage();
        homePage.toReviewPage();

        ReviewPage reviewPage = new ReviewPage();

        String actualReviewField1 = reviewPage.getFieldContent("[class='reviews__title m_b-15']");
        Assert.assertEquals(actualReviewField1, expectedReviewField1);

        reviewPage.toReviewOfStories();
        sleep(4000);

        String actualReviewField2 = reviewPage.getFieldContent("h1.reviews__title");
        Assert.assertEquals(actualReviewField2, expectedReviewField2);
    }
}