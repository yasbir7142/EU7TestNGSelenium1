package com.cybertek.tests.day13_pom;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

    @Test
    public void loginAsDriver(){

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
       String password = ConfigurationReader.get("driver_password");

       loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
       loginPage.loginBtn.click();
        loginPage.loginAsDriver();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/");


    }


}
