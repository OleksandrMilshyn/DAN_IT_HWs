package aqa_hw_9;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class ReviewPage {

    public void toReviewOfStories(){

        $("[class='tabs-item flex center-xs middle-xs']").click();
        Selenide.sleep(3000);
    }
}
