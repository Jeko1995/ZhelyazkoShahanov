package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    private final static String BASE_PRODUCT_ID = "add-to-cart-sauce-labs-";

    // Elements
    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartBadge;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement burgerMenuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutBtn;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartBtn;

    // Constructor
    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods i.e. actions on the page
    // Checks if the current page is the Product Page.
    public boolean isAt() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        try {
            burgerMenuBtn.click();
            wait.until(ExpectedConditions.visibilityOf(logoutBtn));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Adds an item to the cart by clicking on it.
    public void addItemToTheCart(String itemName) {
        WebElement itemToBeAdded = driver.findElement(By.id(BASE_PRODUCT_ID + itemName));
        itemToBeAdded.click();
    }

    // Gets the number of items in the cart.
    public int getItemsInCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartBadge));
        return Integer.parseInt(shoppingCartBadge.getText());
    }

    // Clicks on the shopping cart button to go to the Checkout Cart Page.
    public CheckoutCartPage clickCardBtn() {
        shoppingCartBtn.click();
        return new CheckoutCartPage(driver);
    }
}
