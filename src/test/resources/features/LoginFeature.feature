
@CraterApp
Feature: Validating User Login Credentials
 
  @LoginValidation
  Scenario: Valid login Senarios
    Given User navigate to the login page
    When User enter valid email "illgetepic@gmail.com"
    And  User enter valid password "Madmoyo2009"
    When User click login button
    Then User should be on Dashboard Page
    
    
    
    
    
    @InvalidLoginValidation
    Scenario Outline:  invalid login Senarios
     Given User navigate to the login page
     When User enter invalid username "<username>" and password "<password>"
     And User click login button
     Then user should see a error message
     
     
     
     

    Examples: 
      | username             |  password       |
      | name1@yahoo.com      |  pass222        |
      | illgetepic@gmail.com |  hello222       |
      | il22@gmail.com       |  Madmoyo2009    |
      |                      |                 |
      |    hel@gmail.com     |                 |
      |  illgetepic@gmail.com|                 |
      |                      |    hello222     |
      |                      | Madmoyo2009     |
      
      
      
      
