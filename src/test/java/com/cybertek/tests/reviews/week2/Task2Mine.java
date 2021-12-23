package com.cybertek.tests.reviews.week2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2Mine {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.demoblaze.com/index.html#");

        WebElement searchBox = driver.findElement(By.id("itemc"));
        searchBox.click();
        Thread.sleep(2000);

        WebElement searchResultElement = driver.findElement(By.xpath("//a[@href='prod.html?idp_=9']"));
        String searchResultText = searchResultElement.getText();

        String [] arr = searchResultText.split(" ");

        WebElement expectedRsultElement = driver.findElement(By.xpath("//h5[.='$790']"));

        if(searchResultText.equals(expectedRsultElement)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }
    }

}
