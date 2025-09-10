package aqa_hw_9;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {

    public int countOfProducts(){
        ElementsCollection listOfAllProducts = $$("div.list-item");
        return listOfAllProducts.size();
    }
}
