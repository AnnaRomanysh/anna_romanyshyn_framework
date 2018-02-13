package ui.driver;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import parsers.PropertiesReader;

import java.util.List;


public class Driver {
    private static WebDriver driver;
    private static String browserName;
    private static PropertiesReader propertiesReader;
    private static String propertiesPath = "src//main//resources//driver.properties";


    private static String setBrowsername() {
        propertiesReader = new PropertiesReader(propertiesPath);
        return browserName = propertiesReader.getProperty("browserName");
    }

    public static WebDriver getDriver() {
        setBrowsername();
        if (driver == null) {
            switch (browserName.toLowerCase()) {
                case ("ie"):
                    System.setProperty("webdriver.ie.driver", propertiesReader.getProperty("ieDriver"));
                    driver = new InternetExplorerDriver();
                    break;
                case ("chrome"):
                    System.setProperty("webdriver.chrome.driver", propertiesReader.getProperty("chromeDriver"));
                    driver = new ChromeDriver();
                    break;
                case ("firefox"):
                    System.setProperty("webdriver.gecko.driver", propertiesReader.getProperty("firefoxDriver"));
                    driver = new FirefoxDriver();
                    break;
                case ("opera"):
                    System.setProperty("webdriver.opera.driver", propertiesReader.getProperty("operaDriver"));
                    driver = new OperaDriver();
                    break;
            }

        }
        driver.manage().window().maximize();
        return driver;
    }

    public void quit() {
        driver.quit();


    }

    public static void get(String url) {
        driver.get(url);

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
        driver.close();

    }

    public static String getTitle() {
        return driver.getTitle();

    }

    public static Options manage() {
        return driver.manage();

    }

    public static Navigation navigate() {
        return driver.navigate();

    }

    public static TargetLocator switchTo() {
        return driver.switchTo();

    }

    public static Actions actions() {
        return new Actions(driver);
    }
}
