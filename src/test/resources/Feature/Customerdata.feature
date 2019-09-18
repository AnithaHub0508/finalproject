Feature: Add customer details @regression

  Background: 
    #Given User should be in home page
    And User click on add customer page

  Scenario: 
    When User enter all valid details
    And User click on submit button
    Then User should be displayed customer id is generated
