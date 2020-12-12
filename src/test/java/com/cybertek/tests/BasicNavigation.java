package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    // da bi Thread radio moramo dodati throw ovde
    public static void main(String[] args) throws Throwable {

        //to setup chrome driver
        WebDriverManager.chromedriver().setup();

        // to create an object of ChromeDriver class
        ChromeDriver driver = new ChromeDriver();

        // This string contain our url
        String url = "http://google.com";
        String url2 = "http://amazon.com";

        //open our url Google.com
        driver.get(url);

        //this will put hold ocurrnet run on 3 seconds
        Thread.sleep(3000);

        //navigate to amazon.com
        driver.navigate().to(url2);

        //wait for 3 seconds
        Thread.sleep(3000);

        //will navigate back to the previous URL
        // in our  case its a  google.com
        driver.navigate().back();

        //wait for 3 seconds
        Thread.sleep(3000);

        driver.navigate().forward();

        //wait for 3 seconds
        Thread.sleep(3000);

        //will refresh the page
        driver.navigate().refresh();

        //wait for 3 seconds
        Thread.sleep(3000);

        // this will close web browser
        driver.close();

    }
}
