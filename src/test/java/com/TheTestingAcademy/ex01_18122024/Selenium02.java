package com.TheTestingAcademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void test_Selenium(){

        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://app.vwo.com/#/login");

        EdgeDriver driver2 = new EdgeDriver();
        driver2.get("https://www.flipkart.com/");
        driver1.quit();
    }
}
