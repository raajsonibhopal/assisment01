package base;

import org.testng.annotations.Test;

import abstracted.Report;
import dataProviders.Data;
import pages.Common;
import utils.ExtentReport;

public class BasePass extends Report {
	@Test(dataProvider = "data", dataProviderClass = Data.class)
	public void passing_method(String data) {
		report = ExtentReport.reportInit();
		logger = report.startTest("Passed cases");
		Common.searchProduct(data);
	}

}

