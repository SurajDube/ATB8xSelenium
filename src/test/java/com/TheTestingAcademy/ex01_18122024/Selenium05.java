package com.TheTestingAcademy.ex01_18122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium05 {
    @Test
    public void test_Selenium(){
        //  Selenium 3 vs Selenium 4

        // Selenium 3
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver1 = new ChromeDriver();

        //Selenium 4
        WebDriver driver2 = new ChromeDriver();

    }


}
