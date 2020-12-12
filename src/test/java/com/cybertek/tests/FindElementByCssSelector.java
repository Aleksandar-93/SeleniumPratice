package com.cybertek.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("somging232");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("email@cyber.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("somting442");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("555-222-4444");
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("10/10/2000");


        Select select = new Select(driver.findElement(By.cssSelector("select[name='job_title'")));
        Select select2 = new Select(driver.findElement(By.cssSelector("select[name='department'")));

        driver.findElement(By.cssSelector("input[value='male']")).click();
        select2.selectByVisibleText("MPDC");
        select.selectByVisibleText("SDET");
        Thread.sleep(4000);
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(9000);
        driver.quit();

    }
}
