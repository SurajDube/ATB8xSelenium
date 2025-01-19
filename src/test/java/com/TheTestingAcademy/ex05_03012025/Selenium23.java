package com.TheTestingAcademy.ex05_03012025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium23 {
    @Test
    public void testMethod() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://cdpn.io/AbdullahSajjad/fullpage/LYGVRgK?anon=true&view=fullpage");
        driver.switchTo().frame("result");

        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        button.click();

        String input_box_path = "//input[@id='username']";
        String small_path = input_box_path+"/following-sibling::small";
        String label_path = input_box_path+"/preceding-sibling::label";

        WebElement error_small_tag = driver.findElement(By.xpath(small_path));
        WebElement label_tag = driver.findElement(By.xpath(label_path));

        Assert.assertEquals(error_small_tag.getText(), "Username must be at least 3 characters");

    }
}
