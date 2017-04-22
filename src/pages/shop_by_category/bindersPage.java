package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.sql.rowset.serial.SerialStruct;

/**
 * Created by ddantas on 4/10/2017.
 */
public class bindersPage {
    WebDriver driver;

    final String pageUrl = "http://www.staples.com/All-Binders/cat_CG3529";

    public bindersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get ( pageUrl );
    }

    @FindBy( xpath = ".//*[@id='ddTop']/h1")
    private WebElement  pageHeader;

    public WebElement getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }
}
