package ui.pageobject;

import org.openqa.selenium.support.PageFactory;
import ui.driver.DriverManager;
import ui.element.FieldDecorator;
import utils.TestLogger;

public class BasePO {


    public BasePO() {
        PageFactory.initElements(new FieldDecorator(DriverManager.getDriver()), this);

    }

    public void info(String message) {
        TestLogger.info(message);
    }
}
