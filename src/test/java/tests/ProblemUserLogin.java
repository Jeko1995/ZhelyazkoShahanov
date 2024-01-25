package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.ProductPage;

public class ProblemUserLogin extends TestUtil {

    // Test to verify login failure for problem users.
    @Test(dataProvider = "problemUsers")
    public void problemUsersLogin(String username, String password) {

        // Attempt to login with problem user credentials.
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        // Use SoftAssert to verify that the user is logged in.
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productPage.isAt(), true, "The user is not logged in.");

        // Perform all verifications and fail at the end if any assert fails.
        softAssert.assertAll();
    }
}