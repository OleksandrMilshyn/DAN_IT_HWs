package aqa_hw_12.stet_definitions;

import aqa_hw_12.SearchResultPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchResultStepDefinitions {

    private SearchResultPage searchResultPage = new SearchResultPage();

    @Then("title contains {string} search word on Search Result Page")
    public void verifyTitle(String wordToVerify) {
        String actualTitle = searchResultPage.getTitle();
        Assert.assertTrue(actualTitle.contains(wordToVerify));
    }
}
