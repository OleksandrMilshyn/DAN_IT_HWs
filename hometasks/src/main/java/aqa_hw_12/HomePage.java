package aqa_hw_12;

import com.codeborne.selenide.Selenide;

public class HomePage {

    public void openHomePage() {

        Selenide.open("https://hotline.ua/");
    }
}
