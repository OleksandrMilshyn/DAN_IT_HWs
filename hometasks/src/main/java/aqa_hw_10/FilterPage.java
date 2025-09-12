package aqa_hw_10;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FilterPage {

    private static final String ELEMENT_TITLE = "div.short-mask";

    public int countOfIcon(){return $$(ELEMENT_TITLE).size();}

    public void fieldOfTVOptions() {$("[value='Телеканал']").shouldBe(Condition.visible).click();}

    public void listOfTVCannels() {$("[data-option-array-index='1']").click();}

    public void searchButton() {$("[data-dlefilter='submit']").click();}

    public void toMoviePage() {$(ELEMENT_TITLE).click();}


}
