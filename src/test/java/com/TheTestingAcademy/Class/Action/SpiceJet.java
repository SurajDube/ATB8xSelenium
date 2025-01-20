package com.TheTestingAcademy.Class.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpiceJet {
    WebDriver driver;

    @Test
    public void SpiceJetActions() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");
        String url = "https://www.spicejet.com/";
        driver = new EdgeDriver(edgeOptions);
        driver.get(url);

        WebElement source = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        Actions actions = new Actions(driver);
        //actions.moveToElement(source).click();
        actions.moveToElement(source).click().sendKeys("BLR").build().perform();
    }
}
