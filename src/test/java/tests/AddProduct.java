package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class AddProduct extends TestUtil {

    @Test(dataProvider = "loginAndAddProductInCart")
    public  void AddItemToCart(String username, String password, String itemName){

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        productPage.addItemToTheCart(itemName);
        Assert.assertEquals(productPage.getItemsInCart(), 1, "Only one item is added.");
    }
}
