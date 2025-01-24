package com.TheTestingAcademy.Class.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import java.util.Set;

public class ActionWindow {
    WebDriver driver;

    @Test
    public void mmtActions() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
        String url = "https://the-internet.herokuapp.com/windows";
        driver = new EdgeDriver(edgeOptions);
        driver.get(url);

        String parentWindow = driver.getWindowHandle();
        System.out.println("parentWindowHandle: " + parentWindow);

        driver.findElement(By.linkText("Click Here")).click();
        Set <String> windowHandles = driver.getWindowHandles();
        System.out.println("windowHandles: " + windowHandles);

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Test Case Passed");
                break;
            }
        }
    }
}