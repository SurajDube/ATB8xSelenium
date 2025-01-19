package com.TheTestingAcademy.ex02_20122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium15 {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized"); // direct max

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        //driver.manage().window().maximize(); small to max
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service").isNotEmpty().isNotBlank();
        System.out.println(driver.getTitle());

        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/").isNotEmpty().isNotBlank();
        System.out.println(driver.getCurrentUrl());

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        } else {
            throw new Exception("Heading Not Found!");
        }
        driver.quit();
    }
}
