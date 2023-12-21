package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Utility {

    @CacheLookup
    @FindBy (xpath= "//ul[@class='nav navbar-nav']/li[1]/a")
    WebElement desktop;

    @CacheLookup
    @FindBy (xpath= "//ul[@class='nav navbar-nav']/li[2]/a")
    WebElement laptopsAndNotebooks;

    @CacheLookup
    @FindBy (xpath="//ul[@class='nav navbar-nav']/li[3]/a")
    WebElement components;

    @CacheLookup
    @FindBy (linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy (linkText = "Show AllLaptops & Notebooks")
    WebElement showAllDesktopsAndNotebooks;

    @CacheLookup
    @FindBy (linkText = "Show AllComponents")
    WebElement showAllComponents;
    @CacheLookup
    @FindBy(xpath="//nav[@id='top']/div[1]/div[2]/ul/li[2]")
    WebElement clickOnAccountButton;



    public void mouseHoverToDesktop(){
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverToLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public void mouseHoverToComponents(){
        mouseHoverToElementAndClick(components);
    }

    public void setShowAllDesktops(){
        clickOnElement(showAllDesktops);
    }

    public void setShowAllDesktopsAndNotebooks(){
        clickOnElement(showAllDesktopsAndNotebooks);
    }

    public void setShowAllComponents(){
        clickOnElement(showAllComponents);
    }
    public void clickOnAccount(){
        clickOnElement(clickOnAccountButton);
    }


}