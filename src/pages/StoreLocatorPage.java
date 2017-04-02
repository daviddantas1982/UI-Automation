package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Class for Store Locator Page.
 */
public class StoreLocatorPage {

  WebDriver driver;

  final String pageurl = "http://storelocator.staples.com/";

  public List<WebElement> getStoreAddress() {
    return storeAddress;
  }

  public void setStoreAddress(List<WebElement> storeAddress) {
    this.storeAddress = storeAddress;
  }

  @FindBy(id = "addressInput")
  private WebElement zipCode;

  @FindBy(xpath = "//*[@id=\"1216\"]/div[3]/div/span")
  private List<WebElement> storeAddress;

  /***
   * Constructor for Store Locator Class
   * @param driver
   */
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
