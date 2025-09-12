package aqa_hw_10;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public void searchField(String text) {$("#story").setValue(text);}

    public void searchButton() {$("button.search-btn").click();}

    public void filmIcon() {$("div.short-mask").click();}

}
