package com.TheTestingAcademy.RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class awesomeqa {
    @Test
    public void Test01() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement spanElement = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
    driver.findElement(with(By.id("exp-2")).toRightOf(spanElement)).click();
    }
}