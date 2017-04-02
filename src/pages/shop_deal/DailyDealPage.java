package pages.shop_deal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Page Class for Daily Deal.
 */
public class DailyDealPage {

    WebDriver driver;

    final String pageUrl = "http://www.staples.com/deals/Staples-Daily-Deals/BI1142421?l1=1&supercategory=&bopis=false&page=2&icid=HP:HPDEALSDROP:DAILYDEALS:2016";

    @FindBy(xpath = "//*[@id=\"ddTop\"]/h1")
    private WebElement dailyDealHeading;

    @FindBy(css = "#secondaryTiles > div > div > div > div.product-details > a")
    private List<WebElement> productDetailLink;
    // region Getter Setters

    public WebElement getDailyDealHeading() {
        return dailyDealHeading;
    }

    public void setDailyDealHeading(WebElement dailyDealHeading) {
        this.dailyDealHeading = dailyDealHeading;
    }

    public List<WebElement> getProductDetailLink() {
        return productDetailLink;
    }

    public void setProductDetailLink(List<WebElement> productDetailLink) {
        this.productDetailLink = productDetailLink;
    }

// endregion Getter Setters

    /***
     * Constructor
     * @param driver
     */
    public DailyDealPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }
}
