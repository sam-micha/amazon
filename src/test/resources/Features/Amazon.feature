@tag
Feature: Validate the login funtionality of Amazon 
  

  @tag1
  Scenario: Validate the login funtionality of Amazon with valid credentials
    Given Launch the browser
    And Open the Amazon application
    When Enter the username and password
    And Click the login button
    Then I validate the outcomes
    And Close the browser