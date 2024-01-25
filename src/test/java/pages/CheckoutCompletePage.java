package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletePage extends BasePage{

    //elements
    @FindBy(name = "back-to-products")
    private WebElement BackHomeBtn;

    //constructor
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //methods i.e. actions on the page
    //Checks if the checkout process is complete
    public boolean isCheckoutFinish(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        try {
            wait.until(ExpectedConditions.visibilityOf(BackHomeBtn));

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}