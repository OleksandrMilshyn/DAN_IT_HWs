package aqa_hw_11;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;

public class CollectionsPage {

    public int countCollections() {
        ElementsCollection elements = $$("div.uas-collection");
        return elements.size();
    }
}
