package aqa_hw_10;

import static com.codeborne.selenide.Selenide.$$;

public class FilterPage {

    public int countOfIcon(){
        return $$("div.short-mask").size();
    }
}
