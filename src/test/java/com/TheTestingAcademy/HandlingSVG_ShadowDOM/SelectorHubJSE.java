package com.TheTestingAcademy.HandlingSVG_ShadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SelectorHubJSE {
    WebDriver driver;
@Test
    public void selectorshub() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
    String URL = "https://selectorshub.com/xpath-practice-page/";
    driver.get(URL);
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor)driver;

    WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id ='userName']"));
    js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);

    Thread.sleep(3000);
    WebElement inputBoxUsername = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"input#kils\");");
    inputBoxUsername.sendKeys("vijayJS");

//        js.executeScript("window.scrollBy(0, 500);");
//        js.executeScript("alert('Hello Ji')");


}

    @AfterTest
    public void tearDown(){
    driver.quit();
    }
    }
