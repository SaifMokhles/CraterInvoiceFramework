
@CraterApp
Feature: Validating User Login with Valid Credentials
 
  @LoginValidation
  Scenario: Valid login Senarios
    Given User navigate to the login page
    When User enter valid email "illgetepic@gmail.com"
    And  User enter valid password "Madmoyo2009"
    When User click login button
    Then User should be on Dashboard Page
    
    
    
    
    
    
    
    
    #Scenario Outline:  login Senarios
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
