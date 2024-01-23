package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class SuccessfulLogin extends TestUtil {

    // Test for successful login with valid credentials.
    @Test(dataProvider = "validUsers")
    public void successfulLogin(String username, String password) {

        // Perform successful login with valid credentials.
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        // Assert that the user is successfully logged in.
        Assert.assertTrue(productPage.isAt());
    }
}
