package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    private final static String BASE_PRODUCT_ID = "add-to-cart-sauce-labs-";

    //elements
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

    //constructor
    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //methods i.e. actions on the page
    public boolean isAt() {
        burgerMenuBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        try {
            wait.until(ExpectedConditions.visibilityOf(logoutBtn));

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void addItemToTheCart(String itemName) {
        WebElement itemToBeAdded = driver.findElement(By.id(BASE_PRODUCT_ID + itemName));
        itemToBeAdded.click();
    }

    public int getItemsInCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartBadge));
        return Integer.parseInt(shoppingCartBadge.getText());
    }

    public CartPage clickCardBtn() {
    shoppingCartBtn.click();
        return new CartPage(driver);
    }
}
