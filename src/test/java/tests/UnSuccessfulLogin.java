package tests;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class UnSuccessfulLogin extends TestUtil {

    @Test (dataProvider = "invalidUsers")
    public void UnsuccessfulLoginTest(String username, String password){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        Assert.assertTrue(loginPage.isLoginErrorMsgDisplayed());
    }
}
