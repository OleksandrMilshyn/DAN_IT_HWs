package aqa_hw_12;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public void openHomePage() {open("https://hotline.ua/");}

    public void enterSearchWord(String searchWord) {
        $("[type = 'text']").setValue(searchWord);
        sleep(3000);
    }

    public void enterSearchButton() {$("button.search__btn").click();}

    public void clickOnMainCatalogButton(){$("div.button-menu-main").click();}

    public boolean verifyMainCatalogButtonIsDisplayed() {
        return $("ul.menu-main__list").shouldBe(visible).isDisplayed();
    }
}
