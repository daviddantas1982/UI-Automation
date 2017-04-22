package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 */
public class copyAndMultipurposePaper {
     WebDriver driver;
    final  String pageUrl = "http://www.staples.com/Copy-Resume-Multipurpose-Paper/cat_CL140691";

    public copyAndMultipurposePaper(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get(pageUrl);
    }

    @FindBy(xpath = ".//*[@id='all-products']/div[2]/div[1]/div[2]/h1")
    private WebElement pageHeader;

    public WebElement getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }
}
