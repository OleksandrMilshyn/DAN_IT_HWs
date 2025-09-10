package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class ReviewPage {

    public void toReviewOfStories(){

        $("[class='tabs-item flex center-xs middle-xs']").click();
    }

    public String getFieldContent(String cssSelector){
        return $(cssSelector).getText();
    }
}
