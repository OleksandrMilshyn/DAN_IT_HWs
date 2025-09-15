package aqa_hw_12;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HomePage {

    public void openHomePage() {open("https://hotline.ua/");}

    public void enterSearchWord(String searchWord) {
        $("[type = 'text']").setValue(searchWord);
        sleep(3000);
    }

    public void enterSearchButton() {$("button.search__btn").click();}

    public void clickOnMainCatalogButton() {
        SelenideElement button = $("div.button-menu-main").shouldBe(visible);
        executeJavaScript("arguments[0].click();", button);
    }

    public boolean verifyMainCatalogButtonIsDisplayed() {
        return $("ul.menu-main__list").shouldBe(visible).isDisplayed();
    }

    public void clickOnTvAudioButton() {$("[data-id='196']").shouldBe(visible).click();}

    public void clickOnHotlineFinanceButton() {
        $("[data-id='5672']").click();
        SelenideElement financeButton = $("[data-id='5672']");
        executeJavaScript("arguments[0].click();", financeButton);
        ArrayList<String> tabs = new ArrayList<>(Selenide.webdriver().driver().getWebDriver().getWindowHandles());
        Selenide.switchTo().window(tabs.get(1));}

    public String getCurrentUrl() {return url();}
}
