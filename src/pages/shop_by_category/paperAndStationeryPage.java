package pages.shop_by_category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/10/2017.
 */
public class paperAndStationeryPage {

    WebDriver driver;
    final String pageurl = "http://www.staples.com/Paper-Stationery/cat_SC1676";

    public paperAndStationeryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this  );
        driver.get ( pageurl );
    }

    @FindBy(xpath = ".//*[@id='ddTop']/h1")
    private WebElement paperAndStationeryPageHeader;

    public WebElement getPaperAndStationeryPageHeader() {
        return paperAndStationeryPageHeader;
    }

    public void setPaperAndStationeryPageHeader(WebElement paperAndStationeryPageHeader) {
        this.paperAndStationeryPageHeader = paperAndStationeryPageHeader;
    }
}
