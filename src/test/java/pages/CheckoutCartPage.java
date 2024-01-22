package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCartPage extends BasePage{

    //elements
    @FindBy(id = "checkout")
    private WebElement CheckoutBtn;

    //constructor
    public CheckoutCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //methods i.e. actions on the page
    public CheckoutYourInformationPage clickCheckoutBtn() {
        CheckoutBtn.click();
        return new CheckoutYourInformationPage(driver);
    }
}
