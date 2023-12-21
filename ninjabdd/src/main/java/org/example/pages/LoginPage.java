package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends Utility {
    @CacheLookup
    @FindBy(id="input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id="input-password")
            WebElement password;
    @CacheLookup
    @FindBy(xpath="//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement clickOnLogin;
    //4.3 enter email adress
    public void enterEmail(){
        sendTextToElement(email,"kar211@gmail.com");
    }
    public void enterPassword(){
        sendTextToElement(password, "123456");
    }
    public void loginButton(){
        clickOnElement(clickOnLogin);
    }
}
