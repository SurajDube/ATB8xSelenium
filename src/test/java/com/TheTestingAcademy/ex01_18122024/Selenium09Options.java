package com.TheTestingAcademy.ex01_18122024;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Selenium09Options {
    @Test
    public void testMethod01incognito() {
//        start-maximized: Opens Chrome in maximize mode
//        incognito: Opens Chrome in incognito mode
//        headless: Opens Chrome in headless mode
//        disable-extensions: Disables existing extensions on Chrome browser
//        disable-popup-blocking: Disables pop-ups displayed on Chrome browser
//        make-default-browser: Makes Chrome default browser
//        version: Prints chrome browser version
//        disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        driver.quit();
    }

    @Test
    public void testMethod01headless() {
        ChromeOptions options1 = new ChromeOptions();
        options1.addArguments("--headless");
        DesiredCapabilities capabilities1 = new DesiredCapabilities();
        capabilities1.setCapability(ChromeOptions.CAPABILITY, options1);
        options1.merge(capabilities1);
        ChromeDriver driver1 = new ChromeDriver(options1);
        driver1.get("http://demo.guru99.com/");
        driver1.manage().window().maximize();
        String title = driver1.getTitle();
        System.out.println("Page Title: " + title);
        driver1.quit();
    }
}

