package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class AdminTestCases extends TestBase{
	
	@BeforeMethod(alwaysRun = true)
	public void login() {
		lp.login("Admin", "admin123");
		dp.clickAdminPage();
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		ap.clickLogoutMenu();
		ap.clickLogOutlink();
	}
	
	
	@Test(priority = 1, groups = {"smoke"})
	public void addUser() {
		
		ap.clickAddButton();
	}
	
	//@Test(priority = 2, groups = {"smoke"})
	public void searchUser() {
		
	}

}
