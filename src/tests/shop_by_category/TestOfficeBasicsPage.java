package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.officeBasicsPage;

import static org.junit.Assert.*;

/**
 * Created by ddantas on 4/10/2017.
 */
public class TestOfficeBasicsPage {
    protected WebDriver driver ;

    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();
        driver = cm.getDriver ();

    }

    @Test
    public  void verifyHeader(){

        final String pageHeader = "Office Basics";

        //initializing officeBasicsPage class
        officeBasicsPage header = new officeBasicsPage (driver);

        //using assertEqual method

        Assert.assertEquals ( pageHeader,header.getPageHaeder ().getText () );


    }

    @After
    public void tearDown() throws Exception {
        driver.quit ();
    }


}