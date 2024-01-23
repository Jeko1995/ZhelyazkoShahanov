package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCartPage extends BasePage {

    // Elements
    @FindBy(id = "checkout")
    private WebElement checkoutBtn;

    // Constructor
    public CheckoutCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Methods i.e. actions on the page
    //Clicks the checkout button on the Checkout Cart page
    public CheckoutYourInformationPage clickCheckoutBtn() {
        checkoutBtn.click();
        return new CheckoutYourInformationPage(driver);
    }
}
