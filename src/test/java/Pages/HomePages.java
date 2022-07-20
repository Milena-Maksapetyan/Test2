package Pages;

import Constants.Locator.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePages {
    private WebDriver driver;
public By releaseDateButton =By.className(HomePageLocators.releaseDateButton);
public By filterByLanguageButton = By.className(HomePageLocators.filterByLanguageButton);
public By allCoursesFields= By.xpath(HomePageLocators.allCoursesFields);
public By leadersLocator = By.xpath(HomePageLocators.leadersLocator);
public By allCoursesButton = By.className(HomePageLocators.allCoursesButton);
public By learningPathButton = By.className(HomePageLocators.learningPathButton);
}
