package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageObjects {
	
	public AdminPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "oxd-userdropdown-name")
	WebElement logoutMenu;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLink;
	
	
	@FindBy(xpath = "//div[@class=\"orangehrm-header-container\"]/button")
	WebElement add;
	
	public void clickLogoutMenu() {
		logoutMenu.click();
	}
	
	public void clickLogOutlink() {
		logoutLink.click();
	}
	
	public void clickAddButton() {
		add.click();
	}
}
