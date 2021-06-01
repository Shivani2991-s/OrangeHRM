package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import Pages.ResetPage_O;
import TestBase.TestBase_O;

public class ResetTest_O extends TestBase_O {
	ResetPage_O FP;

	@BeforeSuite
	public void launch() {
		initialization();			//call static method of TestBase class
		FP = new ResetPage_O();		//to call all methods of LoginPage class
		
	}

	
	@Test(priority=1)
	public void forgetpass() {
		FP.forgetpass();
	}
@Test(priority=2)
public void forgetpassSet() {
	FP.forgetpassSet();
}

@Test(priority=3)
public void gback() {
	FP.gback();
}
@AfterSuite
public void terminate() {
	termination();
}
}
