package pages.shop_deal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Class for Shop Deal.
 */
public class BrandDealPage {

    WebDriver driver;

    final String pageUrl = "http://www.staples.com/deals/Staples-Daily-Deals/BI1142421?l1=1&supercategory=&bopis=false&page=2&icid=HP:HPDEALSDROP:DAILYDEALS:2016";

    @FindBy(xpath = ".//*[@id='homepage']/nav/ul/li[3]/div[1]")
    private WebElement clickSearchDeal;

    @FindBy(xpath = ".//*[@id='homepage']/nav/ul/li[3]/div[2]/div/ul/li[1]/a")
    private WebElement clickDailyDealsAndMore;

    // region Getter Setters

    public WebElement getClickSearchDeal() {
        return clickSearchDeal;
    }

    public void setClickSearchDeal(WebElement clickSearchDeal) {
        this.clickSearchDeal = clickSearchDeal;
    }

    public WebElement getClickDailyDealsAndMore() {
        return clickDailyDealsAndMore;
    }

    public void setClickDailyDealsAndMore(WebElement clickDailyDealsAndMore) {
        this.clickDailyDealsAndMore = clickDailyDealsAndMore;
    }

    // endregion Getter Setters

    /***
     * Constructor
     * @param driver
     */
    public BrandDealPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }
}
