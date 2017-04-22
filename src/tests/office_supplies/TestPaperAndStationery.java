package office_supplies;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.office_supplies.PaperAndStationeryPage;

/**
 * Created by ddantas on 4/4/2017.
 */
public class TestPaperAndStationery {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common ( );

        driver = cm.getDriver ( );


    }

    @Test
    public void verifyHeaderText() throws Exception {

        PaperAndStationeryPage page = new PaperAndStationeryPage ( driver );

        page = page.navigateToPaperAndStationery ( );

        Assert.assertTrue ( page.getPaperAndStationeryHeaderText ( ).getText ( ).contains ( "Paper & Stationery" ) );


    }

    @After
    public void tearDown() throws Exception {

        driver.quit ( );

    }
}

