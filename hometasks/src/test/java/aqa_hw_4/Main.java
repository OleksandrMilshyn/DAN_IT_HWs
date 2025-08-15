package aqa_hw_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchButtonLocation = driver.findElement(By.cssSelector("[class='location flex middle-xs']"));
            searchButtonLocation.click();
            sleep(3000);

        } catch (AssertionError ex) {
        ex.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

//WebElement searchField = driver.findElement(By.cssSelector("[type = 'text']"));
//            searchField.sendKeys(wordToFind);
//sleep(3000);
//
//WebElement searchButton = driver.findElement(By.cssSelector("[title = 'Поиск']"));
//            searchButton.click();
//sleep(5000);
//
//WebElement titleElement = driver.findElement(By.cssSelector("[class = 'catalog-title__main']"));
//String pageTitleString = titleElement.getText();
//
//            Assert.assertTrue(format("<%s> title doesn't contain <%s> word", pageTitleString, wordToFind), pageTitleString.contains(wordToFind));
//
//        } catch (AssertionError ex) {
//        ex.printStackTrace();
//        } finally {
//                driver.quit();
//        }
//                }
//                }