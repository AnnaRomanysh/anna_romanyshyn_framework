package utils;

import io.restassured.RestAssured;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class APIListener implements ITestListener {
    private TestLogger log;
    private String testName;
    private String className;
    private String  packageName;
    private ByteArrayOutputStream request = new ByteArrayOutputStream();
    private ByteArrayOutputStream response = new ByteArrayOutputStream();

    private PrintStream requestVar = new PrintStream(request, true);
    private PrintStream responseVar = new PrintStream(response, true);

    public void onTestStart(ITestResult result) {
        log = TestLogger.getLogger(testName, className, packageName);
        log.info("Test: " +result.getClass() +" "+ result.getName() + " is started");

    }

    public void onTestSuccess(ITestResult result) {
        RestAssured.filters(new ResponseLoggingFilter(LogDetail.ALL, responseVar),
                new RequestLoggingFilter(LogDetail.ALL, requestVar));
        log.info("Test: "  +result.getClass() +" "+ result.getName() + " PASSED");
    }

    public void onTestFailure(ITestResult result) {
        logRequest(request);
        logResponse(response);
        log.error("Test: " +result.getClass() +" "+ result.getName() + " FAILED");
    }

    public void onTestSkipped(ITestResult result) {
        onTestSuccess(result);
        log.error("Test: " +result.getClass() +" "+ result.getName()+ " SKIPPED");
    }
    @Attachment(value = "request")
    public byte[] logRequest(ByteArrayOutputStream stream) {
        return attach(stream);
    }

    @Attachment(value = "response")
    public byte[] logResponse(ByteArrayOutputStream stream) {
        return attach(stream);
    }

    public byte[] attach(ByteArrayOutputStream log) {
        byte[] array = log.toByteArray();
        log.reset();
        return array;
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        log.error("Test: " +context.getClass() +" "+ context.getName() + "is finished");;
    }
}
