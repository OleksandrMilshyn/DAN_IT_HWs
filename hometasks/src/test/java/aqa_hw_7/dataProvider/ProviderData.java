package aqa_hw_7.dataProvider;

import org.testng.annotations.DataProvider;

public class ProviderData {

    @DataProvider
    public Object [][] getSearchData() {
        return new Object[][]{
                {"Xiaomi", "Смартфони та мобільні телефони Xiaomi"},
                {"Adidas", "Кросівки Adidas"},
                {"Bosch", "Пральні машини Bosch"}
        };
    }

    @DataProvider
    public Object [][] getIncorrectSearching() {
        return new Object[][]{
                {".", "."},
                {",", ","},
                {"!", "!"}
        };
    }
}
