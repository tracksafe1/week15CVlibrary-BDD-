package com.nopcommerce.steps;

import com.nopcommerce.pages.DesktopPage;
import com.nopcommerce.pages.HomePage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Desktopsteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I mousehover on desktop and click$")
    public void iMousehoverOnDesktopAndClick() {
       new HomePage().mouseHoverToDesktop();
    }



    @And("^I click on showalldesktoplink$")
    public void iClickOnShowalldesktoplink() {
        new HomePage().setShowAllDesktops();
    }

    @And("^I select sort By position Name Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().SelectingZtoAFromDropDown();
    }

    @And("^I Select Sort position Name A to Z$")
    public void iSelectSortPositionNameAToZ() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().SelectingAtoZFromDropDown();
    }



    @And("^I add quantity \"([^\"]*)\" for product$")
    public void iAddQuantityForProduct(String qty)  {
        new DesktopPage().selectQuantity(qty);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new DesktopPage().clickAddToCart();
    }

    @And("^I click on shopping cart button$")
    public void iClickOnShoppingCartButton() {
        new DesktopPage().clickOnShoppingCartLinkIntoSuccessMessage();
    }

    @And("^I click on product \"([^\"]*)\"$")
    public void iClickOnProduct(String productName){

        new DesktopPage().clickOnHPLP3065Product(productName);

    }

    @And("^enter Delivery Date \"([^\"]*)\"$")
    public void enterDeliveryDate(String dateText)  {

        new DesktopPage().selectDelieveryDate(dateText);

    }
}


