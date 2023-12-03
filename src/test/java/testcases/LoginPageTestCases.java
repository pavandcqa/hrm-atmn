package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginPageTestCases extends TestBase{


	@Test
	public void verifyLogo() {
		
		Assert.assertTrue(lp.verifyLogoPresence(), "Company logo not present..");
	}
	
}
