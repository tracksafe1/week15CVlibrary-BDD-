package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//input[@id='button-account']")
    WebElement continueTab;

    @CacheLookup
    @FindBy(id="input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id="input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id="input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(id="input-payment-telephone")
            WebElement telephone;
    @CacheLookup
    @FindBy(id="input-payment-address-1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id="input-payment-city")
            WebElement cityName;
    @CacheLookup
    @FindBy(id="postcode")
    WebElement zipCode;
    @CacheLookup
    @FindBy(id="input-payment-country")
            WebElement countryName;
    @CacheLookup
    @FindBy(id="input-payment-zone")
    WebElement zoneName;
    @CacheLookup
    @FindBy(xpath="//input[@id=\"button-guest\"]")
            WebElement continue1;
    @CacheLookup
    @FindBy(xpath="//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea")
    WebElement addcomments;
    @CacheLookup
    @FindBy(xpath="//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]")
            WebElement termsAndConditions;
    @CacheLookup
    @FindBy(xpath="//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]")
    WebElement continue001;
    @CacheLookup
    @FindBy(xpath="//div[@id='//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label/input")
    WebElement guestCheckoutButton;

//      2.18 Click on “Guest Checkout” radio button
public void clickOnGuestCheckout(){
    clickOnElement(guestCheckoutButton);
}

//2.19 Click on “Continue” tab
public void clickContinue(){
        clickOnElement(continueTab);}
    //2.20 Fill the mandatory fields
    public void mandatoryFields(){
        sendTextToElement(firstName, "Karishma");
        sendTextToElement(lastName, "Kapur");
        sendTextToElement(addressField, "BarhamAvenue");
        sendTextToElement(email, "kar21@gmail.com");
        sendTextToElement(telephone, "123456789");
        sendTextToElement(cityName, "London");
        sendTextToElement(zipCode, "Wd63vy");
        selectByIndexFromDropDown(countryName, 15);
        selectByIndexFromDropDown(zoneName, 7);

    }







    // 2.21click on continue
    public void clickContinue1(){
        clickOnElement(continue1);}

    //2.22 Add Comments About your order into text area
    public void addcomments(){
        sendTextToElement(addcomments,"please write Fragile");
    }
    //2.23 Check the Terms & Conditions check box
    public void setTermsAndConditions(){
        clickOnElement(termsAndConditions);}


    //2.24 Click on “Continue” button
    public void clickContinue001(){
        clickOnElement(continue001);
    }
}
