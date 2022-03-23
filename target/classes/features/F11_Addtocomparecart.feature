@smoke
Feature: Logged user could add different products to compare list

  Scenario: could add different products to compare list
    Given Logged user could add different products to compare cart
    When user add First products to compare cart
    And user add Second products to compare cart
    Then assert compare cart have two product