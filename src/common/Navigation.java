package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Class for Home Page.
 */
public class Navigation {

  WebDriver driver;

  @FindBy(xpath = "//*[@id=\"homepage\"]/nav/ul/li[1]/div[1]/span[2]")
  private WebElement searchItem;

  @FindBy(css = "li.nav-item:nth-child(1) > div:nth-child(1) > span:nth-child(2)")
  private WebElement shopAllCategories;

  @FindBy(css = "li.nav-item:nth-child(2) > div:nth-child(1) > span:nth-child(2)")
  private WebElement shopServices;

  @FindBy(css = "li.nav-item:nth-child(3) > div:nth-child(1) > span:nth-child(2)")
  private WebElement shopDeals;

  @FindBy(css = "li.nav-item:nth-child(4) > div:nth-child(1) > span:nth-child(2)")
  private WebElement inkAndTonerFinder;

  @FindBy(xpath = "//*[@id=\"homepage\"]/nav/ul/li[5]/a")
  private WebElement logo;

  @FindBy(xpath = ".//*[@id='homepage']/div[2]/div/ul[2]/li[1]/a")
  private WebElement yourStore;

  @FindBy(css = "li.nav-item:nth-child(7) > div:nth-child(1) > span:nth-child(2)")
  private WebElement easyReorder;

  @FindBy(css = "li.nav-item:nth-child(8) > div:nth-child(1) > span:nth-child(2)")
  private WebElement myAccount;

  @FindBy(css = "#STP--Cart-NumberItems")
  private WebElement cart;

  public Navigation(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement getSearchItem() {
    return searchItem;
  }

  public void setSearchItem(WebElement searchItem) {
    this.searchItem = searchItem;
  }

  public WebElement getShopAllCategories() {
    return shopAllCategories;
  }

  public void setShopAllCategories(WebElement shopAllCategories) {
    this.shopAllCategories = shopAllCategories;
  }

  public WebElement getShopServices() {
    return shopServices;
  }

  public void setShopServices(WebElement shopServices) {
    this.shopServices = shopServices;
  }

  public WebElement getShopDeals() {
    return shopDeals;
  }

  public void setShopDeals(WebElement shopDeals) {
    this.shopDeals = shopDeals;
  }

  public WebElement getInkAndTonerFinder() {
    return inkAndTonerFinder;
  }

  public void setInkAndTonerFinder(WebElement inkAndTonerFinder) {
    this.inkAndTonerFinder = inkAndTonerFinder;
  }

  public WebElement getLogo() {
    return logo;
  }

  public void setLogo(WebElement logo) {
    this.logo = logo;
  }

  public WebElement getYourStore() {
    return yourStore;
  }

  public void setYourStore(WebElement yourStore) {
    this.yourStore = yourStore;
  }

  public WebElement getEasyReorder() {
    return easyReorder;
  }

  public void setEasyReorder(WebElement easyReorder) {
    this.easyReorder = easyReorder;
  }

  public WebElement getMyAccount() {
    return myAccount;
  }

  public void setMyAccount(WebElement myAccount) {
    this.myAccount = myAccount;
  }

  public WebElement getCart() {
    return cart;
  }

  public void setCart(WebElement cart) {
    this.cart = cart;
  }

  @Override
  public String toString() {
    return "Navigation{" +
            "driver=" + driver +
            ", searchItem=" + searchItem +
            ", shopAllCategories=" + shopAllCategories +
            ", shopServices=" + shopServices +
            ", shopDeals=" + shopDeals +
            ", inkAndTonerFinder=" + inkAndTonerFinder +
            ", logo=" + logo +
            ", yourStore=" + yourStore +
            ", easyReorder=" + easyReorder +
            ", myAccount=" + myAccount +
            ", cart=" + cart +
            '}';
  }
}
