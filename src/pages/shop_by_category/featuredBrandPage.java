package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 *  create featuredBrandPage class which gets webelement through @FindBy method
 *
 */
public class featuredBrandPage {
    WebDriver driver;

    final String pageUrl = "http://www.staples.com/3M-Brand-Shop/cat_BI1296292";

    public featuredBrandPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
    }

    @FindBy(xpath = " ")
    private WebElement pageHeader;

    public WebElement getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }
}
