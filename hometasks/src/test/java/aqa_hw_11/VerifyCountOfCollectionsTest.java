package aqa_hw_11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCountOfCollectionsTest extends BaseTest{

    @Test
    public void verifyCountOfCollections() {

        int expectedCount = 51;

        HomePage homePage = new HomePage();
        homePage.toCollectionsPage();

        CollectionsPage collectionsPage = new CollectionsPage();
        int actualCount = collectionsPage.countCollections();

        Assert.assertEquals(actualCount, expectedCount);
    }
}
