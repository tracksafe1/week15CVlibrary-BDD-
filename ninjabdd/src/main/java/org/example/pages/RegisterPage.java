package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//fieldset[@id='account']/div[2]/div[1]/input")
    WebElement firstname;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastname;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement Email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;


    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div/label[1]/input")
    WebElement clickOnRadio;

    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/div/input[1]")
    WebElement clickOnPrivacy;

    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/div/input[2]")
    WebElement clickOnContinue;

    public void setFirstname() {
        sendTextToElement(firstname, "karishma");
    }

    public void setLastname() {
        sendTextToElement(lastname, "Kapur1322");

    }

    public void setEmail() {
        sendTextToElement(Email, "kar211@gmail.com");
    }

    public void setTelephone() {
        sendTextToElement(telephone, "123456789");
    }

    public void setPassword() {
        sendTextToElement(password, "123456");
    }

    public void setConfirmPassword() {
        sendTextToElement(confirmPassword, "123456");
    }

    public void clickOnRadioButton() {
        clickOnElement(clickOnRadio);
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(clickOnPrivacy);
    }
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinue);
    }
}