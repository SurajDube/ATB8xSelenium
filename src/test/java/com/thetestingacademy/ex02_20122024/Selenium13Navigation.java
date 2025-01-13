package com.TheTestingAcademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium13Navigation {
    @Test
    public void testMethod01() throws Exception {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
