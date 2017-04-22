package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.artsAndCrafts;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 */
public class TestArtsAndCrafts {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();
        driver = cm.getDriver ();

    }

    @Test
    public void verifyHeader() throws Exception {

        final String pageHeader = "Arts & Crafts";

        artsAndCrafts atrsAndCrafts = new artsAndCrafts (driver);

        Assert.assertEquals ( pageHeader,atrsAndCrafts.getPageHeader ().getText () );

    }

    @After
    public void tearDown() throws Exception {
    }

}