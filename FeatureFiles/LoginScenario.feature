Feature: Login Page Scenarios
  I want login into wordpress.com

  
  Scenario: Successfull Login scenario
    Given I want to open the wordpress application
    And verify the application name
    When I enter the login credintials
    And click on login button
    Then I validate the outcomes
