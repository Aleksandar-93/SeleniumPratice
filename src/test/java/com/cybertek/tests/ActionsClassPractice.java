package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionsClassPractice {

    @Test
    public void dragAndDropTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droptarget = driver.findElement(By.id("droptarget"));

        Thread.sleep(2000);


        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable,droptarget).perform();

        Thread.sleep(2000);

        Assert.assertEquals(droptarget.getText(), "You did great!");

        driver.close();
    }


    @Test
    public void hoverTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/hovers");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
        WebElement img1Text = driver.findElement(By.xpath("//*[text()='name: user1']"));

        //Preform hover and check if text is visible
        actions.moveToElement(img1).perform();
        Assert.assertTrue(img1Text.isDisplayed());

        List<WebElement> images = driver.findElements(By.tagName("img"));

        for(WebElement image: images){
            actions.moveToElement(image).pause(2000).perform();
        }

        driver.close();

    }
}
