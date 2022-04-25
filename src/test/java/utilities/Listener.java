package utilities;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        String tcName = tr.getMethod().getMethodName();
        String failReason = tr.getThrowable().getMessage();
        System.out.println("FAILED");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        String tcName = tr.getMethod().getMethodName();
        System.out.println("PASSED");
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        String tcName = tr.getMethod().getMethodName();
        String skipReason = tr.getThrowable().getMessage();
        System.out.println("SKIPPED");
    }
}
