package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.shop_by_category.bindersPage;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 * create class Testbinders to verify pageHeader
 */
public class Testbinders {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common ();
        driver = cm.getDriver ();
    }

    @Test
    public void verifyHeader()
    {
        final String pageHeader = "Binders";

        bindersPage binders = new bindersPage (driver);

        Assert.assertEquals ( pageHeader, binders.getPageHeader ().getText () );
    }

    @After
    public void tearDown() throws Exception {
        driver.quit ();
    }

}