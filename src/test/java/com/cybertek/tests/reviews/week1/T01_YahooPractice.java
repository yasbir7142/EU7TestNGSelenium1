package com.cybertek.tests.reviews.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_YahooPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);

        if(driver.getTitle().contains("Yahoo")){
            System.out.println("Titles are matching");
        }else{
            System.out.println("Titles are not matching");
        }
    }
}
