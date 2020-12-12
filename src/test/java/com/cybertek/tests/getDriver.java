package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getDriver {
    private  static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<WebDriver>();

    private getDriver(){

    }
    // TestNg arakkek abd nyktu briwser Testing
    public static WebDriver getDriver(String browser){
        if(driverThreadLocal.get() == null){
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driverThreadLocal.set(new ChromeDriver());
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driverThreadLocal.set(new FirefoxDriver());
            } else {
                throw new RuntimeException("Unimplemented driver type!");
            }
        }
        return driverThreadLocal.get();
    }
    public void closeDriver(){
        if(driverThreadLocal.get() != null){
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}
