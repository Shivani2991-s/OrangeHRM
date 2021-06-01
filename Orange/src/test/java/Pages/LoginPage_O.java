package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase_O;

public class LoginPage_O extends TestBase_O{
	//create web elements
		@FindBy(id = "txtUsername")
		WebElement user;
			
		@FindBy(id = "txtPassword")
		WebElement pass;
		
		@FindBy(id = "btnLogin")
		WebElement loginButton;
		
		@FindBy(linkText= "Forgot your password?")
		WebElement frgtpass;
		
		//create constructor to initialize web elements
		public LoginPage_O() {
			PageFactory.initElements(driver, this);
			
		}
		
		//create methods
		public void invalid_login() {
			user.sendKeys(prop.getProperty("username"));
			pass.sendKeys(prop.getProperty("password1"));
			loginButton.click();
			
		
		}
		
		public void valid_login() {
			user.sendKeys(prop.getProperty("username"));
			pass.sendKeys(prop.getProperty("password"));
			loginButton.click();
			
		
		}
		

}
