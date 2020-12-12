package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByTagName {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "chromedriver");  ovo je za manualno namestanje
        // ovako auto
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        driver.close();
    }

}
