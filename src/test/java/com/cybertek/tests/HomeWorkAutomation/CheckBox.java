package com.cybertek.tests.HomeWorkAutomation;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector")).click();
        //WebElement allButtonCheck = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        //allButtonCheck.click();
        Thread.sleep(5000);
        WebElement checkbox4 = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        Assert.assertTrue(checkbox4.isSelected(),"verify all checkboxes are checked");
        System.out.println("checkbox4isSelected : " +checkbox4.isSelected());

       // WebElement allButtonUncheck = driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
        //allButtonUncheck.click();

    }
}
