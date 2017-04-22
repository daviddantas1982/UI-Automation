package pages.add_Item_to_cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.x500.X500Principal;
import java.security.Permission;
import java.security.PrivateKey;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ddantas on 4/12/2017.
 */
public class AddItemToCart {

    WebDriver driver;

    final String pageUrl ="http://www.staples.com";

    public AddItemToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this);
        driver.get ( pageUrl );

    }

    @FindBy(xpath = ".//*[@id='searchTerm']")
    private  WebElement clickOnSearchBar;

    public WebElement getClickOnSearchBar() {
        return clickOnSearchBar;
    }

    public void setClickOnSearchBar(WebElement clickOnSearchBar) {
        this.clickOnSearchBar = clickOnSearchBar;
    }

    @FindBy(xpath = ".//*[@id='list-page']/div[2]/div[2]/div[2]")
    private List<String> listPage;

    public List<String> getListPage() {
        return listPage;
    }

    public void setListPage(List<String> listPage) {
        this.listPage = listPage;
    }

    @FindBy(xpath = ".//*[@id='ux2SearchBtn']")
    private  WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }



    @FindBy(xpath =  ".//*[@id='2423252']/div/div[2]/a")
    private  WebElement searchProduct;

    public WebElement getSearchProduct() {
        return searchProduct;
    }

    public void setSearchProduct(WebElement searchProduct) {
        this.searchProduct = searchProduct;
    }


    @FindBy(xpath = ".//*[@id='addToCart_2423252']")
    private  WebElement clickAddToCart;

    public WebElement getClickAddToCart() {
        return clickAddToCart;
    }

    public void setClickAddToCart(WebElement clickAddToCart) {
        this.clickAddToCart = clickAddToCart;
    }


   /* @FindBy(xpath = "./*//*[@id='addtocart']")
    private  WebElement clickViewCart;

    public WebElement getClickViewCart() {
        return clickViewCart;
    }

    public void setClickViewCart(WebElement clickViewCart) {
        this.clickViewCart = clickViewCart;
    }*/

    @FindBy(xpath = "html/body/nav/ul/li[9]/div[2]/ul/li[1]/a")
    private  WebElement clickViewCart;

    public WebElement getClickViewCart() {
        return clickViewCart;
    }

    public void setClickViewCart(WebElement clickViewCart) {
        this.clickViewCart = clickViewCart;
    }
}
