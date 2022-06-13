package base;

import org.testng.annotations.Test;

import abstracted.Report;
import dataProviders.Data;
import pages.Common;
import utils.ExtentReport;

public class BaseFail extends Report {
	@Test(dataProvider = "data", dataProviderClass = Data.class)
	public void failing_method(String data) {
		report = ExtentReport.reportInit();
		logger = report.startTest("Failed cases");

		Common.searchProductP(data);
	}

}
