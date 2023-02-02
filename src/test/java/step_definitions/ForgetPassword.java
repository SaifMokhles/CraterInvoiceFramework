package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterAppLoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class ForgetPassword {
	
	CraterAppLoginPage loginpage =  new CraterAppLoginPage ();
	BrowserUtils utils = new BrowserUtils ();	
	
	@Given("User navigate to login screen")
	public void user_navigate_to_login_screen() {
	    Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
	   
	}
	@When("User click on Forget Password?link")
	public void user_click_on_forget_password_link() {
	loginpage.ForgotPasswordLinkText.click();	
	   
	}
	@Then("User should be on a new page")
	public void user_should_be_on_a_new_page() throws InterruptedException {
	Thread.sleep(800);
	String currentUrl = Driver.getDriver().getCurrentUrl();
	Assert.assertEquals(currentUrl, TestDataReader.getProperty("ForgetpasswordpageUrl"));
	Assert.assertTrue(loginpage.Enteremailfield.isDisplayed());
	Assert.assertTrue(loginpage.SendResetlinkBtn.isDisplayed());
	Assert.assertTrue(loginpage.BacktoLoginlink.isDisplayed());
		    
	}
	
	Boolean EmailValueBlank;
	@Then("User enter {string} in email field")
	public void user_enter_in_email_field(String Email) {
	utils.waitUntilElementVisible(loginpage.Enteremailfield);
	utils.sendKeysWithActionsClass(loginpage.Enteremailfield, Email);
	loginpage.SendResetlinkBtn.click();
	
	EmailValueBlank = Email.isBlank();
	if(EmailValueBlank)  {
		utils.waitUntilElementVisible(loginpage.ForgetPassFieldRQRD);
		Assert.assertTrue(loginpage.ForgetPassFieldRQRD.isDisplayed());
	}  else {
		utils.waitUntilElementVisible(loginpage.incorretEmailMsg);
		 Assert.assertTrue(loginpage.incorretEmailMsg.isDisplayed());

		 }
	}
		

	@Then("user enter {string} Value in email field")
	public void user_enter_value_in_email_field(String ValidEmail) {
		utils.waitUntilElementVisible(loginpage.Enteremailfield);
		utils.sendKeysWithActionsClass(loginpage.Enteremailfield, ValidEmail);
		loginpage.SendResetlinkBtn.click();
	    
	}
	@Then("User click on Back to login link")
	public void user_click_on_back_to_login_link() {
		loginpage.BacktoLoginlink.click();
		Assert.assertEquals(Driver.getDriver().getCurrentUrl(), TestDataReader.getProperty("craterUrl"));
	    
	}

}