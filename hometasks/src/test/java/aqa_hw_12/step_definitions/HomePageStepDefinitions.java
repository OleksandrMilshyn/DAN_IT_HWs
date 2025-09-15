package aqa_hw_12.step_definitions;

import aqa_hw_12.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageStepDefinitions {

    public HomePage homePage = new HomePage();

    @Given("User opens Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("User enters {string} word into search field on Home Page")
    public void entersSearchWord(String wordToSearch){
        homePage.enterSearchWord(wordToSearch);
    }

    @When("User click on search button on Home Page")
    public void clickSearchButton() {
        homePage.enterSearchButton();
    }

    @When("User clicks on main catalog button on Home Page")
    public void clickOnMainCatalogButton() {
        homePage.clickOnMainCatalogButton();
    }

    @When("The user clicks the TV, audio section in the catalog on Home Page")
    public void clickOnTvAudioSection() {homePage.clickOnTvAudioButton();}

    @When("The user clicks on hotline finance section in the catalog on Home Page")
    public void clickOnHotlineFinanceSection() {homePage.clickOnHotlineFinanceButton();}

    @Then("Verify main catalog menu appears on Home Page")
    public void verifyMainCatalogMenuIsDisplayed() {
        Assert.assertTrue(homePage.verifyMainCatalogButtonIsDisplayed());
    }

    @Then("Verify separate {string} window opens")
    public void verifyUrlHotlineFinancePage(String url) {
        Assert.assertTrue(homePage.getCurrentUrl().contains(url));
    }
}
