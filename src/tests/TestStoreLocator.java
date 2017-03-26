package tests;

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.StoreLocatorPage;

import java.io.IOException;

/**
 * Created by ddantas on 3/12/2017.
 */
public class TestStoreLocator {

    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common();

        driver = cm.getDriver();

    }

    @Test
    public void verifyStoreLocatorAddress() {

        StoreLocatorPage page = new StoreLocatorPage(driver);

        // Enter Zip Code - 01532

        // Verify following Store gets displayed
        // #18 Lyman St
        // Westborough, MA 01581
        // 508.870.8761
        // Store #1216

        // Assert Full Address using following code example
        // Assert.assertEquals(page.getZipCode().getText(), "");
    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }
}
