package office_supplies;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import pages.office_supplies.InkTonerPage;
import pages.office_supplies.OfficeSupplies;

/**
 * Created by ddantas on 4/3/2017.
 */
public class TestInkToner {

   protected WebDriver driver;



    @Before
    public void setUp() throws Exception {
        Common cm = new Common();

        driver = cm.getDriver();
    }

    @Test
    public void verifyHeaderText() throws Exception {

        InkTonerPage inkTonerPage = new InkTonerPage(driver);

        inkTonerPage = inkTonerPage.navigateToInkTonerpage();

        Assert.assertTrue(inkTonerPage.getHeaderText().getText().contains("Printer Ink Cartridges & Toner Finder"));




    }

    @After
    public void tearDown() throws Exception {

        //use quit method
        driver.quit();

    }
}
