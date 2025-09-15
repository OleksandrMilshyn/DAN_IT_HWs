Feature: Search Result Page functionality verification

  Scenario: Verify that show more button is working
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    And The user clicks the TV, audio section in the catalog on Home Page
    Then The title Popular Products contains "Популярні товари" search word on Search Result Page