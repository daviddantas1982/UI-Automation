package pages.office_supplies;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ddantas on 4/4/2017.
 */
public class OfficeSupplies {

    protected WebDriver driver;

    public OfficeSupplies(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);

    }

    public WebDriver getDriver()
    {
        return  driver;
    }
public  InkTonerPage navigateToInkTonerpage()
    {
        driver.navigate().to("http://www.staples.com/Ink-Toner-Finder/cat_SC43");
        return  new InkTonerPage(driver);
    }

    public  PaperAndStationeryPage navigateToPaperAndStationery()
    {
        driver.navigate().to("http://www.staples.com/Paper-Stationery/cat_SC1676");
        return  new PaperAndStationeryPage(driver);
    }

}
