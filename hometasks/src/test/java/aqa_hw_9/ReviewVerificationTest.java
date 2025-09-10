package aqa_hw_9;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class ReviewVerificationTest extends BaseTest{

    @Test
    public void verifySearchReview(){

        String expectedReviewField1 = "Відгуки покупців";
        String expectedReviewField2 = "Відгуки про інтернет-магазини";

        HomePage homePage = new HomePage();
        homePage.toReviewPage();

        ReviewPage reviewPage = new ReviewPage();

        String actualReviewField1 = $("[class='reviews__title m_b-15']").shouldBe(visible, ofSeconds(7)).getText();
        Assert.assertEquals(actualReviewField1, expectedReviewField1);

        reviewPage.toReviewOfStories();

        String actualReviewField2 = $("h1.reviews__title").shouldBe(visible, ofSeconds(7)).getText();
        Assert.assertTrue(actualReviewField2.contains(expectedReviewField2));
    }
}