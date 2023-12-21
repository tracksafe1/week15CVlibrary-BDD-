Feature:Desktop

  Background:
    Given I am on homepage
    When  I mousehover on desktop and click
    And I click on showalldesktoplink

  @test
  Scenario:verifyProductArrangeInAlphaBaticalOrder


    And I select sort By position Name Z to A

  @smoke1
  Scenario: verifyProductAddedToShoppingCartSuccessFully


    And I Select Sort position Name A to Z
    And I click on product "HP LP3065"
    And enter Delivery Date "2022-11-30"
    And I add quantity "1" for product
    And I click on add to cart button
    And I click on shopping cart button