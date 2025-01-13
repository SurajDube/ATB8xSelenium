package com.TheTestingAcademy.Task;

//import org.assertj.core.api.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;

public class Task002 {
    @Test
    public void awesomeqa() throws InterruptedException {
        //WebDriver driver = new FirefoxDriver();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        // AssertJ Assertion
        assertThat(driver.getCurrentUrl()).isEqualTo("https://awesomeqa.com/practice.html");

        WebElement Firstname = driver.findElement(By.name("firstname"));
        Firstname.sendKeys("Digambar");

        WebElement Lastname = driver.findElement(By.name("lastname"));
        Lastname.sendKeys("Jadhav");

        //Male
        WebElement Gender = driver.findElement(By.id("sex-0"));
        Gender.click();

        //Female
        // WebElement Gender1 = driver.findElement(By.id("sex-1"));
        // Gender.click();

        //Years of Exp
        WebElement YearsOfExp = driver.findElement(By.id("exp-4"));
        YearsOfExp.click();

        //date

        WebElement Date = driver.findElement(By.id("datepicker"));
        Date.sendKeys("27/12/2024");
        //Automation testing
        WebElement Profession = driver.findElement(By.id("profession-1"));
        Profession.click();

        //manual testing
        WebElement Profession2 = driver.findElement(By.id("profession-0"));
        Profession2.click();

        //Automation Tool
        WebElement AutomationTool = driver.findElement(By.id("tool-2"));
        AutomationTool.click();

        //Continent
        WebElement Continent = driver.findElement(By.name("continents"));
        Continent.click();

//        WebElement selectdropdown = null;
//        Select select=new Select(selectdropdown);
//        select.selectByVisibleText("Asia");
//
//        WebElement SeleniumCommands = null;
//        Select select1 =new Select(SeleniumCommands);
//        select.selectByVisibleText("WebElement Commands");
        Thread.sleep(10000);
        driver.quit();



    }
}
