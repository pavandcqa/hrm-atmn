package listeners;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;

public class TestNgListener extends TestBase implements ITestListener{

	  public void onTestFailure(ITestResult tr) {
		  System.out.println("Test Failed...! " + tr.getName());
		  System.out.println("Executing Code based on Test Failure");
		  try {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File target = new File("Screenshots", tr.getName()+".png");
		  FileUtils.copyFile(src, target);
		  }
		  catch (Exception e) {
			e.printStackTrace();
		}
		  
	  }
	 
	  public void onTestSkipped(ITestResult tr) {
		  System.out.println("Test Skipped...! " + tr.getName());
		  System.out.println("Executing Code based on Test Skipped");
	  }
	 
	  public void onTestSuccess(ITestResult tr) {
		  System.out.println("Test Passed...! " + tr.getName());
		  System.out.println("Executing Code based on Test Passed/Success");
	  }

}
