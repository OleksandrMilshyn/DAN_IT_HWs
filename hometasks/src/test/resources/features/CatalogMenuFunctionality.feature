Feature: Catalog Menu functionality verification

  Scenario: Verify that show more button is working
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    And The user clicks the TV, audio section in the catalog on Home Page
    Then The title Popular Products contains "Популярні товари" search word on Search Result Page

  Scenario: Verify that popular product is visible
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    And The user clicks the TV, audio section in the catalog on Home Page
    Then Verify that popular products appears on Search Result Page

  Scenario: Verify count of popular product after click Show more button is correct
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    And The user clicks the TV, audio section in the catalog on Home Page
    And Use click on Show more button on Search Result Page
    Then The user sees 30 popular products on Search Result Page
