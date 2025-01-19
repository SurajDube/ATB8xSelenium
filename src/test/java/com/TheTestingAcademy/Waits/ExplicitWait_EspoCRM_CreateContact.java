package com.TheTestingAcademy.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait_EspoCRM_CreateContact {

    @Test
    public void createContact() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.us.espocrm.com/?l=en_US#Contact");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement LoginButton = driver.findElement(By.id("btn-login"));

        LoginButton.click();

        WebElement ContactButton = driver.findElement(By.xpath("//span[@class='fas fa-plus fa-sm']/following-sibling::span"));

        ContactButton.click();

        WebElement Namedropdown = driver.findElement(By.xpath("//div[@class='col-sm-3 col-xs-3']"));
        Namedropdown.click();

        WebElement optionvalue = driver.findElement(By.xpath("//div[@class='selectize-dropdown-content']//div[@class='option' and text()='Mr.']"));

        optionvalue.click();

        WebElement firstname = driver.findElement(By.xpath("//input[@data-name='firstName']"));

        firstname.sendKeys("sss");


        WebElement lastname = driver.findElement(By.xpath("//input[@data-name='lastName']"));

        lastname.sendKeys("ddd");

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement saveButton = driver.findElement(By.xpath("//button[@data-action='save']"));

        saveButton.click();
    }
}
