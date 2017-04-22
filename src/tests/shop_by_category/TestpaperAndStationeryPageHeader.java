package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_by_category.paperAndStationeryPage;

/**
 *  This is Test class which verfies page header
 * Created by ddantas on 4/10/2017.
 *
 */
public class TestpaperAndStationeryPageHeader {

    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common ();
        driver = cm.getDriver ();

    }


    @Test
    public  void verifyInkAndTonerHeader(){


        //ink and toner page header
        final String paperAndStationeryHeader = "Paper & Stationery";

        //paperAndStationeryPage class instantiating
        paperAndStationeryPage header = new paperAndStationeryPage ( driver );

        //usning assertEqual method to verify actual header

        Assert.assertEquals (paperAndStationeryHeader, header.getPaperAndStationeryPageHeader().getText ());

    }


    @After
    public void tearDown() throws Exception{

        /* quiting browser */
        driver.quit ();
    }



}
