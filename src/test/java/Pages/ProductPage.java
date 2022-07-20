package Pages;
import Constants.Locator.ProductPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    public  By productName = By.xpath(ProductPageLocators.productName);
    public By productPrice = By.xpath(ProductPageLocators.productPrice);

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public String getProductPrice() {
        return  driver.findElement(productPrice).getText();
    }
}

//jjkjhjkhjkh
