package com.TheTestingAcademy.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EspoCRM_CreateContact {

    @Test
    public void createContact() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.us.espocrm.com/?l=en_US#Contact");

        Thread.sleep(9000);

        WebElement LoginButton = driver.findElement(By.id("btn-login"));

        LoginButton.click();

        Thread.sleep(9000);

        WebElement ContactButton = driver.findElement(By.xpath("//span[@class='fas fa-plus fa-sm']/following-sibling::span"));

        ContactButton.click();

        Thread.sleep(10000);

        WebElement Namedropdown = driver.findElement(By.xpath("//div[@class='col-sm-3 col-xs-3']"));
        Namedropdown.click();

        Thread.sleep(8000);
        WebElement optionvalue = driver.findElement(By.xpath("//div[@class='selectize-dropdown-content']//div[@class='option' and text()='Mr.']"));

        optionvalue.click();

        WebElement firstname = driver.findElement(By.xpath("//input[@data-name='firstName']"));

        firstname.sendKeys("sss");


        WebElement lastname = driver.findElement(By.xpath("//input[@data-name='lastName']"));

        lastname.sendKeys("ddd");

        Thread.sleep(9000);

        WebElement saveButton = driver.findElement(By.xpath("//button[@data-action='save']"));

        saveButton.click();
    }
}
