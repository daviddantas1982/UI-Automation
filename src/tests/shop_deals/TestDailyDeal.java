package shop_deals;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.shop_deal.DailyDealPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ddantas on 4/1/2017.
 */
public class TestDailyDeal {
    protected WebDriver driver;
    @Before
    public void setUp() throws Exception {
        Common cm = new Common();

        driver = cm.getDriver();

    }

    @Test
    public  void verifyShopDailyDealText()
    {
        final  String checkDailyDeals =  "Staples Daily Deals";

        final boolean checked = false;

        DailyDealPage page = new DailyDealPage(driver);

        checkDailyDeals.equalsIgnoreCase(page.getDailyDealHeading().getText());

        Assert.assertEquals(page.getDailyDealHeading().getText(), checkDailyDeals);
    }

    @Test
    public  void verifyShopDailyDealLinkText()
    {
        // Second Link Text of Product
        final  String checkDailyDeals =  "Seagate Backup Plus Slim 2TB Portable Hard Drives with Mobile...";

        DailyDealPage page = new DailyDealPage(driver);

        System.out.println("Second Link is " + page.getProductDetailLink().get(1).getText());
        Assert.assertEquals(checkDailyDeals, page.getProductDetailLink().get(1).getText());
    }

    @Test
    public  void verifyShopDailyDealAllLinksText()
    {
        // Expected Product Details Links Text
        final List<String> expectedDailyDealsLinkList = new ArrayList<String>();
        expectedDailyDealsLinkList.add("Staples® Multiuse Copy Paper, 8 1/2\" x 11\", 8-Ream Case");
        expectedDailyDealsLinkList.add("Seagate Backup Plus Slim 2TB Portable Hard Drives with Mobile...");
        expectedDailyDealsLinkList.add("Dell i3552-3240BLK 15.6\",Intel Pentium N3700 1.6GHz Processor, 4...");

        DailyDealPage page = new DailyDealPage(driver);

        for (int i = 0; i < expectedDailyDealsLinkList.size(); i++) {
            System.out.println("Product Details Link is " + page.getProductDetailLink().get(i).getText());
            Assert.assertEquals(expectedDailyDealsLinkList.get(i), page.getProductDetailLink().get(i).getText());
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}