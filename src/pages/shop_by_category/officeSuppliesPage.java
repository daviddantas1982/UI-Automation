package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 * officeSuppliesPage class get page and webelement
 */
public class officeSuppliesPage {
    WebDriver driver;

    final String pageUrl = "http://www.staples.com/Office-Supplies/cat_SC1";

    public officeSuppliesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get ( pageUrl );
    }
    @FindBy(xpath = ".//*[@id='ddTop']/h1")
    private WebElement pageHeader;

    public WebElement getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }
}
