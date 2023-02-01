package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class CraterAppLoginPage {
	
	  public CraterAppLoginPage() {
 	  PageFactory.initElements(Driver.getDriver(), this);
		
	}
	  
	@FindBy(name="email")
	public WebElement EmailFeildBox;
	
	@FindBy(name="password")
	public WebElement PasswordFeildBox;
	
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	public WebElement ForgotPasswordLinkText;   
      
	
	@FindBy(css=".inline-flex")
	public WebElement loginbtn; 
	
	
	@FindBy(xpath="//p[contains(text(),'Copyright @ Crater Invoice, Inc. 2023')]")
	public WebElement CopyrightText;  
	
	@FindBy(css=".hidden.mb-3")
	public WebElement HeadingAText; 
	
	@FindBy(css=".hidden.text-sm")
	public WebElement HeadingBText; 
	
	
	@FindBy(xpath = "//p[contains(text(), 'These credentials do not match our records.')]")
	public WebElement invalidUserErrorMessage;

	@FindBy(xpath = "//span[text()='Field is required']")
	
	public WebElement fieldRequired;
	
	
	
	@FindBy(css=".font-base.block")
	public WebElement Enteremailfield;
	
	
	@FindBy(xpath="//div[contains(text(),'Send Reset Link')]")
	public WebElement SendResetlinkBtn;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Back to Login?')]")
	public WebElement BacktoLoginlink;
	
	
	@FindBy(xpath="//span[@class='block mt-0.5 text-sm text-red-500']")
	public WebElement incorretEmailMsg;
	
	
	@FindBy(xpath="//span[contains(text(),'Field is required')]")
	public WebElement ForgetPassFieldRQRD;
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	

