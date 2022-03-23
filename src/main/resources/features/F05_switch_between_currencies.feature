@smoke
Feature: Logged User could switch between currencies US-Euro

  Scenario: user could switch between currencies
    Given user in home page
    When user detierment to Euro
    Then user switch between currencies US-Euro successfully