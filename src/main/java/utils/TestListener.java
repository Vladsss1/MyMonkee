package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {



    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);

    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
        AllureUtils.takeScreenshot(driver);
        this.onTestFailure(result);
    }

}