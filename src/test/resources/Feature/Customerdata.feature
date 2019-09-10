Feature: Add customer details

  Scenario: 
    # Given User should be in home page
    #And User click on add customer page
    #When User enter all valid details in the field
    #And User click on submit button
    #Then User should be displayed customer id is generated
    
    #Given User should be in home page
    #And User click on add customer page
    #When User enter all valid details
    # | Nila | Sandi | nila@gmail.com | Tanjore | 9807689054 |
    #And User click on submit button
    #Then User should be displayed customer id is generated
    
    Given User should be in home page
    And User click on add customer page
    When User enter all valid data
     |Fname | Santhosh           |
     |Lname | Krishna          |
     |Email | sandi@gmail.com |
     |Address | chrompet        |
     |Phno |     9807908054 |
    And User click on submit button
    Then User should be displayed customer id is generated
