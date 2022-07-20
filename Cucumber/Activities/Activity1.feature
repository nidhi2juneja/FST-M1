@activity1
Feature: First Test

  @SmokeTest
  Scenario: Opening a webpage using Selenium
    Given User is on Google Page
    When User search for Cheese products and hits ENTER
    Then Results are Displayed to User
    And Close the browser