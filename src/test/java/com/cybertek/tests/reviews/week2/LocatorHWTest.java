package com.cybertek.tests.reviews.week2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHWTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        Test case
            Go to Ebay
            search Selenium
            click on search button
            print number of results
            verify title contains Selenium
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        String expectedSearchItem = "selenium";
        searchBox.sendKeys(expectedSearchItem);

        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        //driver.findElement(By.id("gh-btn")).click(); (lazy way)

        Thread.sleep(3000);

        WebElement searchRsultElement = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
        String searchResultText = searchRsultElement.getText();

        String [] arr = searchResultText.split(" ");

        System.out.println("Number of search results = " + arr[0]);


        driver.quit();




    }
}
