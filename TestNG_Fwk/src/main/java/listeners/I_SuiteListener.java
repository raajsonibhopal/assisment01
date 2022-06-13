package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class I_SuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("onStart called before execution of " + suite.getName());
		// prints statement of execution with suite name 

	}

	public void onFinish(ISuite suite) {
		System.out.println("onFinish called after execution of " + suite.getName());
		// prints statement of execution with suite name 

	}
}
