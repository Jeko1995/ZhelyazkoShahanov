package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.util.List;

public class CheckoutProducts extends TestUtil {
    @Test(dataProvider = "loginAndCheckoutProducts")
    public void CheckoutProducts(String username, String password, List<String> items, String firstName,
                                 String lastName, String postalCode){
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login(username, password);

        for (String itemName : items) {
            productPage.addItemToTheCart(itemName);
        }

        CheckoutCartPage cartPage = productPage.clickCardBtn();
        CheckoutYourInformationPage yourInformationPage = cartPage.clickCheckoutBtn();

        CheckoutOverviewPage overviewPage = yourInformationPage.FillInDataAndContinue(firstName, lastName, postalCode);
        CheckoutCompletePage completePage = overviewPage.ClickFinishBtn();

        Assert.assertTrue(completePage.isCheckoutFinish());


    }
}
