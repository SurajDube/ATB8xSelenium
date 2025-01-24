package com.TheTestingAcademy.RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class aqi {
    @Test
    public void Test01() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.aqi.in/in/real-time-most-polluted-city-ranking");

        List<WebElement> searchBox = driver.findElements(By.xpath("//input[@type=\"search\"]"));
        searchBox.get(1).sendKeys("India" + Keys.ENTER);

        List<WebElement> locations = driver.findElements(By.cssSelector("div.location > p"));

        for (WebElement e : locations){
            System.out.println(e.getText());

            String s1 = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
            System.out.println(s1);

            String s2 = driver.findElement(with(By.tagName("span")).toRightOf(e)).getText();
            System.out.println(s2);

            System.out.println(" | + " + s1 + " | " + e.getText() + " | " + s2 + " | ");
            Thread.sleep(3000);
            driver.quit();
        }
    }
}
