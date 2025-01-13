package com.TheTestingAcademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test
    public void testMethod01() throws Exception {

        EdgeDriver driver = new EdgeDriver();
        //driver.get("flipkart.com/");     not working
        driver.get("http://www.flipkart.com");


    }
}
