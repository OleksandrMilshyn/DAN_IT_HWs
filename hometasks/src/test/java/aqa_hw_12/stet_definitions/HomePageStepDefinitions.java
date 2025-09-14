package aqa_hw_12.stet_definitions;

import aqa_hw_12.HomePage;
import io.cucumber.java.en.Given;

public class HomePageStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }
}
