package pages.shop_by_category;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 */
public class officeBasicsPage {

    WebDriver driver;

    final String pageUrl = "http://www.staples.com/Office-Basics/cat_CG1036";

    public officeBasicsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver,this );
        driver.get ( pageUrl );

    }

    @FindBy(xpath = ".//*[@id='ddTop']/h1")
    private WebElement pageHaeder;

    public WebElement getPageHaeder() {
        return pageHaeder;
    }

    public void setPageHaeder(WebElement pageHaeder) {
        this.pageHaeder = pageHaeder;
    }
}
