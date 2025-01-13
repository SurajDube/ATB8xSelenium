package com.TheTestingAcademy.ex01_18122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {
    @Test
    public void testMethod01() {
//        start-maximized: Opens Chrome in maximize mode
//        incognito: Opens Chrome in incognito mode
//        headless: Opens Chrome in headless mode
//        disable-extensions: Disables existing extensions on Chrome browser
//        disable-popup-blocking: Disables pop-ups displayed on Chrome browser
//        make-default-browser: Makes Chrome default browser
//        version: Prints chrome browser version
//        disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software
//
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=1920,1080");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.instagram.com/");
        driver.quit();

    }
}
