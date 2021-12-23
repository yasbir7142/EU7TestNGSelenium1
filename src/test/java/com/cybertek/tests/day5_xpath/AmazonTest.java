package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {
        /*
        Task
        go to amazon.com
        search for selenium
        click search button
        verify 1-48 of 190 results for "selenium"
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");

        WebElement searchButton = driver.findElement(By.id("twotabsearchtextbox"));
        searchButton.sendKeys("selenium");

        WebElement clickSearch = driver.findElement(By.id("nav-search-submit-button"));
        clickSearch.click();

        String expectedResult = "1-48 of 201 results for";

        WebElement actualResult = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));

        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
