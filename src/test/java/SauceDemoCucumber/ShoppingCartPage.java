package SauceDemoCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends TestBase {

    @FindBy(css = ".btn_action.checkout_button")
    private static WebElement checkout;

    public static void clickCheckout() {
        checkout.click();
    }
}
