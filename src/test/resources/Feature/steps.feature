Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and password
    And clicks the login button
    Then User should be redirected to the homepage