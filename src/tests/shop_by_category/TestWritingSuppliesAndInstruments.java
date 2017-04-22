package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.shop_by_category.writingSuppliesAndInstruments;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 */
public class TestWritingSuppliesAndInstruments {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        //initializing  Common  class
        Common cm = new Common ();
        driver = cm.getDriver ();
    }

    @Test
    public void verifyHeader()
    {
        final String pageHeader = "Writing Supplies & Instruments";

        //initializing  writingSuppliesAndInstruments class

        writingSuppliesAndInstruments header = new  writingSuppliesAndInstruments(driver);


        //verifying string using assertEqual

        Assert.assertEquals (pageHeader, header.getPageHeader ().getText () );
    }

    @After
    public void tearDown() throws Exception {
        driver.quit ();
    }


}