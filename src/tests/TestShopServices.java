package tests;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.io.IOException;

/**
 * Created by ddantas on 3/12/2017.
 */
public class TestShopServices {

    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common();

        driver = cm.getDriver();

    }

    @Test
    public void verifyShopServicesText() {

        final String shopServices = "Shop Services";

        HomePage page = new HomePage(driver);

        Assert.assertEquals(page.getShopServices().getText(), shopServices);
    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }
}
