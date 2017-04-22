package pages.shop_by_category;

import com.gargoylesoftware.htmlunit.PageCreator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 * creates shopByIndustryPage class and navigates to page
 */
public class shopByIndustryPage {
    WebDriver driver;

    final String pageUrl = "http://www.staples.com/Shop-by-Industry/cat_SC5874";

    public shopByIndustryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get ( pageUrl );
    }

    @FindBy(xpath = ".//*[@id='intro']/h1")
    private WebElement pageHeader;

    public WebElement getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }
}
