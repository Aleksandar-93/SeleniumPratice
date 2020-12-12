package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonsPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input")).click();
//        Thread.sleep(2000);
//        System.out.println(driver.findElement(By.xpath("//label[contains(text()='Green')]/preceding-sibling::input")).isEnabled());
//        driver.findElement(By.xpath("//label[contains(text()='Green')]/preceding-sibling::input")).click();


        //check if checkbox is disabled or not
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement radio: radioButtons){
            System.out.println(radio.getAttribute("id")+"-"+radio.isEnabled());
        }
        Thread.sleep(2000);
        driver.close();
    }
}
