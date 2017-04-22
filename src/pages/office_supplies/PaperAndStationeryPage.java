package pages.office_supplies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by ddantas on 4/4/2017.
 */
public class PaperAndStationeryPage extends OfficeSupplies {

    //constructor
    public PaperAndStationeryPage(WebDriver driver) {
        super(driver);
    }

    //go to required page
    @FindBy(xpath = ".//*[@id='dailydeals']/nav/ul/li[1]/div[2]/div/div/ul/li[1]")
    private WebElement clickPaperAndStationoery;

    public WebElement getClickPaperAndStationoery() {
        clickPaperAndStationoery.click();
        return clickPaperAndStationoery;
    }

    public void setClickPaperAndStationoery(WebElement clickPaperAndStationoery) {
        this.clickPaperAndStationoery = clickPaperAndStationoery;
    }

    @FindBy(xpath = ".//*[@id='ddTop']/h1")
    private  WebElement paperAndStationeryHeaderText;

    public WebElement getPaperAndStationeryHeaderText() {
        paperAndStationeryHeaderText.getText();
        return paperAndStationeryHeaderText;
    }

    public void setPaperAndStationeryHeaderText(WebElement paperAndStationeryHeaderText) {
        this.paperAndStationeryHeaderText = paperAndStationeryHeaderText;
    }
}
