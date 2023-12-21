package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {
@CacheLookup
    @FindBy(xpath="//div[@class='table-responsive']/table[1]/tbody/tr/td[4]/div[1]/input[1]")
    WebElement quantity;
@CacheLookup
@FindBy(xpath="//div[@class='input-group btn-block']/span[1]/button[1]")
WebElement updatetab;
     @CacheLookup
     @FindBy(xpath="//div[@id='content']/div[3]/div[2]/a")
     WebElement clickOnCheckout;


    //            2.11 Change Quantity "2"
    public void changeQuantity(String qty){
        quantity.clear();
        sendTextToElement1(quantity,"2");
    }
    //            2.12 Click on “Update” Tab
    public void UpdateTab(){
        clickOnElement(updatetab);}
    //  2.15 Click on “Checkout” button
    public void clickOnCheckoutButton(){
        clickOnElement(clickOnCheckout);
    }
}
