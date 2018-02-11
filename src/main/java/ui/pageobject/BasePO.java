package ui.pageobject;

import org.openqa.selenium.support.PageFactory;
import ui.driver.Driver;
import utils.TestLogger;

public class BasePO {


    public BasePO() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void info(String message) {
        TestLogger.info(message);
    }
}
