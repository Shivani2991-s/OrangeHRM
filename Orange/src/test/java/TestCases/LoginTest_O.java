package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage_O;
import TestBase.TestBase_O;



public class LoginTest_O extends TestBase_O{

	//create object of login page class
	LoginPage_O LP;
	//LP = new LoginPage_O();	
	
	@BeforeTest
	public void con()
	{
		LP = new LoginPage_O();		//to call all methods of LoginPage class
		
	}
	
	@Test(priority=1)			//test case for invalid credentials
	public void invalid_login() {
		LP.invalid_login();
	}
	
	@Test(priority=2)			//test case for valid credentials
	public void valid_login() {
		LP.valid_login();
	}
	
	
	
	
	
}
