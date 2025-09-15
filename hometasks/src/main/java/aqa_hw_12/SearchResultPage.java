package aqa_hw_12;

import com.codeborne.selenide.ElementsCollection;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public String getTitle() {
        return $("h1.catalog-title__main").shouldBe(visible, Duration.ofSeconds(10)).getText();
    }

    public String getTitlePopularProducts() {
        return $("[class='block-popular__header-text']").shouldBe(visible, Duration.ofSeconds(10)).getText();
    }

    public String getProductName(int productIndex) {
        ElementsCollection productNames = $$("div.list-item [class='list-item__title-container m_b-5']")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        return productNames.get(productIndex - 1).getText();
    }

    public void clickOnProductPicture(int productIndex){
        ElementsCollection productPicturesElements = $$("div.list-item div.list-item__photo")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        productPicturesElements.get(productIndex - 1).click();
    }

}
