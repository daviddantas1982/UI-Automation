package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.copyAndMultipurposePaper;

/**
 * Created by ddantas on 4/10/2017.
 */
public class TestcopyAndMultipurposePaper {
    WebDriver driver;

    @Before
    public  void setUp() throws Exception{
        Common cm = new Common ();
        driver = cm.getDriver ();

    }
    @Test
    public  void verifyHeader(){

        //verify string
        final  String copyAndMultipurposePaperHeader = "Copy & Multipurpose Paper";


        //instantiating copyAndMultipurposePaper class
        copyAndMultipurposePaper header = new copyAndMultipurposePaper(driver);

        // using assertEqual mmethod
        Assert.assertEquals ( copyAndMultipurposePaperHeader,header.getPageHeader ().getText () );






    }


    @After
    public  void tearDown() throws  Exception{

        driver.quit ();
    }
}
