package org.example.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pages.*;

public class LaptopAndNotebookSteps {
    @And("^I click on  Show All Laptops & Notebooks$")
    public void i_click_on_Show_All_Laptops_Notebooks() {

        new HomePage().setShowAllDesktopsAndNotebooks();
    }


    @And("^Select “MacBook”$")
    public void selectMacBook() {

        new LaptopsAndNotebooksPage().selectMacbook();
    }

    @And("^click on Add to cart button$")
    public void clickOnAddToCartButton() {
        new MacBookPage().clickOnAddToCart();
    }

    @And("^click on link “shopping cart” display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new MacBookPage().clickOnShoppingCart();
    }

    @And("^Change Quantity \"([^\"]*)\"$")
    public void changeQuantity(String qty) {

        new ShoppingCartPage().changeQuantity(qty);
    }

    @And("^Click on “Update” Tab$")
    public void clickOnUpdateTab() {
        new ShoppingCartPage().UpdateTab();
    }

    @And("^Click on “Checkout” button$")
    public void clickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^Click on “GuestCheckout” radio button$")
    public void clickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickOnGuestCheckout();
    }

    @And("^click on continue Tab$")
    public void clickOnContinueTab() {
        new CheckoutPage().clickContinue();
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
    }

    @Then("^I should navigate to checkout page$")
    public void iShouldNavigateToCheckoutPage() {
    }

    @And("^I should see new customer text$")
    public void iShouldSeeNewCustomerText() {
    }

    @And("^I click on guest checkout button$")
    public void iClickOnGuestCheckoutButton() {
    }

    @And("^I click on continue button of guest checkout page$")
    public void iClickOnContinueButtonOfGuestCheckoutPage() {
        new CheckoutPage().clickOnGuestCheckout();
    }

    @And("^I filled all mandatory field of checkout page$")
    public void iFilledAllMandatoryFieldOfCheckoutPage() {
        new CheckoutPage().mandatoryFields();
    }

    @And("^I click on continue after fill all detail on checkout page$")
    public void iClickOnContinueAfterFillAllDetailOnCheckoutPage() {
        new CheckoutPage().clickContinue1();
    }

    @And("^I add comments to text area about product order$")
    public void iAddCommentsToTextAreaAboutProductOrder() {
    }

    @And("^I click checkbox of terms and condition$")
    public void iClickCheckboxOfTermsAndCondition() {
        new CheckoutPage().setTermsAndConditions();

    }

    @And("^I click on continue of checkout$")
    public void iClickOnContinueOfCheckout() {
        new CheckoutPage().clickContinue();
    }

    @Then("^I should see warning message regarding Payment method$")
    public void iShouldSeeWarningMessageRegardingPaymentMethod() {
    }

    @And("^Select Sort By Price \\(High > Low\\)$")
    public void selectSortByPriceHighLow() {
        new LaptopsAndNotebooksPage().selectPriceHightolow();
    }
}