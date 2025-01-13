package com.TheTestingAcademy.ex03_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium19_VWO_Free_Navigate {
    @Test
    public void testMethod() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial/");

        //<input class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="">
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("1995surajdubey");

        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-331cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-gdpr-consent-checkbox">
        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        //<button type="submit"
        // disabled=""
        // class="button button--disabled-primary W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit"
        // fdprocessedid="4swq5s">
        // Create a Free Trial Account
        // </button>
        List<WebElement> button_list = driver.findElements(By.tagName("button"));
        button_list.get(0).click();

        //<div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>
        WebElement error_message = driver.findElement(By.className("invalid-reason")); //we can use the partial class name if it is unique
        Assert.assertEquals(error_message.getText(),"The email address you entered is incorrect.");

        Thread.sleep(3000);
        driver.quit();


    }
}
