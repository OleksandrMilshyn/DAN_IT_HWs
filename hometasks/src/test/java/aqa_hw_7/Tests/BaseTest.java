package aqa_hw_7.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void driverInit() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    @AfterMethod
    public void quitDriver(){
        this.driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
