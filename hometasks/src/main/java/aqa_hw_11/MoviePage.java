package aqa_hw_11;

import static com.codeborne.selenide.Selenide.$;

public class MoviePage {

    public String filmTitle() {return $("div.oname").getText();}

    public void addToFavoritesButton() {$("[data-id='1']").click();}

    public String favoritesTitle() {return $("#dlepopup").getText();}

    public String checkTVTitle() {return $("[href='https://uaserials.my/channel/Netflix/']").getText();}
}
