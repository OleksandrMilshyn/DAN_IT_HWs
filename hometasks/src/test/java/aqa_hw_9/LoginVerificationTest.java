package aqa_hw_9;

import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginVerificationTest extends BaseTest{

    @Test
    public void verifyLogin(){

        String wordToVerify = "Зміна паролю";

        HomePage homePage = new HomePage();
        homePage.toUserPage();

        LoginPage loginPage = new LoginPage();

        loginPage.toForgetPassword();

        Assert.assertEquals(wordToVerify, loginPage.verifyTitle());
    }
}
