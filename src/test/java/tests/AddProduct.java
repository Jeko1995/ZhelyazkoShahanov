package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class AddProduct extends TestUtil {

    // Test to add an item to the cart after logging in.
    @Test(dataProvider = "loginAndAddProductInCart")
    public void addItemToCart(String username, String password, String itemName) {

        // Login using provided credentials.
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        // Add an item to the cart and verify that only one item is added.
        productPage.addItemToTheCart(itemName);
        Assert.assertEquals(productPage.getItemsInCart(), 1, "Only one item is added.");
    }
}