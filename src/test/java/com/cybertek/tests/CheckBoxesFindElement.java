package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxesFindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)")).click();
//        Thread.sleep(3000);

        // find all elements with tag input
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        //loop through this list of elements (all elements in Checkboxes LIST)
        for (WebElement checkbox: checkboxes){
            Thread.sleep(3000);
            // if checkbox is not selected yet
            if(!checkbox.isSelected()){
                //selected
                checkbox.click();
            }
        }
        driver.quit();


    }
}
