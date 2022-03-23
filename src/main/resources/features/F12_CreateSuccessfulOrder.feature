@smoke
Feature: Create Successful Order


  Scenario: User Can Create Successful Order
    Given User Go to Shopping cart
    When user Complete Data to create order
    Then assert user created order successful