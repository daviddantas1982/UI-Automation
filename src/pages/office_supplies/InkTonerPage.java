package pages.office_supplies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

/**
 * Created by ddantas on 4/3/2017.
 */
public class InkTonerPage extends  OfficeSupplies{



 public InkTonerPage(WebDriver driver)
 {
     super(driver);
 }



    @FindBy(xpath = ".//*[@id='inkAndTonerApp']/div/div[2]/div[1]/h1")
    private  WebElement headerText;

    public WebElement getHeaderText() {
        headerText.getText();
        return headerText;
    }

    public void setHeaderText(WebElement headerText) {
        this.headerText = headerText;
    }
}
