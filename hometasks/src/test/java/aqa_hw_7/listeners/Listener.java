package aqa_hw_7.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("-----Test with name " + result.getName() + " is starting");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("-----Test with name " + result.getName() + " was successful!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("-----Test with name " + result.getName() + "was failed");
    }
}
