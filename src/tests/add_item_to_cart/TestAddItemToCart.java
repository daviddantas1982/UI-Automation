package add_item_to_cart;

import common.Common;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.add_Item_to_cart.AddItemToCart;

import java.security.Key;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by ddantas on 4/12/2017.
 *  Add item to cart
 -  Find item
 - Select item
 - Add item to shopping cart
 - Verify item has been added to shopping cart
 */
public class TestAddItemToCart {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {
        Common cm = new Common ();
        driver = cm.getDriver ();


    }

    @Test
    public void verifyCartItem() throws Exception {

        final String printerName = "HP LaserJet Pro M130fn Mono All-in-One Printer";

        AddItemToCart addItemToCart = new AddItemToCart (driver);

        addItemToCart.getClickOnSearchBar ().sendKeys ( printerName  );
        Thread.sleep ( 2000 );

       addItemToCart.getSearchButton ().sendKeys ( Keys.RETURN );

        Thread.sleep ( 2000 );

        String searchedProduct = addItemToCart.getSearchProduct ().getText ();

        System.out.println ("first"+printerName);
        System.out.println (searchedProduct);




        if(searchedProduct.equals ( searchedProduct ))
        {
            String parentWind = driver.getWindowHandle ();

            System.out.println (parentWind);
           addItemToCart.getClickAddToCart ().click ();





           //cheked for new window...


          /* Set<String> childwind = driver.getWindowHandles ();

           for( String newhandle : childwind)
           {
               System.out.println (newhandle);
           }
*/













        }

















    }

    @After
    public void tearDown() throws Exception {

Thread.sleep ( 10000 );
     driver.quit ();


    }
}
