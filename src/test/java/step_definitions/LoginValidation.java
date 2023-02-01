package step_definitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterAppLoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class LoginValidation {
	
	BrowserUtils utils = new BrowserUtils ();
	CraterAppLoginPage loginpage =  new CraterAppLoginPage ();
	
	@Given("User navigate to the login page")
	public void user_navigate_to_the_login_page() {
	    Driver.getDriver().navigate().to(TestDataReader.getProperty("craterUrl"));
	}
	@When("User enter valid email {string}")
	public void user_enter_valid_email(String username) {
		utils.sendKeysWithActionsClass(loginpage.EmailFeildBox, username);
	   
	}
	@When("User enter valid password {string}")
	public void user_enter_valid_password(String password) {
		utils.sendKeysWithActionsClass(loginpage.PasswordFeildBox, password);
	    
	}
	@When("User click login button")
	public void user_click_login_button() {
		loginpage.loginbtn.click();
	   
	}
	@Then("User should be on Dashboard Page")
	public void user_should_be_on_dashboard_page() throws InterruptedException {
		Thread.sleep(800);
		String DashbordUrl = Driver.getDriver().getCurrentUrl();
		Assert.assertEquals(DashbordUrl, TestDataReader.getProperty("CraterDashbordpageUrl"));
		
	   
	}
	
	
	
	@When("User enter invalid or blank email {string} and password {string}")
	public void user_enter_invalid_or_blank_email_and_password(String username, String password) {
	   utils.sendKeysWithActionsClass(loginpage.EmailFeildBox, username);
	   utils.sendKeysWithActionsClass(loginpage.PasswordFeildBox, password);
		
	}
	@Then("user should see a error message")
	public void user_should_see_a_error_message() {
		
		if (loginpage.invalidUserErrorMessage.isDisplayed()) {
		 Assert.assertEquals(loginpage.invalidUserErrorMessage.isDisplayed(), TestDataReader.getProperty("InvalidErrorMessgeText"));
		 
		} 
		 else if (loginpage.fieldRequired.isDisplayed()) {
			Assert.assertEquals(loginpage.fieldRequired.isDisplayed(), TestDataReader.getProperty("FieldRequierdText"));
		}
		
		 else { 
            
			System.out.println("HelloWorld");

		
	}

	}
}