package SauceDemoCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends TestBase {

    @FindBy(id = "first-name")
    static WebElement firstName;

    @FindBy(id = "last-name")
    static WebElement lastName;

    @FindBy(id = "postal-code")
    static WebElement postCode;

    @FindBy(css = ".cart_button")
    static WebElement finishBtn;

    @FindBy(css = "[type='submit']")
    static WebElement continueBtn;

    public static void enterContactDetails(String firstname, String lastname, String postalCode) {
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        postCode.sendKeys(postalCode);
    }

    public static void clickContinueBtn() {
        continueBtn.click();
    }

    public static void clickFinishBtn() {
        finishBtn.click();
    }
}
