package com.cybertek.tests;

import TestNG.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Frames {
        
    @Test
    public void frameTest1(){
        Driver.getDriver("chrome").get("http://practice.cybertekschool.com/iframe");
        Driver.getDriver("chrome").switchTo().frame("mce_0_ifr");
        Driver.getDriver("chrome").findElement(By.id("tinymce")).clear();
        Driver.getDriver("chrome").findElement(By.id("tinymce")).sendKeys("Test Automation");
        Driver.getDriver("chrome").switchTo().defaultContent();

    }
}
