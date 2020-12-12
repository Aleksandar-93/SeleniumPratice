package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//metoda preko koje mozemo da dodamo u nase klase da bi pozivali web driver
// umesto da na svakom posebno pravimo nove driver metode i da stavljamo setup();
// static je zato sto zelimo da dohvatimo ovaj object preko klase
public class BrowserFactory {
    public static WebDriver getDriver(String browser){
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browser.equals("firefox")){
            WebDriverManager.chromedriver().setup();
            return new FirefoxDriver();
        }else {
            return null;
        }
    }
}
