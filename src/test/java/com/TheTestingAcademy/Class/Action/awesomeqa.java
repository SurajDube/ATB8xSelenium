package com.TheTestingAcademy.Class.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class awesomeqa {
    WebDriver driver = new EdgeDriver();

    @Test
    public void test_webTables() {
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement first_name = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(first_name, "the testing academy").keyUp(Keys.SHIFT).build().perform();

    }
}
