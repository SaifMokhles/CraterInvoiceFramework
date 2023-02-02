
@CraterApp
Feature: Validating Forget/ResetPassword Funtionality

  Background:
    Given User navigate to login screen
    When User click on Forget Password?link
  
  @ForgetPassword
  Scenario: ForgetPassword Scenario
    Then User should be on a new page
    
    @ResetPassword
    Scenario Outline: ResetPassword Scenario
    Then User enter "<email>" in email field 
    Then user enter "illgetepic@Gmail.com" Value in email field
    Then User click on Back to login link
    #Then User click on Reset Password
    
     Examples: 
      | email               |  
      | name1yao.com        |             
      |                     |