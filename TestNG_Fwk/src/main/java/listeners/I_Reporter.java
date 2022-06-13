package listeners;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class I_Reporter implements IReporter {
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		IReporter.super.generateReport(xmlSuites, suites, outputDirectory);
		for (ISuite suite : suites) {

			String suiteName = suite.getName();
			// gets suite name

			Map<String, ISuiteResult> suiteResults = suite.getResults();
			// pairs with suite results

			for (ISuiteResult result : suiteResults.values()) {
				ITestContext context = result.getTestContext();
				// stores and provides test data across project

				System.out.println("Passed test cases of the suite: " + suiteName + " Number of testcases "
						+ context.getPassedTests().getAllResults().size());
				// prints number of passed test cases with the name of suite

				System.out.println("Failed test cases of the suite: " + suiteName + " Number of testcases "
						+ context.getFailedTests().getAllResults().size());
				// prints number of failed test cases with the name of suite

				System.out.println("Skipped test cases of the suite: " + suiteName + " Number of testcases "
						+ context.getSkippedTests().getAllResults().size());
				// prints number of passed test cases with the name of suite

			}

		}
	}

}
