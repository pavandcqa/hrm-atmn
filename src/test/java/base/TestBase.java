package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.AdminPageObjects;
import pageobjects.DashboardPage;
import pageobjects.LoginPageObjects;
import util.ConfigReader;

public class TestBase {

	protected static WebDriver driver;
	
	ConfigReader cr;
	protected LoginPageObjects lp;
	protected AdminPageObjects ap;
	protected DashboardPage dp;
	
	@BeforeMethod
	public void setupBrowser() {
		
		cr = new ConfigReader();

		if(cr.getBrowser().equals("chrome")) {
			System.setProperty(cr.getChromeKey(), cr.getChromePath());
			driver = new ChromeDriver();
		}
		else if (cr.getBrowser().equals("firefox")) {
			System.setProperty(cr.getFirefoxBrowserKey(), cr.getFirefoxBrowserPath());
			driver = new FirefoxDriver();
		} else {
			System.out.println("Failed to Initialize Browser");
		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(cr.getAppUrl());

		lp = new LoginPageObjects(driver);
		ap = new AdminPageObjects(driver);
		dp = new DashboardPage(driver);
	}
	
	@AfterMethod
	public void tearDown() {

		driver.close();
	}
	
}
