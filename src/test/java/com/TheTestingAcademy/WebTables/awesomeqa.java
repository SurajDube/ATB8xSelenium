package com.TheTestingAcademy.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class awesomeqa {
    //https://awesomeqa.com/webtable1.html
    @Test
    public void awesomeqa_webtable1() {
        String url = "https://awesomeqa.com/webtable1.html";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //table[@Summary='Sample Table']/tbody
        WebElement table = driver.findElement(By.xpath("//table[@Summary='Sample Table']/tbody"));
        List<WebElement> numberOfrows = table.findElements(By.tagName("tr"));

        for (int i = 0; i < numberOfrows.size(); i++) {

            List<WebElement> cols = numberOfrows.get(i).findElements(By.tagName("td"));
            for (WebElement c : cols) {
                System.out.println(c.getText());
            }
        }
    }
}