Feature: Product details page functionality verification

  Scenario: Verify user can be navigated to the correct product details page
    Given User opens Home Page
    When User enters "xBox" word into search field on Home Page
    And User click on search button on Home Page
    And User remember 2 product name on Search Result Page
    And User clicks on 2 product picture on Search Result Page
    Then User verify product title is correct on Product Details Page