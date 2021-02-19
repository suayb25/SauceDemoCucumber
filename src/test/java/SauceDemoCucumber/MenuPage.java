package SauceDemoCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends TestBase{

    @FindBy(css = "div.bm-burger-button")
    static WebElement menu;

    @FindBy(id = "logout_sidebar_link")
    static WebElement logoutButton;

    public static void clickMenu() {
        menu.click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        logoutButton = driver.findElement(By.id("logout_sidebar_link"));
    }

    public static void logout() {
            try{
                logoutButton = driver.findElement(By.id("logout_sidebar_link"));//because of the static environment we need to set logout button again
                logoutButton.click();
            }catch (Exception e){
                System.out.println("Please open your chrome when program running. Otherwise there will be element not interactable exception.");
                System.out.println("Check the MenuPage.java");
                //I tried this several times. When the program running, If I take the browser subtab, it fails. I guess it may be due to the browser version.
                //I just wanted to write a comment about it.
            }
    }
}
