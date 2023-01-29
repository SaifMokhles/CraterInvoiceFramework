@CraterApp
Feature: Crater Login Components
	Validate Crater login page Components

  @CraterLoginUIComponents
  Scenario: Crater Invoice App Login UI Components
    Given I am user of the crater application
    When User navigate to the login page 
    Then User should see page title “crater”
    Then User should see email field
    Then User should see Password field 
    Then User should see forget password link 
    Then User should see loging button
    Then User should see a text  “Copyright @ Crater Invoice, Inc. 2023”.
    Then User should see text Simple Invoicing for Individuals Small Businesses
    Then User should see heading with the following text Crater helps you track expenses, record payments & generate beautiful invoices & estimates