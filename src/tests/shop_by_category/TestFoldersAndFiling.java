package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.foldersAndFiling;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 */
public class TestFoldersAndFiling {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();
        driver= cm.getDriver ();


    }

    @Test
    public  void verifyHeader(){

        final String pageHeader = "Folders & Filing";

        foldersAndFiling header = new foldersAndFiling (driver);

        Assert.assertEquals ( pageHeader,header.getPageHeader ().getText () );
    }

    @After
    public void tearDown() throws Exception {
        driver.quit ();
    }

}