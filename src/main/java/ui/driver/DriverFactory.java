package ui.driver;

import enums.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import parsers.PropertiesReader;
import ui.wait.Wait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


class DriverFactory {
    private static WebDriver driver;
    private static String browserName;
    private static PropertiesReader propertiesReader;
    private static String CONFIGURATIONS_PROP_PATH = "src//main//resources//driver.properties";

    public WebDriver getDriver() {
        return getDriver(Drivers.getDriverType(setBrowsername()));
    }

    public WebDriver getDriver(Drivers type) {
        if (driver == null) {
            switch (type) {
                case IE:
                    System.setProperty("webdriver.ie.driver", propertiesReader.getProperty("ieDriver"));
                    driver = new InternetExplorerDriver();
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", propertiesReader.getProperty("chromeDriver"));
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", propertiesReader.getProperty("firefoxDriver"));
                    driver = new FirefoxDriver();
                    break;
                case OPERA:
                    System.setProperty("webdriver.opera.driver", propertiesReader.getProperty("operaDriver"));
                    driver = new OperaDriver();
                    break;
            }

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    private static String setBrowsername() {
        propertiesReader = new PropertiesReader(CONFIGURATIONS_PROP_PATH);
        return browserName = propertiesReader.getProperty("browserName");
    }

    private static ChromeOptions setDriveroptions(){
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Nexus 5");
        ChromeOptions chromeOptions = new ChromeOptions();
      return   chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

    }
}

