package org.example.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.driverfactory.ManageDriver.driver;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id= "location")
    WebElement locationField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='hps-sal-min']/input")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsButton;




    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void switchToIframe() {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(By.xpath("//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]"));
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(locationField, location);
    }

    public void selectDistance(String distance) {
        sendTextToElement(distanceDropDown, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
    }

    public void selectJobType(String jobType) {
        sendTextToElement(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsButton);
    }
}

