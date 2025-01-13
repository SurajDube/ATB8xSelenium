package com.TheTestingAcademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Selenium17 {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized"); // direct max

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
        System.out.println(driver.getCurrentUrl());

        //  automate this page
        //  https://app.vwo.com/#/login
        WebElement login_username = driver.findElement(By.id("login-username"));
        login_username.sendKeys("chintubaba.com");

        WebElement login_password = driver.findElement(By.id("login-password"));
        login_password.sendKeys("chintubaba#92565");

        WebElement login_btn = driver.findElement(By.id("js-login-btn"));
        login_btn.click();

        Thread.sleep(3000);

        WebElement notification_box = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(notification_box.getText(), "Your email, password, IP address or location did not match");

        assertThat(notification_box.getText()).isNotBlank().isNotEmpty().isEqualTo("Your email, password, IP address or location did not match");
        driver.quit();
    }
}
