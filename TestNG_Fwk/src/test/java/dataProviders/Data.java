package dataProviders;

import org.testng.annotations.DataProvider;

public class Data {

	@DataProvider(name = "data")
	public Object[][] dp() {
		return new Object[][] { { "i3" }, { "i5" }, { "amd" } };
	}
}
