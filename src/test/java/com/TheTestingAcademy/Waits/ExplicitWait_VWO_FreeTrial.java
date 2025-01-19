package com.TheTestingAcademy.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait_VWO_FreeTrial {
    @Test
    public void testMethod() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://app.vwo.com");

//        Assert.assertEquals(edgeDriver.getTitle(),"Login - VWO");
//        Assert.assertEquals(edgeDriver.getCurrentUrl(),"https://app.vwo.com/#/login");

        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        // class="text-link"
        // data-qa="bericafeqo">
        // Start a free trial
        // </a>

//        WebElement link_free_trial = edgeDriver.findElement(By.linkText("Start a free trial"));
//        link_free_trial.click();

        WebElement link_free_trial = edgeDriver.findElement(By.partialLinkText("free trial"));
        link_free_trial.click();
        WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.elementToBeClickable(link_free_trial));
        edgeDriver.quit();
    }
}
