package pages.shop_by_category;

import com.gargoylesoftware.htmlunit.Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 */
public class artsAndCrafts {
    WebDriver driver ;

    final String pageUrl = "http://www.staples.com/Arts-Crafts/cat_SC5787";

    public artsAndCrafts(WebDriver driver) {
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
