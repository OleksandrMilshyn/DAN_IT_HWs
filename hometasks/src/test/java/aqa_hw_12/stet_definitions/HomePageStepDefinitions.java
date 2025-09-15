package aqa_hw_12.stet_definitions;

import aqa_hw_12.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page")
    public void entersSearchWord(String wordToSearch){
        homePage.enterSearchWord(wordToSearch);
    }

    @And("User click on search button on Home Page")
    public void clickSearchButton() {
        homePage.enterSearchButton();
    }
}
