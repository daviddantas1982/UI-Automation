package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/9/2017.
 *
 * class for inkAndTonerPage
 */
public class inkAndTonerPage {
    WebDriver driver;

    final String pageurl ="http://www.staples.com/Ink-Toner-Finder/cat_SC43";

    //Constructor
    public inkAndTonerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this) ;
        driver.get ( pageurl );

    }



    @FindBy(xpath = ".//*[@id='inkAndTonerApp']/div/div[2]/div[1]/h1")
    private WebElement  pageHeader;

    //getter method for  pageHeader
    public WebElement getPageHeader() {
        return pageHeader;
    }

    //setter method for  pageHeader
    public void setPageHeader(WebElement pageHeader) {
        this.pageHeader = pageHeader;
    }


}
