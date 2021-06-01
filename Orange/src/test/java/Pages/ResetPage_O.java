package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase_O;

public class ResetPage_O extends TestBase_O{
	@FindBy(xpath ="//input[@type='text']")
	WebElement textbox;
	
	@FindBy(id= "btnSearchValues")
	WebElement reset;
	
	@FindBy(id= "btnCancel")
	WebElement cancel;
	@FindBy(linkText= "Forgot your password?")
	WebElement frgtpass;
	
	public ResetPage_O()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void forgetpass() {
		
		frgtpass.click();
	}
	
	public void forgetpassSet() {
	
		
		textbox.sendKeys(prop.getProperty("username1"));
		
		reset.click();
	}
	
	public void gback() {
		cancel.click();
	}
}
