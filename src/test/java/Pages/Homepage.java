package Pages;
import Constants.Locator.HomePageLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Homepage {
    private WebDriver driver;
    public By searchField = By.className(HomePageLocator.searchField);
    public By searchIcon = By. className(HomePageLocator.searchIcon);

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillSearchField(String inputSearchField){

        driver.findElement(searchField).sendKeys(inputSearchField);
    }

    public void clickSearchIcon(){
        driver.findElement(searchIcon).click();
    }


}

