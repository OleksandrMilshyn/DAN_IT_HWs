package aqa_hw_9;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.util.Arrays;
import java.util.List;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.time.Duration.ofSeconds;

public class ReviewPage {

    public void toReviewOfStories() {

        $("[class='tabs-item flex center-xs middle-xs']").click();
        Selenide.sleep(3000);
    }

    public String getTextOnReviewPage(int index) {
        List<SelenideElement> selectorsForGetText = Arrays.asList(
                $("[class='reviews__title m_b-15']"),
                $("h1.reviews__title"));
        SelenideElement titleField = selectorsForGetText.get(index).shouldBe(visible, ofSeconds(7));
            return titleField.getText();
    }
}