package aqa_hw_12.step_definitions;

import aqa_hw_12.ProductDetailsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductDetailsStepDefinitions extends BaseStepDefinition{

    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("User verify product title is correct on Product Details Page")
    public void verifyProductTitle() {
        String actualProductTitle = productDetailsPage.getProductName();
        String expectedProductName = getValueFromMapByKey("expectedProductName");
        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }
}
