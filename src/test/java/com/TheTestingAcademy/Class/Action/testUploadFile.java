package com.TheTestingAcademy.Class.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class testUploadFile {
    @Test
    public void testMethod() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        String directoryName = System.getProperty("user.dir");
        System.out.println(directoryName);
        uploadFileInput.sendKeys(directoryName + "/src/test/java/com/TheTestingAcademy/Class/Action/upload.txt");
        driver.findElement(By.name("submit")).click();
    }
}
