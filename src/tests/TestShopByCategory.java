
import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
