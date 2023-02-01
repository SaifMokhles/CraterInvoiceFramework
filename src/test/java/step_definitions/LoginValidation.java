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
	
	boolean userempty;
	boolean passempty;
	@When("User enter invalid username {string} and password {string}")
	public void user_enter_invalid_or_blank_email_and_password(String invalidusername, String invalidpassword) {
		 userempty = invalidusername.isBlank();
		 passempty = invalidpassword.isBlank();
		
	   utils.sendKeysWithActionsClass(loginpage.EmailFeildBox, invalidusername);
	   utils.sendKeysWithActionsClass(loginpage.PasswordFeildBox, invalidpassword);
		
	}
	@Then("user should see a error message")
	public void user_should_see_a_error_message() {
		
		
		if(userempty || passempty)   {
	  utils.waitUntilElementVisible(loginpage.fieldRequired);
	  Assert.assertTrue(loginpage.fieldRequired.isDisplayed());
			
		}  else { 
			utils.waitUntilElementVisible(loginpage.invalidUserErrorMessage);  
			Assert.assertTrue(loginpage.invalidUserErrorMessage.isDisplayed());
			// user stay on login page
			Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
		}
			
			
		}
	
		
	}
	
		
	

	

