package com.TheTestingAcademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    @Test
    public void testMethod01() throws Exception {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        // quit vs exit
        Thread.sleep(5000);
        driver.quit();

        //driver.close();
    }
}
