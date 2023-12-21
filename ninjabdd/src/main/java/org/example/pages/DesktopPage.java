package com.nopcommerce.pages;

import com.google.common.base.Verify;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group input-group input-group-sm']/select")
    WebElement sortOrder;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group input-group input-group-sm']/select")
    WebElement sortOrder1;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a")
    WebElement productTextHPLP3065;
    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement quantity;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;

    @CacheLookup
    @FindBy(id = "input-option225")
    WebElement date;
    @CacheLookup
    @FindBy(xpath="//ul[@class='list-inline']/li[4]/a")
    WebElement shoppingCartLink;


    //    1.3 Select Sort By position "Name: Z to A"
    public void SelectingZtoAFromDropDown() {
        selectByIndexFromDropDown(sortOrder, 2);
    }

    public void SelectingAtoZFromDropDown() {

        selectByIndexFromDropDown(sortOrder,1);
    }





//    2.6 Select Delivery Date "2022-11-30"
    public void selectDelieveryDate(String dateText){
        date.clear();
        sendTextToElement(date,"2022-11-30");

    }

//2.7.Enter Qty "1” using Select class.
public void selectQuantity(String qty){
    quantity.clear();
        sendTextToElement(quantity,"1");
}
//2.8 Click on “Add to Cart” button
public void clickAddToCart(){
    clickOnElement(addToCart);
}

//    2.10 Click on link “shopping cart” display into success message
public void clickOnShoppingCartLinkIntoSuccessMessage() {

        clickOnElement(shoppingCartLink);
}
    @CacheLookup
    @FindBy(xpath = "///div[@id='content']/div[4]/div[3]/div/div[2]/div[1]/h4/a')]")
    WebElement product;
    //        2.4 Select product “HP LP3065”
    public void clickOnHPLP3065Product(String productName) {
        clickOnElement(productTextHPLP3065);
    }
}
