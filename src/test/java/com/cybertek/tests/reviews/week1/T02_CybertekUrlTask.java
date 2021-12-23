package com.cybertek.tests.reviews.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_CybertekUrlTask {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        String expectedUrl = "Cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("expectedUrl = " + expectedUrl);

        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
