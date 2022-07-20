package Pages;

import Constants.Locator.HomePageLocators;
import Constants.Locator.SpecialCourseLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SpecialCourse {
    public By allVideos = By.className(SpecialCourseLocators.allVideos);
    public By couseNameLocator = By.xpath(SpecialCourseLocators.courseNameLocator);
    public By tutorName =By.xpath(SpecialCourseLocators.tutorname);
    public By enrollNewButton = By.xpath(SpecialCourseLocators.enrollNowButton);
    public By autoPlay = By.className(SpecialCourseLocators.autoPlay);
}
