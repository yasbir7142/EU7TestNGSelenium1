package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Text1 {

    public static void main(String[] args) {

        //open the browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.ebay.de/");
        driver.manage().window().maximize();

        //find the search button
        WebElement SearchItem = driver.findElement(By.id("gh-ac"));
        SearchItem.sendKeys("laptop");
    }
}
