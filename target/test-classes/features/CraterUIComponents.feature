@CraterApp
Feature: Crater Login Components
	Validate Crater login page Components

  @CraterLoginUIComponents
  Scenario Outline: Crater Invoice App Login UI Components
    Given I navigate to the login page 
    Then I should see page title "Text"
    Then I should see email field box
    And  I should see password field box
    Then I should see forget password link
    Then I should see login button
    Then I should see a Text area on bottom left "Text"
    Then I should see a heading Text A "Text"
    And  I should see a heading Text B underneath A "Text"
    
    
    
    
     Examples: 
      |  Text                                                                                      |
      | crater                                                                                     |
      | Copyright @ Crater Invoice, Inc. 2023                                                      |
      | Simple Invoicing for Individuals Small Businesses                                          |
      | Crater helps you track expenses, record payments & generate beautiful invoices & estimates |
   
    
    
    
    