package ui.wait;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.driver.DriverManager;
import ui.element.Element;
import ui.element.IElement;

import java.util.concurrent.TimeUnit;

public class WaitWrapper {



    public static void waitToBeClickable(int timeout, Element element){
        new WebDriverWait(DriverManager.getDriver(), timeout).until(ExpectedConditions.elementToBeClickable(element));

    }
    public static void waitToBeVisible(int timeout, Element element){
        new WebDriverWait(DriverManager.getDriver(), timeout).until(ExpectedConditions.visibilityOf(element));

    }
    public static void waitToBeVisible(int timeout, TimeUnit timeUnit){
        DriverManager.manage().timeouts().pageLoadTimeout(timeout, timeUnit);

    }
}
