@smoke
Feature: Logged user could add different products to Wishlist


  Scenario:
    Given Logged user could add different products to Wishlist cart
    When user add First products to Wishlist cart
    And user add Second products to Wishlist cart
    Then assert Wishlist cart have two product