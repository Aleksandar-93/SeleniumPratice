package TestNG;

import TestNG.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test (description = "verify page title", dataProvider = "testData")
    public void test1(String url, String title){
        WebDriver driver = Driver.getDriver("chrome");
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();
    }


    @DataProvider (name = "testData")
    public Object [] [] testData(){
        return new Object[][]{{"http://google.com", "Google"},
                                {"http://amazon.com", "Amazon"},
                                {"http://etsy.com", "Etsy"},
                                {"http://ebay.com", "Ebay"},
                                {"http://cybertekschool.com", "Cybertek"}


        };
    }
}
