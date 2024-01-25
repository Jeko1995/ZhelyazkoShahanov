package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.List;

public class CheckoutProducts extends TestUtil {

    // Test to checkout products after adding them to the cart.
    @Test(dataProvider = "loginAndCheckoutProducts")
    public void checkoutProducts(String username, String password, List<String> items, String firstName,
                                 String lastName, String postalCode) {

        // Login using provided credentials.
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        // Add items to the cart.
        for (String itemName : items) {
            productPage.addItemToTheCart(itemName);
        }

        // Go to the Checkout Cart page and proceed to Checkout Your Information page.
        CheckoutCartPage cartPage = productPage.clickCardBtn();
        CheckoutYourInformationPage yourInformationPage = cartPage.clickCheckoutBtn();

        // Fill in user's information and continue to the Checkout Overview page.
        CheckoutOverviewPage overviewPage = yourInformationPage.fillInDataAndContinue(firstName, lastName, postalCode);

        // Click the "Finish" button and verify that the checkout process is complete.
        CheckoutCompletePage completePage = overviewPage.clickFinishBtn();
        Assert.assertTrue(completePage.isCheckoutFinish());
    }
}