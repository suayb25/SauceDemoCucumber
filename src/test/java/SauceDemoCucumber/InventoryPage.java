package SauceDemoCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage extends TestBase{
    static String product1;

    @FindBy(className = "product_sort_container")
    static WebElement sortProducts;

    @FindBy(css = ".inventory_list .inventory_item:nth-of-type(1) .btn_inventory")
    static WebElement firstProduct;

    @FindBy(css = "svg[role='img']")
    static WebElement cartButton;

    public static void sortProductsLowToHigh() {
        Select objSelect = new Select(sortProducts);
        objSelect.selectByVisibleText("Price (low to high)");
    }

    public static void addFirstProduct() {
        firstProduct.click();
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        product1 = products.get(0).getText(); //we store first added item
    }

    public static boolean checkAddedItem() {
        return product1.equals("Sauce Labs Onesie");
    }

    public static void clickCartButton() {
        cartButton.click();
    }
}
