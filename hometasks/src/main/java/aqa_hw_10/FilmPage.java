package aqa_hw_10;

import static com.codeborne.selenide.Selenide.$;

public class FilmPage {

    public String filmTitle() {return $("div.oname").getText();}
}
