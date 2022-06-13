package abstracted;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.Common;
import utils.Screenshot;

public class Report {
	public ExtentReports report;
	public ExtentTest logger;

	@AfterMethod
	public void afterMethod(ITestResult testresult) throws IOException {
		if (testresult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshot.takeScreenshotAs(Common.driver, testresult.getName());
			String imagePath = logger.addScreenCapture(path);
			logger.log(LogStatus.FAIL, testresult.getMethod().getMethodName(), imagePath);
		} else if (testresult.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, testresult.getMethod().getMethodName());
		} else {
			logger.log(LogStatus.PASS, testresult.getMethod().getMethodName());
		}

	}
	 

	@AfterClass
	public void classCleanUp() {
		report.endTest(logger);
		report.flush();

	}

	@BeforeClass
	public void beforeTest() throws IOException {
		Common.openURL();

	}
	
	@AfterMethod
	public void after_suite() {
		Common.driver.close();
	}
	
	@BeforeMethod
	public void afterMethod() {
		
		Common.driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS) ;
	}

}
