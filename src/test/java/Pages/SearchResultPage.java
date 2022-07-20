package Pages;
import Constants.Locator.SearchResultPageLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
public By allResults = By.xpath(SearchResultPageLocator.allResults);


    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public void allresults(){
    List<WebElement> allresults = driver.findElements(By.xpath("//li[contains(@class,\"ajax_block_product\")]"));
    }
}
