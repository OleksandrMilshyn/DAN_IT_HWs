package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class ReviewPage {

    public void toReviewOfStories(){

        $("[class='tabs-item flex center-xs middle-xs']").click();
        waitForSeconds();
    }

    public String getFieldContent(String cssSelector){
        return $(cssSelector).getText();
    }

    private void waitForSeconds() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
