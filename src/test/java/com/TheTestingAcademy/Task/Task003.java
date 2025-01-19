package com.TheTestingAcademy.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task003 {
//    Open the https://www.idrive360.com/enterprise/login
//    Enter the credentials
//    email - augtest_040823@idrive.com
//    password - 123456
//    Verify that the free trial message is visible.

    @Test
    public void idrive360() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Assert.assertEquals(driver.getTitle(),"IDrive® 360 - Sign in to your account");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.idrive360.com/enterprise/login");


        WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
        user_name.sendKeys("augtest_040823@idrive.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");


        WebElement id_check = driver.findElement(By.className("id-check"));
        id_check.click();

        WebElement frm_btn = driver.findElement(By.id("frm-btn"));
        frm_btn.click();
        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));

        Assert.assertEquals(errorMessage.getText(), "Your free trial has expired");
        System.out.println("Message Verification:" + errorMessage.getText());

        String Actual_Title = errorMessage.getText();
        if (Actual_Title.equals("Your free trial has expired")){

            System.out.println("Test case passed!");
        }
        else
        {
            System.out.println("Test case failed");
        }

        driver.quit();



    }

}
