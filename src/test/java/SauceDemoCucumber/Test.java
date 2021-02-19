package SauceDemoCucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Test extends TestBase {
    @Given("I navigate to sauce demo web site")
    public void i_navigate_to_sauce_demo_web_site() throws Throwable {
        TestBase.initialisation();
    }

    @When("I enter user name and password")
    public void i_enter_user_name_and_password() throws Throwable {
        PageFactory.initElements(driver, LogInPage.class);
        LogInPage.enterUsernamePassword(prop.getProperty("username"), prop.getProperty("password"));
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() throws Throwable {
        LogInPage.clickLoginButton();
    }

    @Then("I sort the products from low to high")
    public void i_sort_the_products_from_low_to_high() throws Throwable {
        PageFactory.initElements(driver, InventoryPage.class);
        InventoryPage.sortProductsLowToHigh();
    }

    @Then("I added first product")
    public void i_added_first_product() throws Throwable {
        PageFactory.initElements(driver, InventoryPage.class);
        InventoryPage.addFirstProduct();
    }

    @Then("I open the shopping cart page")
    public void i_open_the_shopping_cart_page() throws Throwable {
        PageFactory.initElements(driver, InventoryPage.class);
        InventoryPage.clickCartButton();
    }

    @Then("I check the added item is correct")
    public void i_check_the_added_item_is_correct() throws Throwable {
        PageFactory.initElements(driver, InventoryPage.class);
        InventoryPage.checkAddedItem();
    }

    @Then("I click on checkout button")
    public void i_click_on_checkout_button() throws Throwable {
        PageFactory.initElements(driver, ShoppingCartPage.class);
        ShoppingCartPage.clickCheckout();
    }

    @Then("I enter contact details")
    public void i_enter_contact_details() throws Throwable {
        PageFactory.initElements(driver, CheckoutPage.class);
        CheckoutPage.enterContactDetails(prop.getProperty("firstname"), prop.getProperty("lastname"),
                prop.getProperty("postcode"));
    }

    @Then("I click on continue button")
    public void i_click_on_continue_button() throws Throwable {
        CheckoutPage.clickContinueBtn();
    }

    @Then("I click on finish button")
    public void i_click_on_finish_button() throws Throwable {
        CheckoutPage.clickFinishBtn();
    }

    @And("I logout")
    public void i_logout() throws Throwable {
        PageFactory.initElements(driver, MenuPage.class);
        MenuPage.clickMenu();
        MenuPage.logout();
    }
}
