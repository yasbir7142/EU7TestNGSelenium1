package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LocatorHWtest2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.de/");
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-ac")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();

        WebElement result = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
        String Text = result.getText();
        Assert.assertTrue(Text.contains("selenium"),"title does not contain selenium");

        if(Text.contains("selenium")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
