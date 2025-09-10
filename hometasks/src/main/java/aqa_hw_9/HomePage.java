package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class HomePage {

    public void enterTextIntoSearchField(String textToSearch) {
        $("[type='text']").setValue(textToSearch);
        waitForSeconds();
    }

    public void clickOnButtonToSearch(){
        $("button.search__btn").click();
        waitForSeconds();
    }

    public void toUserPage(){
        $("[class='user-button__image flex middle-xs center-xs']").click();
    }

    public void toReviewPage(){
        $("[data-tracking-id='global-1']").click();
    }

    private void waitForSeconds() {
        try {
            sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
