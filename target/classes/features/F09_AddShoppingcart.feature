@smoke
Feature: Logged user could add different products to Shopping cart

  Scenario:
    Given Logged user could add different products to Shopping cart
    When user add First products to Shopping cart
    And assert shopping cart have First product
    Then user add Second products to Shopping cart
    And assert shopping cart have Second product