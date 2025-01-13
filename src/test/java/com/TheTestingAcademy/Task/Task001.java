package com.TheTestingAcademy.Task;

//import org.assertj.core.api.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task001 {
    @Test
    public void testkatalon() throws InterruptedException {
        //WebDriver driver = new FirefoxDriver();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // AssertJ Assertion
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");
        //Step1: Click on MakeAppointment Button
        //<a id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">Make Appointment</a>
        WebElement MakeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        MakeAppointmentButton.click();

        //Step 2 Enter the User_name and Password
        //User-Name
        //<input type="text"
        //class="form-control"
        // id="txt-username" name="username"
        // placeholder="Username"
        // value="" autocomplete="off">

        WebElement user_name = driver.findElement(By.id("txt-username"));
        user_name.sendKeys("John Doe");

        //Password
        //<input type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        //Step3
        //Click on Login Button
        //<button id="btn-login"
        // type="submit"
        // class="btn btn-default">Login</button>
        WebElement Login_Button = driver.findElement(By.id("btn-login"));
        Login_Button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        Thread.sleep(3000);
        driver.quit();



    }
}
