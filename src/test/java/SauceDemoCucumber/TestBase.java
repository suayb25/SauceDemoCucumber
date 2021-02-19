package SauceDemoCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                     "src\\test\\resources\\config.properties");//for viewing cucumber online report
            prop.load(fis);
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void initialisation() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src\\test\\resources\\config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println(prop.getProperty("browser"));
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",".\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(prop.getProperty("url"));
    }
}
