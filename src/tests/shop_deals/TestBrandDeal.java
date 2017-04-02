package shop_deals;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_deal.DailyDealPage;

/**
 * Created by ddantas on 4/1/2017.
 */
public class TestBrandDeal {
    protected WebDriver driver;
    @Before
    public void setUp() throws Exception {
        Common cm = new Common();

        driver = cm.getDriver();

    }

    @Test
    public  void verifyShopByText()
    {
        final  String checkDailyDeals =  "SHOP DEALS";

        final boolean checked = false;

        DailyDealPage page = new DailyDealPage(driver);

        Assert.assertEquals(page.getDailyDealHeading().getText(), checkDailyDeals);

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}