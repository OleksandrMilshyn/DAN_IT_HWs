package aqa_hw_10;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    @Step("User enters some word on search field ")
    public void searchField(String text) {$("#story").setValue(text);}

    @Step("User clicks on search Button")
    public void searchButton() {$("button.search-btn").click();}

    @Step("User clicks on some icon")
    public void filmIcon() {$("div.short-mask").click();}

    @Step("User clicks to series icon")
    public void toFilterPage(){$("[href='/series/']").click();}
}
