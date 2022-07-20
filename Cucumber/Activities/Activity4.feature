@activity4
Feature: Login Test

  @SmokeTest
  Scenario: Testing Login without Examples
    Given User is on Login Page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And Close the browser