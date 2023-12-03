package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt=\"company-branding\"]") 
	WebElement logo;
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement login;
	
	public boolean verifyLogoPresence() {
		
		boolean status = logo.isDisplayed();
		return status;
	}
	
	public void setUserName(String uName) {
		userName.clear();
		userName.sendKeys(uName);
	}
	
	public void setPassword(String pwd) {
	    password.clear();
	    password.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void login(String usName, String passcode) {
		this.setUserName(usName);
		this.setPassword(passcode);
		this.clickLogin();
	}
	
}
