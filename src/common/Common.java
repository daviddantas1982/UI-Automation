package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by manpreetsingh on 3/26/17.
 */
public class Common {

  public WebDriver getDriver(){

    WebDriver driver = new SafariDriver();

    driver.manage().window().maximize();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    return driver;
  }
}
