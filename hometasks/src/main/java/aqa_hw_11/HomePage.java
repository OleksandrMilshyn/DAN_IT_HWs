package aqa_hw_11;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomePage {

    public void feedbackButton() {$("[href='/index.php?do=feedback']").click();}

    public void toFilterPage(){$("[href='/series/']").click();}

    public String currentURL() {return getWebDriver().getCurrentUrl();}

    public void toCollectionsPage() {$("[href='/collections/']").click();}
}
