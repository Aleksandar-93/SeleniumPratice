package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
    public static void main(String[] args) {
        //to setup chrome driver
        WebDriverManager.chromedriver().setup();

        // to create an object of ChromeDriver class
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

     // will print title of our website
        String title = driver.getTitle();
        System.out.println(title);
    }
}
