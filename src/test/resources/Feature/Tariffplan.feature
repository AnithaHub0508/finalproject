Feature: Add Tariff plans

  Scenario: 
    #Given User should be in home page.
    #And User click on add customer page.
    #When User enter all tariff details.
    #And User click on submit button.
    #Then User should be displayed message is generated
    
    #Given User should be in home page.
    #And User click on add customer page.
    #When User enter all tariff details in field.
     # | 200 | 100 | 40 | 700 | 567 | 780 | 20 |
    #And User click on submit button.
    #Then User should be displayed message is generated
    
    Given User should be in home page.
    And User click on add customer page.
    When User enter all tariff details in field now.
      | Rent     | 200 |
      | Mins     | 100 |
      | Inter    |  40 |
      | Sms      | 700 |
      | Local    | 567 |
      | National | 780 |
      | Charge   |  20 |
    And User click on submit button.
    Then User should be displayed message is generated
