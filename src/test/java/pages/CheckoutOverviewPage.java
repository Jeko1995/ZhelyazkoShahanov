package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage{

    //elements
    @FindBy(name = "finish")
    private WebElement FinishBtn;

    //constructor
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //methods i.e. actions on the page
    //Clicks the "Finish" button on the Checkout Overview page
    public CheckoutCompletePage clickFinishBtn(){
        FinishBtn.click();

        return new CheckoutCompletePage(driver);
    }
}
