package utils;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	public static ExtentReports reportInit() {
		return new ExtentReports("./outputs/Reports/ExtentReport.html", false);

	}

}
