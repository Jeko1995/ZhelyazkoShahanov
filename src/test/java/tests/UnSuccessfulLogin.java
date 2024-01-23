package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class UnSuccessfulLogin extends TestUtil {

    // Test for unsuccessful login with invalid credentials.
    @Test(dataProvider = "invalidUsers")
    public void unsuccessfulLoginTest(String username, String password) {

        // Perform unsuccessful login with invalid credentials.
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        // Assert that the login error message is displayed.
        Assert.assertTrue(loginPage.isLoginErrorMsgDisplayed());
    }
}
