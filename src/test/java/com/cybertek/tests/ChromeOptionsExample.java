package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("test-type");
        options.addArguments("disable-extensions");
        options.addArguments("test-type=browser");
        options.addArguments("--ignore-certificate-errors");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
    }
}

