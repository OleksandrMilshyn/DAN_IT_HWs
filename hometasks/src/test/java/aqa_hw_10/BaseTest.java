package aqa_hw_10;

import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void openSite(){open("https://uaserials.my/");}
}
