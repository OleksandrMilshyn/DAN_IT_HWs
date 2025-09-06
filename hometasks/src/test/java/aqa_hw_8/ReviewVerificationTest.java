package aqa_hw_8;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ReviewVerificationTest extends BaseTest{

    @Test
    public void verifySearchReview() throws InterruptedException {

        ReviewPage reviewPage = new ReviewPage(getDriver());
        reviewPage.toReviewPage();

        String expectedReviewField1 = "Відгуки покупців";
        Assert.assertEquals(reviewPage.getFieldContent("[class='reviews__title m_b-15']"), expectedReviewField1);

        reviewPage.toReviewOfStories();
        sleep(4000);
        String expectedReviewField2 = "Відгуки про інтернет-магазини";
        Assert.assertEquals(reviewPage.getFieldContent("h1.reviews__title"), expectedReviewField2);
    }
}
