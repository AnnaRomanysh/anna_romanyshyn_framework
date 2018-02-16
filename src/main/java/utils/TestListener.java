package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;
import ui.driver.DriverManager;


public class TestListener implements ITestListener {
    private TestLogger log;
    private String testName;
    private String className;
    private String packageName;


    public void onTestStart(ITestResult result) {
        log = TestLogger.getLogger(testName, className, packageName);
        log.info("Test: " + result.getClass() + " " + result.getName() + " is started");
    }

    public void onTestSuccess(ITestResult result) {
        log.info("Test: " + result.getClass() + " " + result.getName() + " PASSED");
    }

    public void onTestFailure(ITestResult result) {
        takeScreenshot();
        log.error("Test: " + result.getClass() + " " + result.getName() + " FAILED");
    }

    public void onTestSkipped(ITestResult result) {
        log.error("Test: " + result.getClass() + " " + result.getName() + " SKIPPED");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        log.error("Test: " + context.getClass() + " " + context.getName() + "is finished");
        ;
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot)  DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);

    }

}
