package aqa_hw_7.dataProvider;

import org.testng.annotations.DataProvider;

public class ProviderData {

    @DataProvider
    public Object [][] getSearchData() {
        return new Object[][]{
                {"Xiaomi", "Xiaomi Mobile"},
                {"Adidas", "Кросівки Adidas"},
                {"Bosch", "Пральні машини Bosch"}
        };
    }
}
