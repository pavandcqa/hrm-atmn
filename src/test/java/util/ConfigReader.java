package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	File f;
	FileInputStream fis;
	Properties prop;
	
	public ConfigReader() {

		try {
			f = new File("./config.properties");
			fis = new FileInputStream(f);
			prop = new Properties();
			prop.load(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Properties file doesnot exits..");
		}
		
	}
	
	public String getAppUrl() {
		return prop.getProperty("appurl");
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getChromeKey() {
		return prop.getProperty("chromeBrowserKey");
	}
	
	public String getChromePath() {
		return prop.getProperty("chromeBrowserPath");
	}
	
	public String getFirefoxBrowserKey() {
		return prop.getProperty("firefoxBrowserKey");
	}
	
	public String getFirefoxBrowserPath() {
		return prop.getProperty("firefoxBrowserPath");
	}
	
	public String getUserName() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	


	public static void main(String[] args) {
		
		ConfigReader cr = new ConfigReader();
		
		System.out.println(cr.getAppUrl());
		System.out.println(cr.getBrowser());
		System.out.println(cr.getChromeKey());
		System.out.println(cr.getChromePath());
		System.out.println(cr.getFirefoxBrowserKey());
		System.out.println(cr.getFirefoxBrowserPath());
		System.out.println(cr.getUserName());
		System.out.println(cr.getPassword());
		
	}

}
