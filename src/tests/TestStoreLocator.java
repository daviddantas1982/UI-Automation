

import common.Common;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.StoreLocatorPage;

import java.io.IOException;
import java.util.List;
import java.util.Set;

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
       page.getZipCode().clear();
       page.getZipCode().sendKeys("01532");
       page.getZipCode().sendKeys(Keys.RETURN);

       /*WebElement inputLocator =  driver.findElement(By.id("addressInput"));
       inputLocator.clear();
       inputLocator.sendKeys("01532");
       inputLocator.sendKeys(Keys.RETURN);
*/

        //used radius to get closes area store with 5 mile radious
       /* WebElement radius = driver.findElement(By.id("radius"));
        Select selectRadius = new Select(radius);
        selectRadius.selectByValue("5");*/




        // Verify following Store gets displayed
        // #18 Lyman St
        // Westborough, MA 01581
        // 508.870.8761
        // Store #1216
        String[] values = {"18 Lyman St","Westborough, MA 01581","508.870.8761","Store #1216"};

        for(String allValues : values){

            System.out.println(allValues);
        }





        List<WebElement> address =  driver.findElements(By.xpath(".//*[@id='locationSelect']]"));
        int size = address.size();
        System.out.println(size);













        // Assert Full Address using following code example
        // Assert.assertEquals(page.getZipCode().getText(), "");
    }

    @After
    public void teardown() throws IOException {
        //driver.quit();
    }
}
