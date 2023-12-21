package org.example.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.driverfactory.ManageDriver.driver;


public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//main[@id='site-main']/div[1]/div[1]/div[2]/div[1]/div[1]/h1")
    WebElement resultText;

    public String verifyTheResults() {
        return getTextFromElement(resultText);
    }
}
