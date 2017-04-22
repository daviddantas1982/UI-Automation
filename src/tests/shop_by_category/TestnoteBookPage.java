package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.noteBookPage;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 * verify header of the page
 */
public class TestnoteBookPage {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();
        driver = cm.getDriver ();
    }



    @Test
    public void verifyHader() {

        //verification string
        final String pageHeader = "Notebooks";

        //instantiating  noteBookPage class
        noteBookPage header = new noteBookPage(driver);

// using assertEqual method
        Assert.assertEquals ( pageHeader,header.getPageHeader ().getText ());




    }



    @After
    public void tearDown() throws Exception {
        driver .quit ();
    }
}