package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by manpreetsingh on 3/26/17.
 */
public class StoreLocatorPage {

  WebDriver driver;

  final String pageurl = "http://storelocator.staples.com/";

  @FindBy(xpath = "addressInput")
  private WebElement zipCode;

  public StoreLocatorPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    driver.get(pageurl);
  }

  public WebElement getZipCode() {
    return zipCode;
  }

  public void setZipCode(WebElement zipCode) {
    this.zipCode = zipCode;
  }
}
