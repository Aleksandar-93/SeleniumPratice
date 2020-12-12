package com.cybertek.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementByXPath {
    public static void main(String[] args) throws InterruptedException {
        // ovim nacinom da nebi pravili stalno i pisali 3-4 reda koda smo preko getDrivera uzeli koji citac koristimo
        // na vec napravljenom kodu i to smo namestili u zagradi napivasi chrome
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");

        //ovo je apsulutan nacin pozivanja preko Xpath
        WebElement dropDownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        System.out.println("Dropdawn text: "+dropDownLink.getText());

        //ovo je relativan nacin pozovanja preko xpath
        WebElement headerText = driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println("h1 text: "+headerText.getText());

        //ovo je relativan nacin pozovanja preko xpath ali ne html element nego njegov sadrazaj
        WebElement contextMenuLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        System.out.println("content text: "+contextMenuLink.getText());
        contextMenuLink.click();

        Thread.sleep(2000);
        driver.close();
    }
}
