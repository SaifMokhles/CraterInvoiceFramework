
@CraterApp
Feature: Validating Forget/ResetPassword Funtionality
  
  @ForgetPassword
  Scenario: ForgetPassword Scenario
    Given User navigate to login screen
    When User click on Forget Password?link
    Then User should be on a new page
    
    @ResetPassword
    Scenario Outline: ResetPassword Scenario
    Given User navigate to login screen
    When User click on Forget Password?link
    Then User enter "<email>" in email field 
    Then user enter "illgetepic@Gmail.com" Value in email field
    And User click on Send Reset link
    #Then User click on Reset Password
    
     Examples: 
      | email               |  
      | name1yao.com        |             
      |                     |