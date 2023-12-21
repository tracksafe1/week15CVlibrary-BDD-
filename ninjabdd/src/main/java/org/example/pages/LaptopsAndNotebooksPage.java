package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooksPage extends Utility {
    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement clickOnSortBy;

    @CacheLookup
    @FindBy(xpath="//div[@id='content']/div[4]/div[4]/div[1]/div[2]/div[1]/h4/a")
            WebElement macBook;


    public void selectPriceHightolow(){
        selectByIndexFromDropDown(clickOnSortBy,4);
    }
    public void selectMacbook(){
        clickOnElement(macBook);
    }
}
