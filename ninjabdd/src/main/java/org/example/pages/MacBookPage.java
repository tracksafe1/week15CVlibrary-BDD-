package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MacBookPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(linkText="shopping cart")
    WebElement ShoppingCart;
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnShoppingCart(){

        clickOnElement(ShoppingCart);
    }
}
