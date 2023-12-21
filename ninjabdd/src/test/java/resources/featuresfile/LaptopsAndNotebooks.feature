Feature:

  Background:
  Given:I am on homepage

  @test
  Scenario:verifyProductsPriceDisplayHighToLowSuccessfully
    When I mouse hover and click on laptop and notebook tab
    And I click on  Show All Laptops & Notebooks
    And Select Sort By Price (High > Low)

  @smoke
  Scenario:verifyThatUserPlaceOrderSuccessfully()
    When I mouse hover and click on laptop and notebook tab
    And I click on  Show All Laptops & Notebooks
    And Select Sort By Price (High > Low)
    And Select “MacBook”
    And click on Add to cart button
    And click on link “shopping cart” display into success message
    And Change Quantity "2"
    And Click on “Update” Tab
    And Click on “Checkout” button
    And Click on “GuestCheckout” radio button
    And click on continue Tab
    And I click on checkout button
    Then I should navigate to checkout page
    And I should see new customer text
    And I click on guest checkout button
    And I click on continue button of guest checkout page
    And I filled all mandatory field of checkout page
    And I click on continue after fill all detail on checkout page
    And I add comments to text area about product order
    And I click checkbox of terms and condition
    And I click on continue of checkout
    Then I should see warning message regarding Payment method
