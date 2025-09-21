package aqa_hw_11;

import static com.codeborne.selenide.Selenide.$;

public class FeedbackPage {

    public String getTitle() {return $("div.form-wrap").getText();}
}
