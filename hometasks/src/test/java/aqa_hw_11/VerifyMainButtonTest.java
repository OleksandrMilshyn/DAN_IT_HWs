package aqa_hw_11;

import aqa_hw_11.HomePage;
import org.testng.annotations.Test;

public class VerifyMainButtonTest extends BaseTest{

    @Test
    public void verifyMainButton(){

        HomePage homePage = new HomePage();
        homePage.toFilterPage();

    }
}
