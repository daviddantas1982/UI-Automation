package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.inkAndTonerPage;

/**
 * Created by ddantas on 4/9/2017.
 */
public class TestInkAndTonerHeader {

    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common ();
        driver = cm.getDriver ();

    }


    @Test
    public  void verifyInkAndTonerHeader(){


        //ink and toner page header
        final String inkAndTonerHeader = "Printer Ink Cartridges & Toner Finder";

        //inkAndTonerPage class instantiating
        inkAndTonerPage header = new inkAndTonerPage ( driver );

        //usning assertEqual method to verify actual header

        Assert.assertEquals (inkAndTonerHeader, header.getPageHeader ().getText ());






    }


    @After
    public void tearDown() throws Exception{
        driver.quit ();
    }




}
