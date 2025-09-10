package aqa_hw_9;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void toForgetPassword(){

        $("[href='/ua/reminder/']").click();
    }

    public String verifyTitle(){
        return $("div.h3").getText();
    }
}
