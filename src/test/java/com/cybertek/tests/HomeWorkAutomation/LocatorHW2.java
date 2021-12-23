package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorHW2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement Home = driver.findElement(By.xpath("//a[@class='nav-link']"));
        String Text4 = Home.getText();
        System.out.println("Texta :" +Text4);

        WebElement ForgotPassword = driver.findElement(By.xpath("//h2"));
        String Text = ForgotPassword.getText();
        System.out.println("Textb :" +Text);

        WebElement Email = driver.findElement(By.xpath("//label"));
        String Text2 = Email.getText();
        System.out.println("Textc :" +Text2);

        WebElement InputBox = driver.findElement(By.xpath("//input[@type='text']"));
        InputBox.sendKeys("yasinyavuz@gmail.com");
        Thread.sleep(2000);
        String Text3 = InputBox.getAttribute("value");
        System.out.println("Textd :" +Text3);

        WebElement RetrButton = driver.findElement(By.xpath("//button[@class='radius']"));
        String Text5 = RetrButton.getText();
        System.out.println("Texte :" +Text5);

    }
}
