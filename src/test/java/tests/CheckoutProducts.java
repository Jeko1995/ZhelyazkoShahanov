package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

import java.util.List;

public class CheckoutProducts extends TestUtil {
    @Test(dataProvider = "loginAndCheckoutProducts")
    public void CheckoutProducts(String username, String password, List<String> items) {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        for (String itemName : items) {
            productPage.addItemToTheCart(itemName);
        }

        CartPage cartPage = productPage.clickCardBtn();
    }
}
