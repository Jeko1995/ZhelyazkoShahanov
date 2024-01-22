package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.ProductPage;

public class ProblemUserLogin extends TestUtil {

    @Test(dataProvider = "problemUsers")
    public  void problemUsersLogin(String username, String password){

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(productPage.isAt(), true, "The user is not logged in.");

        softAssert.assertAll();
    }
}
