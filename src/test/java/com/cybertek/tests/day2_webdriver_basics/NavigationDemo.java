package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(2000);


        driver.navigate().to("https://www.facebook.com");

        //wait 3 second here then move on
        Thread.sleep(3000);

        //goes back to previous page
        driver.navigate().back();

        Thread.sleep(2000);


        //goes forward after goes back
        driver.navigate().forward();

        Thread.sleep(3000);

         //refresh to webpage
        driver.navigate().refresh();

    }
}
