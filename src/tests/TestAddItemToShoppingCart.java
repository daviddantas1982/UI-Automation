package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

/**
 * Created by ddantas on 3/12/2017.
 */
public class TestAddItemToShoppingCart {

    public static void main(String[] args) {

        File file = new File("C:/IEDriverServer.exe");

        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

        WebDriver driver = new InternetExplorerDriver();

        driver.get("http://www.staples.com");

        //Close the browser
        driver.quit();
    }
}
