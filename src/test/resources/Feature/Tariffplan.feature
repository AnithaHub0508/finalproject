Feature: Add Tariff plans

  Scenario: 

 Given User is on home page
  And User click on add tariff plan
  When User enter the plan details
   | 300 | 400 | 90 | 100 | 20 | 10 | 1 |
  |  400 | 500 | 80 |  90 | 10 | 15 | 2 |
  | 800 | 700 | 60 |  80 | 30 | 16 | 3 |
  And User click the submit button
  Then User shold be received message
 
