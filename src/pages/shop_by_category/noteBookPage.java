package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 * this is notebook class gets page url and finds elements
 */
public class noteBookPage {
     WebDriver driver ;

    final String pageUrl = "http://www.staples.com/Notebooks-Pads/cat_CG3783";

    //noteBookPage constructor
    public noteBookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get ( pageUrl );
    }

    //findby method
    @FindBy(xpath = ".//*[@id='ddTop']/h1")
    private WebElement pageHeader;

    //getter method
    public WebElement getPageHeader() {
        return pageHeader;
    }

    //setter method
    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }
}


