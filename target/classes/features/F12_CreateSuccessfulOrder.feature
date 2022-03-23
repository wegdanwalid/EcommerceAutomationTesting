@smoke
Feature: Create Successful Order


  Scenario: User Can Create Successful Order
    Given User Go to Shopping cart
    When user Complete Data to create order
   # And user add Second products to compare cart
    Then assert user created order successful