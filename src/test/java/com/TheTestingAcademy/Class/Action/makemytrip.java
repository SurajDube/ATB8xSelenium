package com.TheTestingAcademy.Class.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class makemytrip {
    WebDriver driver;

    @Test
    public void mmtActions() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
        String url = "https://www.makemytrip.com/";
        driver = new EdgeDriver(edgeOptions);
        driver.get(url);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        WebElement fromCity = driver.findElement(By.id("fromCity"));
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("DEL").build().perform();
        actions.moveToElement(fromCity).contextClick();

//        List<WebElement> webElementList = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
//for (WebElement e : webElementList){
//    if (e.getText().contains("New Delhi")){
//        e.click();
//        break;
//    }
//}
        Thread.sleep(5000);
        actions.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

    }
}
