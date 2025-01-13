package com.TheTestingAcademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void test_Selenium(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");


    }
}
