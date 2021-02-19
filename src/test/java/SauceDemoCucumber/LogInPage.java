package SauceDemoCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {

    // Page Factory
    @FindBy(id = "user-name")
    static WebElement username;

    @FindBy(id = "password")
    static WebElement password;

    @FindBy(id = "login-button")
    static WebElement loginButton;

    public static void enterUsernamePassword(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
    }

    public static void clickLoginButton() {
        loginButton.click();
    }
}
