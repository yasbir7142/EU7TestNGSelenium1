package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LocatorHWtest3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();


            driver.findElement(By.xpath("//a[@title='Selenium (software)']")).click();
            String URL = driver.getCurrentUrl();
            System.out.println(URL);
            Assert.assertEquals(URL,"https://en.wikipedia.org/wiki/Selenium_(software)");

            Thread.sleep(5000);

            driver.quit();

    }
}
