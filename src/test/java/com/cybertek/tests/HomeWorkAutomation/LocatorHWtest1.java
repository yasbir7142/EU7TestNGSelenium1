package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHWtest1 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.de/");
        driver.manage().window().maximize();

        WebElement SearchItem = driver.findElement(By.id("gh-ac"));
        SearchItem.sendKeys("laptop");

        WebElement ClickSearch = driver.findElement(By.id("gh-btn"));
        ClickSearch.click();

        WebElement Result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));

        String resultText = Result.getText();
        System.out.println("resultText = " + resultText);
    }




}
