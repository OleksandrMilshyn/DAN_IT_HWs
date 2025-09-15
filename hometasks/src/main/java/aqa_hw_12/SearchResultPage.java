package aqa_hw_12;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {

    public String getTitle() {
        return $("h1.catalog-title__main").shouldBe(visible).getText();
    }
}
