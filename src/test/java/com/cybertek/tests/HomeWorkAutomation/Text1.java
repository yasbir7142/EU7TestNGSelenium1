package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Text1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.de/");
        driver.manage().window().maximize();

        WebElement SearchItem = driver.findElement(By.id("gh-ac"));
        SearchItem.sendKeys("laptop");
    }
}
