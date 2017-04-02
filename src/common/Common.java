package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Common class.
 */
public class Common {

  /***
   * Method to get driver
   * @return WebDriver
   */
  public WebDriver getDriver(){

    System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.15.0-win64\\geckodriver.exe");

    //creates new instance of browser
    WebDriver driver = new FirefoxDriver();


    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    return driver;
  }
}
