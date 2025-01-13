package com.TheTestingAcademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium10 {
    @Test
    public void testMethod01() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("src/test/java/com/TheTestingAcademy/ex02_20122024/AdBlock.crx"));

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");
        Thread.sleep(5000);
        driver.quit();

    }
}
