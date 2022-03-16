Feature: user could search for any product on the system

  Scenario: user could search for product using fullname
    Given user open chrome browser
    And  user navigates to home page
    When user clicks on search field
    And user search with project name
    Then user could find relative results
    And user close the driver


  Scenario: user could search for product using sku