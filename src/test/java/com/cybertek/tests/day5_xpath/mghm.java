package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mghm {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.de");

        WebElement searchbutton = driver.findElement(By.id("twotabsearchtextbox"));

        searchbutton.sendKeys("selenium");

        Thread.sleep(3000);

        WebElement clickbutton = driver.findElement(By.id("nav-search-submit-button"));

        clickbutton.click();
    }
}