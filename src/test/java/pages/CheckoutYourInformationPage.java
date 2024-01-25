package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutYourInformationPage extends BasePage{

    //elements
    @FindBy(id = "first-name")
    private WebElement FirstNameInput;

    @FindBy(id = "last-name")
    private WebElement LastNameInput;

    @FindBy(id = "postal-code")
    private WebElement PostalCodeInput;

    @FindBy(name = "continue")
    private WebElement ContinueBtn;

    //constructor
    public CheckoutYourInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //methods i.e. actions on the page
    //Fills in the user's information and continues to the next page
    public CheckoutOverviewPage fillInDataAndContinue(String FirstName, String LastName, String Postalcode){
        FirstNameInput.click();
        FirstNameInput.clear();
        FirstNameInput.sendKeys(FirstName);

        LastNameInput.click();
        LastNameInput.clear();
        LastNameInput.sendKeys(LastName);

        PostalCodeInput.click();
        PostalCodeInput.clear();
        PostalCodeInput.sendKeys(Postalcode);

        ContinueBtn.click();

        return new CheckoutOverviewPage(driver);
    }

}