@smoke
Feature: users could use register functionality to open new accounts

  Scenario: user could register with valid firstname and lastname and email and password and confirmPassword
    Given user go to register page
    When user register with valid firstname and lastname and email and password and confirmPassword
    And user press on register button
    Then user register to the system successfully
    And user logout to login page