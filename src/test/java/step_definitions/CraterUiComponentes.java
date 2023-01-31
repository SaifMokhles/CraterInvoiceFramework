package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CraterAppLoginPage;
import utils.Driver;
import utils.TestDataReader;

public class CraterUiComponentes {
	
	  CraterAppLoginPage loginpage = new CraterAppLoginPage();
	  
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	   Driver.getDriver().get("http://invoice.primetech-apps.com/login"); 
		
	}
	@Then("I should see page title Text")
	public void i_should_see_page_title_text() {
	  String Pagetitle =  Driver.getDriver().getTitle();
	   Assert.assertEquals(Pagetitle, TestDataReader.getProperty("CraterPageTitle"));
	}
	@Then("I should see email field box")
	public void i_should_see_email_field_box() {
	  Assert.assertTrue(loginpage.EmailFeildBox.isDisplayed()); 
		 
	}
	@Then("I should see password field box")
	public void i_should_see_password_field_box() {
	   Assert.assertTrue(loginpage.PasswordFeildBox.isDisplayed());
	}
	@Then("I should see forget password link")
	public void i_should_see_forget_password_link() {
	   Assert.assertTrue(loginpage.ForgotPasswordLinkText.isDisplayed());
		
	}
	@Then("I should see login button")
	public void i_should_see_login_button() {
	    Assert.assertTrue(loginpage.loginbtn.isDisplayed());
	}
	@Then("I should see a Copyright Text area on bottom left")
	public void i_should_see_a_copyright_text_area_on_bottom_left() {
     String Copy = loginpage.CopyrightText.getText();
      System.out.println(Copy);
     Assert.assertEquals(Copy, TestDataReader.getProperty("CopyRightText22"));

	}
	
	@Then("I should see a heading Text A")
	public void i_should_see_a_heading_text_a() {
		String HeadingAText = loginpage.HeadingAText.getText();
		Assert.assertEquals(HeadingAText , TestDataReader.getProperty("HeaderA"));
	}
	@Then("I should see a heading Text B underneath A")
	public void i_should_see_a_heading_text_b_underneath_a() {
		String HeadingBText = loginpage.HeadingBText.getText();
		Assert.assertEquals(HeadingBText , TestDataReader.getProperty("HeaderB"));
		
		
	}

}