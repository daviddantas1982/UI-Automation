package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.notePadsPage;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 * create class TestNotepads class for verifying page header
 */
public class TestNotePads {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();

        driver = cm.getDriver ();


    }

    @Test
    public  void verifyHeader()
    {
        //verification header
        final String pageHeader = "Notepads";

        // notePadsPage initialisation
        notePadsPage header = new notePadsPage (driver);


        //verifying pageHeader string using assertEqual method
        Assert.assertEquals ( pageHeader,header.getPageHeader ().getText () );




    }

    @After
    public void tearDown() throws Exception {
        driver.quit ();
    }

}