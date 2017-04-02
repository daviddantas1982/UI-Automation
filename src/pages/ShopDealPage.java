package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/1/2017.
 */
public class ShopDealPage {

    WebDriver driver;

    final String pageUrl = "http://www.staples.com/";

    public WebElement getClickSearchDeal() {
        return clickSearchDeal;
    }

    public void setClickSearchDeal(WebElement clickSearchDeal) {
        this.clickSearchDeal = clickSearchDeal;
    }

    @FindBy(xpath = ".//*[@id='homepage']/nav/ul/li[3]/div[1]")
    private  WebElement clickSearchDeal;

    public WebElement getClickDailyDealsAndMore() {
        return clickDailyDealsAndMore;
    }

    public void setClickDailyDealsAndMore(WebElement clickDailyDealsAndMore) {
        this.clickDailyDealsAndMore = clickDailyDealsAndMore;
    }

    @FindBy(xpath= ".//*[@id='homepage']/nav/ul/li[3]/div[2]/div/ul/li[1]/a")
    private WebElement clickDailyDealsAndMore;

    public ShopDealPage( WebDriver driver)
    {
       this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(pageUrl);
    }





}
