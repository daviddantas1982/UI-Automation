package shop_by_category;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import pages.home.HomePage;

import java.io.IOException;

/**
 * Created by ddantas on 3/12/2017.
 */
public class TestShopByCategory {

    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common();

        driver = cm.getDriver();

    }

    @Test
    public void verifyShopByCategoryText() {

        final String shopByCategory = "SHOP BY CATEGORY";

        HomePage page = new HomePage(driver);

        Assert.assertEquals(page.getSearchItem().getText(), shopByCategory);
    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }
}
