package ui.wait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.driver.DriverManager;
import ui.element.Element;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Wait {
    private static final int ONE_SECOND = 1000;
    private static final int DEFAULT_TIMEOUT = 30;


    public static void waitForCondition(Callable<Boolean> callable, int timeout) {
        long beginTime = System.currentTimeMillis();
        boolean continueWaiting = true;
        while (continueWaiting && ((System.currentTimeMillis() - beginTime) < timeout * ONE_SECOND)) {
            {
                try {
                    if (callable.call()) {
                        continueWaiting = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public void waitForPageLoad() {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) DriverManager.getDriver()).executeScript("return document.readyState").equals("complete");
                    }
                };
        new WebDriverWait(DriverManager.getDriver(), DEFAULT_TIMEOUT).until(pageLoadCondition);
    }

    public static void waitToBeClickable(int timeout, Element element) {
        new WebDriverWait(DriverManager.getDriver(), timeout).until(ExpectedConditions.elementToBeClickable(element));

    }

    public static void waitToBeVisible(int timeout, Element element) {
        new WebDriverWait(DriverManager.getDriver(), timeout).until(ExpectedConditions.visibilityOf(element));

    }

    public static void waitToBeVisible(int timeout, TimeUnit timeUnit) {
        DriverManager.manage().timeouts().pageLoadTimeout(timeout, timeUnit);

    }


}
