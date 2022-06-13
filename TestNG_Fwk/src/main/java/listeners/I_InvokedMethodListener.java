package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class I_InvokedMethodListener implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult result) {
		System.out.println("Before Invocation of: " + method.getTestMethod().getMethodName() + " " + "of Class: "
				+ result.getTestClass());
		// prints before the invocation of the name of method and class which contains the method

	}

	public void afterInvocation(IInvokedMethod method, ITestResult result) {
		System.out.println("After Invocation of: " + method.getTestMethod().getMethodName() + " " + "of Class: "
				+ result.getTestClass());
		// prints after the invocation of the name of method and class which contains the method

	}

}
