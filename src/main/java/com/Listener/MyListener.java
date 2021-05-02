package com.Listener;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.jbk.base.TestBase;

public class MyListener extends TestBase implements ITestListener {
	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");

	public void onFinish(ITestContext result) {
		log.info("Testcase is complete with the name: " +result.getName());
		
	}

	public void onStart(ITestContext result) {
		log.info("Testcase is started with the name: " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.info("Testcase is finished with the name: " +result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		TestBase.log.info("Testcase is failed with the name: "+result.getName());
		TakesScreenshot ts = (TakesScreenshot)TestBase.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/screenshots/"+sdf.format(new Date())+".jpg";
		try{
			TestBase.log.info("Saving a screenshot for a failed testcase");
			FileUtils.copyFile(src, new File(path));
		}catch (Exception e) {
			TestBase.log.error("Screenshot is saved");
			TestBase.log.error(e.getClass().getName());
		}
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Testcase is skipped with the name: " +result.getName());
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
