package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement login ;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement register;

    @CacheLookup
    @FindBy(linkText = "Logout")
    WebElement logout ;

    @CacheLookup
    @FindBy(xpath = "//div[@id=\"content\"]/div/div/a")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']/a")
    WebElement click ;
    public void setLogin(){
        clickOnElement(login);
    }
    public void setRegister(){
        clickOnElement(register);
    }
    public void setLogout(){
        clickOnElement(logout);
    }

    //    3.13 Click on Continue button

    public void clickOnContinueButton(){
        clickOnElement(clickOnContinue);
    }
    //    3.17 Click on Continue button

    public void clickOnContinue1(){
        clickOnElement(click);

}}
