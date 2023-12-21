package com.nopcommerce.steps;


import com.nopcommerce.pages.HomePage;
import com.nopcommerce.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TopMenuSteps extends Utility {

    @When("^I mouse hover and click on desktop tab$")
    public void iMouseHoverAndClickOnDesktopTab() {
        new HomePage().mouseHoverToDesktop();
    }

    @And("^I select menu Show All Desktops$")
    public void iSelectMenuShowAllDesktops() {
        new HomePage().setShowAllDesktops();
    }

    @Then("^I should navigate to desktop page successfully$")
    public void iShouldNavigateToDesktopPageSuccessfully() {
        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Desktops";
        org.testng.Assert.assertEquals(actualText, expectedText);
    }

    @When("^I mouse hover and click on laptop and notebook tab$")
    public void iMouseHoverAndClickOnLaptopAndNotebookTab() {
        new HomePage().mouseHoverToLaptopsAndNotebooks();
    }

    @And("^I select menu Show All Laptops & Notebooks$")
    public void iSelectMenuShowAllLaptopsNotebooks() {
        new HomePage().setShowAllDesktopsAndNotebooks();
    }

    @Then("^I should navigate to laptop and notebook page successfully$")
    public void iShouldNavigateToLaptopAndNotebookPageSuccessfully() {
        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Laptops & Notebooks";
        org.testng.Assert.assertEquals(actualText, expectedText);
    }

    @When("^I mouse hover and click on component tab$")
    public void iMouseHoverAndClickOnComponentTab() {
        new HomePage().mouseHoverToComponents();
    }

    @And("^I select menu Show All Components$")
    public void iSelectMenuShowAllComponents() {
        new HomePage().setShowAllComponents();
    }

    @Then("^I should navigate to component page successfully$")
    public void iShouldNavigateToComponentPageSuccessfully() {
        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Components";
        Assert.assertEquals(actualText, expectedText);
    }
}

