package ui.driver;

import enums.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestLogger;

import java.util.List;

public class DriverManager {
    private static DriverFactory drivers = new DriverFactory();
    private static WebDriver driver;
    private static final ThreadLocal<WebDriver> pool = new ThreadLocal<>();

    public static WebDriver getDriver() {
        TestLogger.info("Opening browser");
        return pool.get() != null ? pool.get() : setDriver();
    }

    public static WebDriver setDriver() {
        driver = drivers.getDriver();
        pool.set(driver);
        return driver;
    }


    public void quit() {
        TestLogger.info("Closing  browser");
        driver.quit();
    }

    public static void get(String url) {
        TestLogger.info("Go to URL: " + url);
        getDriver().get(url);
    }

    public static void maximize() {
        driver.manage().window().maximize();

    }

    public static WebElement findElement(By by) {
        return driver.findElement(by);

    }

    public static List<WebElement> findElements(By by) {
        return driver.findElements(by);

    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();

    }

    public static void close() {
        TestLogger.info("Closing current tab");
        driver.close();

    }

    public static String getTitle() {
        return driver.getTitle();

    }

    public static WebDriver.Options manage() {
        return driver.manage();

    }

    public static WebDriver.Navigation navigate() {
        return driver.navigate();

    }

    public static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();

    }

    public static Actions actions() {
        return new Actions(driver);
    }

    public static void takeScreenShot(String filePath){

    }

    public static Object executeScript(String script, Object... args) {
        return ((JavascriptExecutor) driver).executeScript(script, args);
    }

    public static void wait(int timeout, ExpectedCondition expectedCondition) {
        new WebDriverWait(driver, 60).until(expectedCondition);

    }


}
