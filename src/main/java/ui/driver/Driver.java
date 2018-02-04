package ui.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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

    public Driver get(String url) {
        driver.get(url);
        return this;

    }

    public void maximize() {
        driver.manage().window().maximize();

    }

    public WebElement findElement(By by) {
        return driver.findElement(by);

    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);

    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();

    }

    public void close() {
        driver.close();

    }

    public String getTitle() {
        return driver.getTitle();

    }

    public Options manage() {
        return driver.manage();

    }

    public Navigation navigate() {
        return driver.navigate();

    }

    public TargetLocator switchTo() {
        return driver.switchTo();

    }
}
