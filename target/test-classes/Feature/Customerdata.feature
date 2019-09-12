Feature: Add customer details

  Background: 
    Given User should be in home page
    And User click on add customer page

  Scenario: 

  When User enter all valid details in the field
  And User click on submit button
  Then User should be displayed customer id is generated
  Scenario: 

  When User enter all valid details
   | Nila | Sandi | nila@gmail.com | Tanjore | 9807689054 |
  And User click on submit button
  Then User should be displayed customer id is generated
  Scenario Outline: 
    When User enter all valid data."<fname>","<lname>","<email>","<address>","<phno>"
    And User click on submit button
    Then User should be displayed customer id is generated

    Examples: 
      | fname  | lname | email          | address | phno       |
      | Anitha | Sandi | ani@gmail.com  | Chennai |  489382389 |
      | Sandi  | Krish | san@gmail.com  | Tanjore | 8923820309 |
      | Nila   | San   | nila@gmail.com | Ond     | 8921320389 |
