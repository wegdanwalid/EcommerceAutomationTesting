@smoke
Feature: users could use Rest password functionality

  Scenario: user could use Reset password with valid email
    Given user go to Reset page
    When user reset with valid email
    And user press on Recover button
    Then user reset password successfully