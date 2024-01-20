package tests;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;
import pages.ProductPage;

import java.time.Duration;

public class successfulLogin extends TestUtil {

    @Test
    public  void successfulLogin(){

        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(productPage.isAt());

        /*

        WebElement burgerMenuBtn = driver.findElement(By.id("react-burger-menu-btn"));
        burgerMenuBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        Assert.assertTrue(logoutBtn.isDisplayed());

         */
    }
}
